package com.mobileProject;

import com.MobileProject.utils.App;
import com.MobileProject.utils.Device;
import com.MobileProject.utils.Driver;
import com.MobileProject.utils.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected AppiumDriver<MobileElement> driver;
    protected WebDriverWait wait;
    @BeforeTest
    public void beforeTest(){
        driver = Utils.openApp(Device.Pixel2, App.ApiDemos);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,10);
    }

    @AfterTest
    public void afterTest(){
        driver.closeApp();
        Driver.stopAppiumService();
    }
}

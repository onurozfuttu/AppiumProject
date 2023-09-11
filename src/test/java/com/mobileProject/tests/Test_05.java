package com.mobileProject.tests;

import com.MobileProject.utils.App;
import com.MobileProject.utils.Device;
import com.MobileProject.utils.Driver;
import com.MobileProject.utils.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Test_05 {


    AppiumDriver<MobileElement> driver;
    WebDriverWait wait;

    By lTamam = By.id("android:id/button1");
    @Test
    public void test01() throws MalformedURLException {

        driver = Utils.openApp(Device.Pixel2,App.ApiDemos);
        wait = new WebDriverWait(driver,10);


        clickWithText("Continue");
        wait.until(ExpectedConditions.visibilityOfElementLocated(lTamam));
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");
        clickWithText("Accessibility");


        driver.closeApp();

        Driver.stopAppiumService();
    }

    void clickWithText(String text){
        driver.findElement(By.xpath("//*[@text='"+text+"']")).click();
    }
}

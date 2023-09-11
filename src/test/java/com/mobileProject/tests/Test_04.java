package com.mobileProject.tests;

import com.MobileProject.utils.App;
import com.MobileProject.utils.Device;
import com.MobileProject.utils.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Test_04 {


    AppiumDriver<MobileElement> driver;
    AppiumDriverLocalService service;
    Device device = Device.Pixel2;
    App app = App.ApiDemos;

    @Test
    public void test01() throws MalformedURLException, InterruptedException {

        Driver.runAppiumService();

        //driver

        driver = Driver.getDriver(Device.Pixel2,App.ApiDemos);

        //driver.findElement(By.xpath("//*[@text='Continue']")).click();
        clickWithText("Continue");
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//*[@text='OK']")).click();
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");
        clickWithText("Accessibility");

        Thread.sleep(2000);
        driver.closeApp();

        Driver.stopAppiumService();
    }

    void clickWithText(String text){
        driver.findElement(By.xpath("//*[@text='"+text+"']")).click();
    }
}

package com.mobileProject.tests;

import com.MobileProject.utils.App;
import com.MobileProject.utils.Device;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Test_03 {


    AppiumDriver<MobileElement> driver;
    AppiumDriverLocalService service;
    Device device = Device.Pixel2;
    App app = App.ApiDemos;

    @Test
    public void test01() throws MalformedURLException, InterruptedException {

        service = new AppiumServiceBuilder()
                .withIPAddress("127.0.0.1")
                //.usingPort(4723)
                .usingAnyFreePort()
                .build();

        //loglama yapmıyor
        service.clearOutPutStreams();

        service.start();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:udid",device.udid);
        capabilities.setCapability("appium:version",device.version);
        capabilities.setCapability("appium:deviceName",device.deviceName);
        capabilities.setCapability("platformName",device.platformName);

        capabilities.setCapability("appium:appPackage","com.touchboarder.android.api.demos");
        capabilities.setCapability("appium:appActivity","com.touchboarder.androidapidemos.MainActivity");

        //driver

        driver = new AndroidDriver<>(service.getUrl(),capabilities);

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

        service.stop();
    }

    void clickWithText(String text){
        driver.findElement(By.xpath("//*[@text='"+text+"']")).click();
    }
}

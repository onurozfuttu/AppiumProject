package com.mobileProject.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Test_01 {

    /**
     * {
     *   "appium:udid": "emulator-5554",
     *   "appium:version": "11",
     *   "appium:deviceName": "Pixel 2",
     *   "appium:realDevice": "false",
     *   "platformName": "Android",
     *   "appium:automationName": "uiautomator2"
     * }
     */
    AppiumDriver<MobileElement> driver;

    @Test
    public void test01() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:udid","emulator-5554");
        capabilities.setCapability("appium:version","11");
        capabilities.setCapability("appium:deviceName","Pixel 2");
        capabilities.setCapability("platformName","Android");

        capabilities.setCapability("appium:appPackage","com.touchboarder.android.api.demos");
        capabilities.setCapability("appium:appActivity","com.touchboarder.androidapidemos.MainActivity");

        //driver

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

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
    }

    void clickWithText(String text){
        driver.findElement(By.xpath("//*[@text='"+text+"']")).click();
    }
}

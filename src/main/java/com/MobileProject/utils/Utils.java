package com.MobileProject.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

public class Utils {

    static AppiumDriver<MobileElement> driver;

    public static AppiumDriver<MobileElement> openApp(Device device, App app) {
        Driver.runAppiumService();
        return Driver.getDriver(device, app);
    }

    public static void clickWithText(String text) {
        driver = Driver.getDriver();
        driver.findElement(By.xpath("//*[@text='" + text + "']")).click();
    }

    public static void swipeV(Double startPoint, Double endPoint) {
        driver = Driver.getDriver();
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;

        new TouchAction<>(driver)
                .press(PointOption.point(height/2, (int) (height*startPoint)))
                .moveTo(PointOption.point(width/2,(int) (height*endPoint)))
                .release()
                .perform();
    }

    public static void swipeUntil(By locator, Double startPoint, Double endPoint){
        driver = Driver.getDriver();
        while(driver.findElements(locator).size()<=0){
            swipeV(startPoint,endPoint);

            //implicty wait beklediği için yavaş olabilir

        }
    }

    public static void clickNumbers(String num){
        driver = Driver.getDriver();
        driver.findElement(By.xpath("//*[@content-desc='"+num+"']")).click();
    }

    public static void operators(String operator){
        driver = Driver.getDriver();
        driver.findElement(By.xpath("//*[@content-desc='"+operator+"']")).click();
    }
}

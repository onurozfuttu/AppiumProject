package com.mobileProject.tests;

import com.MobileProject.utils.Utils;
import com.mobileProject.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Test_07 extends TestBase {
    By lTamam = By.id("android:id/button1");

    By lWebView = By.xpath("//*[@text='WebView']");

    @Test
    public void test01() throws MalformedURLException {
        Utils.clickWithText("Continue");
        wait.until(ExpectedConditions.visibilityOfElementLocated(lTamam));
        Utils.clickWithText("OK");
        Utils.clickWithText("OK");
        Utils.clickWithText("API Demos");
        Utils.clickWithText("Accessibility");

        driver.navigate().back();

        Utils.clickWithText("Views");

        //%80 den başla, %20 ye kadar yukarı çek
        Utils.swipeV(.8,.2);
        //aşağıya kaydırır
        //Utils.swipeV(.2,.8);

    }

    @Test
    public void test02() throws MalformedURLException {
        Utils.clickWithText("Continue");
        wait.until(ExpectedConditions.visibilityOfElementLocated(lTamam));
        Utils.clickWithText("OK");
        Utils.clickWithText("OK");
        Utils.clickWithText("API Demos");
        Utils.clickWithText("Accessibility");

        driver.navigate().back();

        Utils.clickWithText("Views");

        Utils.swipeUntil(lWebView,.8,.2);
        Utils.clickWithText("WebView");

    }


}

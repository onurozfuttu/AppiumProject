package com.mobileProject.mobileWeb;

import com.MobileProject.utils.WebDriverMobile;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MobileChromeTest {
    WebDriver driver= WebDriverMobile.getDriver();

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.krafttechexlab.com/login");
        System.out.println(driver.getTitle());

        driver.findElement(By.id("email")).sendKeys("mgezer@gmail.com");
        driver.findElement(By.id("yourPassword")).sendKeys("Mg12345678"+ Keys.TAB+Keys.ENTER);

        Thread.sleep(3000);

        WebDriverMobile.closeDriver();

    }
}

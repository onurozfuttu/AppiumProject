package com.mobileProject.cucumber;

import com.MobileProject.utils.App;
import com.MobileProject.utils.Device;
import com.MobileProject.utils.Driver;
import com.MobileProject.utils.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.List;

public class CalStepdefs {
    AppiumDriver<MobileElement> driver;
    @Given("The user is on the start page")
    public void theUserIsOnTheStartPage() {
        driver= Utils.openApp(Device.Pixel2, App.Calculator);
    }

    @When("The user sum of following numbers")
    public void theUserSumOfFollowingNumbers(List<String> numbers) {
        Utils.clickNumbers(numbers.get(0));
        Utils.operators("plus");
        Utils.clickNumbers(numbers.get(1));
        Utils.operators("plus");
        Utils.clickNumbers(numbers.get(2));
        Utils.operators("equals");


    }

    @Then("The result should be {int}")
    public void theResultShouldBe(int result) {
        String actual = Driver.getDriver().findElement(By.id("com.google.android.calculator:id/result_final")).getText();
        Assert.assertEquals(Integer.parseInt(actual),result);
        driver.closeApp();
    }
}

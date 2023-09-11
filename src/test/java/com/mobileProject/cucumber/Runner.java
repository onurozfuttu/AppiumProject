package com.mobileProject.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/mobileProject/cucumber/calculator.feature",
        glue = "com/mobileProject/cucumber"

)

public class Runner extends AbstractTestNGCucumberTests {

}

package org.example;

import org.openqa.selenium.By;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

public class RegisterPage extends Utils
{
    public void enterRegistrationDetails()
    {   //timestamp for current time - to create unique email value each time we run the program
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//      driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        //wait for clickable element
        waitForClickable(By.id("register-button"),5000);
//      waitForElementToBeVisible(By.xpath("//div[contains(text(),'FirstName']"),50);
//      sleep(5000);
        //click on Male or Female button
        clickOnElement(By.id("gender-male"));
        //Type FirstName
        enterText(By.id("FirstName"),"Boris");
        //Type LastName
        enterText(By.id("LastName"),"Johnson");
        //Select Day of Date of Birth
        selectFromDropdownByValue(By.name("DateOfBirthDay"),"15");
        //Select Month of Birth
        selectFromDropdownByVisibleText(By.name("DateOfBirthMonth"),"April");
        //Select Year of Birth
        selectFromDropdownByIndex(By.name("DateOfBirthYear"),59);
        //Type Email address
        enterText(By.id("Email"),"borisjohnson"+timestamp.getTime()+"@gmail.com");
        //Type Company name
        enterText(By.name("Company"),"Conservative Plc.");
        //Type Password
        enterText(By.name("Password"),"112233");
        //Confirm Password
        enterText(By.name("ConfirmPassword"),"112233");
        //Click on Register
        clickOnElement(By.id("register-button"));
    }
}

package org.example;

import org.openqa.selenium.By;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

public class RegisterPage extends Utils
{   LoadProperty loadProperty = new LoadProperty();
    private By _radioButton = By.id("gender-male");
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _dateOfBirth = By.name("DateOfBirthDay");
    private By _monthOfBirth = By.name("DateOfBirthMonth");
    private By _yearOfBirth = By.name("DateOfBirthYear");
    private By _email = By.id("Email");
    private By _companyName = By.name("Company");
    private By _password = By.name("Password");
    private By _confirmPassword = By.name("ConfirmPassword");
    private By _clickOnRegister = By.id("register-button");
    public void enterRegistrationDetails()
    {   //timestamp for current time - to create unique email value each time we run the program
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        //wait for clickable element
//      waitForClickable(By.id("register-button"),5000);
//      waitForElementToBeVisible(By.xpath("//div[contains(text(),'FirstName']"),50);
        sleep(5000);
        //click on Male or Female button
        clickOnElement(_radioButton);
        //Type FirstName
        enterText(_firstName,loadProperty.getProperty("firstName"));
        //Type LastName
        enterText(_lastName, loadProperty.getProperty("lastName"));
        //Select Day of Date of Birth
        selectFromDropdownByValue(_dateOfBirth, loadProperty.getProperty("dateOfBirth"));
        //Select Month of Birth
        selectFromDropdownByVisibleText(_monthOfBirth, loadProperty.getProperty("monthOfBirth"));
        //Select Year of Birth
        selectFromDropdownByValue(_yearOfBirth,loadProperty.getProperty("yearOfBirth"));
        //Type Email address
        enterText(_email,loadProperty.getProperty("email")+timestamp.getTime()+"@gmail.com");
        //Type Company name
        enterText(_companyName,loadProperty.getProperty("companyName"));
        //Type Password
        enterText(_password,loadProperty.getProperty("password"));
        //Confirm Password
        enterText(_confirmPassword,loadProperty.getProperty("confirmPassword"));
        //Click on Register
        clickOnElement(_clickOnRegister);
    }
}

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Utils extends BasePage
{   //method for clickOnElement
    public static void clickOnElement (By by)
    {
        driver.findElement(by).click();
    }
    //method for enterText
    public static void enterText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }
    //method for selectFromDropdownByVisibleText
    public static void selectFromDropdownByVisibleText (By by, String text)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    //method for selectFromDropdownByIndex
    public static void selectFromDropdownByIndex (By by, int index)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }
    //method for selectFromDropdownByValue
    public static void selectFromDropdownByValue(By by, String text)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }
    //method for getSelectedTextFromDropdown
    public static String getSelectedTextFromDropdown(By by)
    {
        Select select = new Select(driver.findElement(by));
        return select.getFirstSelectedOption().getText();
    }
    //method for getting currency symbol
    public static String getCurrencySymbol(String currencyName)
    {
        String currencySymbol = null;
        switch (currencyName)
        {
            case "US Dollar":
                currencySymbol = "$";
                break;
            case "Euro":
                currencySymbol = "€";
                break;
            default:
                System.out.println("Currency is not recognised");
        }
        return currencySymbol;
    }
    //method for getTextFromElement
    public static String getTextFromElement(By by)
        {
      return   driver.findElement(by).getText();
    }
    //method for timestamp
    public static String timeStamp(By by)
    {
        return  driver.findElement(by).getText();
    }
    //method for waitForClickable
    public static void waitForClickable(By by,int time)
    {
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    //method for waifForElementToBeVisible
    public static void waitForElementToBeVisible(By by,int time)
    {
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    //method for list
    public static void list(By by)
    {
        List<WebElement> productList = driver.findElements(by);
        for (WebElement element: productList)
        {
            System.out.println(element.getText());
        }
    }
    //method for Thread.sleep
    public static void sleep(int time)
    {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

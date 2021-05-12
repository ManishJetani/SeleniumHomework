package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utils
{
    public void clickOnRegisterButton()
    {
        //click on Register button
        clickOnElement(By.linkText("Register"));
    }
    public void clickOnCurrencyField()
    {   //selecting currency
        selectFromDropdownByVisibleText(By.id("customerCurrency"),"Euro");
        //locating all available product's price with currency
        List<WebElement> featuredProductList = driver.findElements(By.xpath("//span[@class='price actual-price']"));
        //Printing Price of product with currency
        for (WebElement element :featuredProductList)
        {
            System.out.println(element.getText());
        }
        System.out.println();
        //selecting currency
        selectFromDropdownByVisibleText(By.id("customerCurrency"),"US Dollar");
        //locating all available product's price with currency
        List<WebElement> featuredProductList1 = driver.findElements(By.xpath("//span[@class='price actual-price']"));
        //Printing Price of product with currency
        for (WebElement element :featuredProductList1)
        {
            System.out.println(element.getText());
        }
    }
    public void typeInSearchField()
    {   //typing product name
        enterText(By.id("small-searchterms"),"Nike");
        //clicking on Search
        clickOnElement(By.xpath("//button[@type='submit']"));
    }
    public void addToCartButtonShouldBePresent()
    {   //clicking on product category
        clickOnElement(By.linkText("Computers"));

    }
    public void commentAddedWithTitleAndComment()
    {   //clicking on title
        clickOnElement(By.linkText("New online store is open!"));
    }


}

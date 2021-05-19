package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utils
{   LoadProperty loadProperty = new LoadProperty();
    private By _clickOnRegister = By.linkText("Register");
    private By _currencyName = By.id("customerCurrency");
    private By _listOfPrice = By.xpath("//span[@class='price actual-price']");
    private By _searchTerm = By.id("small-searchterms");
    private By _clickOnSearch = By.xpath("//button[@type='submit']");
    private By _clickOnComputer = By.linkText("Computers");
    private By _clickOnTitle = By.linkText("New online store is open!");

    public void clickOnRegisterButton()
    {
        //click on Register button
        clickOnElement(_clickOnRegister);
    }
    public void verifyCurrencySymbolFromEachPrice()
    {   //getting name of currency selected
        String currencyNameSelected = getSelectedTextFromDropdown(_currencyName);
        //getting currency symbol
        String expectedCurrencySymbol = getCurrencySymbol(currencyNameSelected);
        //list of product price
        List<WebElement> priceList = driver.findElements(_listOfPrice);
        //item list
        for (WebElement element : priceList)
        {
            String actualCurrencySymbol = element.getText().substring(0,1);
            //asserting actual currency symbol with expected currency symbol
            Assert.assertEquals(actualCurrencySymbol,expectedCurrencySymbol,"Actual currency symbol not matching with expected currency symbol");
        }
        //printing output
        System.out.println("Currency Verified successfully:" + currencyNameSelected +" as " + expectedCurrencySymbol);
    }
    public void clickOnCurrencyField()
    {   //selecting currency
        selectFromDropdownByVisibleText(_currencyName,loadProperty.getProperty("currency"));
    }
    public void typeInSearchField()
    {   //typing product name
        enterText(_searchTerm,loadProperty.getProperty("searchTerm"));
        //clicking on Search
        clickOnElement(_clickOnSearch);
    }
    public void addToCartButtonShouldBePresent()
    {   //clicking on product category
        clickOnElement(_clickOnComputer);

    }
    public void commentAddedWithTitleAndComment()
    {   //clicking on title
        clickOnElement(_clickOnTitle);
    }


}

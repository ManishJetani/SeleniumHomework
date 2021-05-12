package org.example;

import org.testng.annotations.Test;


public class TestSuite extends BaseTest
{   //Creating object
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    SeachNike seachNike = new SeachNike();
    NewOnlinePage newOnlinePage = new NewOnlinePage();
    ComputerPage computerPage = new ComputerPage();
    SoftwarePage softwarePage = new SoftwarePage();
    @Test
    public void userShouldBeAbleToRegisterSuccessfully()
    {
       //click on register button
        homePage.clickOnRegisterButton();
        //enter registration details
        registerPage.enterRegistrationDetails();
        //verify registration success message
        registerResultPage.verifyRegisterMessage();

    }
    @Test
    public void userShouldBeAbleToChangeTheCurrency()

    {   //click on currency field
        homePage.clickOnCurrencyField();
    }
    @Test
    public void userShouldBeAbleToSearchProductSuccessfully()
    {   //typing name in search field
        homePage.typeInSearchField();
        //clicking search button after typing product name
        seachNike.searchNikeName();
    }
    @Test
    public void addToCartButtonShouldBePresentInAllProduct()

    {   //checking add to cart button is present or not
        homePage.addToCartButtonShouldBePresent();
        //clicking on software
        computerPage.clickOnSoftware();
        //checking add to cart button is present
        softwarePage.addToCartButtonLocation();
    }
    @Test
    public void commentMessageAddedSuccessfully()
    {   //clicking on title
        homePage.commentAddedWithTitleAndComment();
        //typing title and comment
        newOnlinePage.typeComment();
        //checking comment added successfully
        registerResultPage.verifyCommentAddedSuccessfully();
        //checking comment added in comments section
        registerResultPage.verifyCommentPresentInComments();
    }


}

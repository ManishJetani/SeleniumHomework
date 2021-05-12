package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils{

    public void verifyRegisterMessage()
    {   //to verify actual result with expected result
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='result']")),"Your registration completed","Your registration not successful");
        //message print
        System.out.println("Your registration completed");
    }
    public void verifyCommentAddedSuccessfully()
    {   //to verify comment added successfully
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='result']")),"News comment is successfully added.","Comment not added successfully");
        System.out.println("New comment is successfully added.");
    }
    public void verifyCommentPresentInComments()
    { waitForClickable(By.id("newsletter-email"),5000);
//  sleep(5000);
    //locating comment
    boolean productDisplayed = driver.findElement(By.xpath("//div[@class='comment-content']")).isDisplayed();
    //asserting comment is displayed or not
    Assert.assertTrue(productDisplayed,"Comments are not displayed");
    System.out.println("Comments are displayed");
    //locating comment
    boolean productDisplayed1 = driver.findElement(By.xpath("//span[@class='stat-value']")).isDisplayed();
    //asserting comment is displayed or not
    Assert.assertTrue(productDisplayed1,"Comments are not displayed");
    System.out.println("Last Comments displayed");
//        Assert.assertEquals(getTextFromElement(By.linkText("Nice Store")),"Nice Store","Title of comment not expected");
//        System.out.println("Title of comment added successfully");
//        Assert.assertEquals(getTextFromElement(By.linkText("Very Good Store and Product is worth the money as well")),"Very Good Store and Product is worth the money as well","Comment not as expected");
//        System.out.println("Comment added successfully");
    }
}

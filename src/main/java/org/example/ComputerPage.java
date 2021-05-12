package org.example;

import org.openqa.selenium.By;

public class ComputerPage extends Utils
{public void clickOnSoftware ()
{   //adding wait for element to load
    waitForClickable(By.id("newsletter-subscribe-button"),5000);
//    sleep(5000);
    //clicking on sub category software
    clickOnElement(By.xpath("//ul[@class='sublist']/li[3]/a"));
}
}

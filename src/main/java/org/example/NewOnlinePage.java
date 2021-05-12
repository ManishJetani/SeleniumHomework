package org.example;

import org.openqa.selenium.By;

public class NewOnlinePage extends Utils
{
    public void typeComment()
    {   waitForClickable(By.id("newsletter-email"),5000);
//        sleep(5000);
        //entering comment title
        enterText(By.xpath("//input[@class='enter-comment-title']"),"Nice Store");
        //entering comment
        enterText(By.id("AddNewComment_CommentText"),"Very Good Store and Product is worth the money as well");
        waitForClickable(By.id("newsletter-email"),5000);
//        sleep(5000);
        //clicking on new comment button
        clickOnElement(By.xpath("//button[@name='add-comment']"));
    }

}

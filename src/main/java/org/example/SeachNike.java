package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeachNike extends Utils
{
    public void searchNikeName()
    {   //finding word Nike from list
        list(By.xpath("//h2[@class='product-title']"));
    }

}

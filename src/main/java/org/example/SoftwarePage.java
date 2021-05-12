package org.example;

import com.sun.deploy.security.SelectableSecurityManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class SoftwarePage extends Utils
{public void addToCartButtonLocation()
    {  //printing product name
//       list(By.xpath("//h2[@class='product-title']"));
//       list(By.xpath("//button[@class='button-2 product-box-add-to-cart-button']"));
        ArrayList<String> list = new ArrayList<>();
          list.add("list(By.xpath(\"//h2[@class='product-title']\"))");
       for(String s : list)
        {
            s.contains("add to cart");
       }

//            if (getTextFromElement(By.xpath("//button[@class='button-2 product-box-add-to-cart-button']")).contains("//button[@class='button-2 product-box-add-to-cart-button']"))
//        if(getTextFromElement(By.xpath("//button[@class='button-2 product-box-add-to-cart-button']")).contains("Add to cart"))
//        {
//            System.out.println();
//        }
//        else
//        {
//            System.out.println(getTextFromElement(By.xpath("//h2[@class='product-title']")).contains("Add to cart"));
//        }
}}

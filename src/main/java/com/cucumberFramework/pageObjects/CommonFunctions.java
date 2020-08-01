package com.cucumberFramework.pageObjects;

import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonFunctions {

    @Inject
    WebDriver driver;

    public void clickElement(String elementxpath){

       driver.findElement(By.xpath(elementxpath)).click();
    }

    public void inputText(String elementxpath,String inputText){

        driver.findElement(By.xpath(elementxpath)).sendKeys(inputText);
    }
}

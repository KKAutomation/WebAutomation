package com.cucumberFramework.pageObjects;

import com.cucumberFramework.testBase.TestBase;
import org.openqa.selenium.By;

public class Adminpage extends TestBase {

    public void navigateToAdminModule() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.xpath("(//a[.=\"More info \"])[2]")).click();

    }

    public boolean isAdminpage(){
        return driver.findElement(By.xpath("//span[.=\"Organization\"]")).isDisplayed();
    }






}

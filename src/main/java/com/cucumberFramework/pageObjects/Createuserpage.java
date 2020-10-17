package com.cucumberFramework.pageObjects;

import com.cucumberFramework.testBase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Createuserpage extends TestBase {


    public void navigateCreateuser() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[.=\"User Creation\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[.=\"Create User\"]")).click();

    }

    public void selectEmployeename() {
        Select Ename = new Select(driver.findElement(By.id("ContentPlaceHolder1_Dropempname")));
        //Ename.selectByValue(9);
        Ename.selectByVisibleText("Dr GOURAV SAHA EM0004");
    }

    public void inputUserName() {
        driver.findElement(By.id("ContentPlaceHolder1_txtusername")).sendKeys("ABCD");

    }

    public void inputPassword() {
        driver.findElement(By.id("ContentPlaceHolder1_txtpassword")).sendKeys("Abcd123");
    }

    public void inputconfirmPassword() {
        driver.findElement(By.id("ContentPlaceHolder1_txtcnfrmpassword")).sendKeys("Abcd123");
    }

    public void setAccessPermission(String option) {
        if (option.equalsIgnoreCase("edit")) {
            driver.findElement(By.id("ContentPlaceHolder1_CheckBoxList1_0")).click();
        }

        if (option.equalsIgnoreCase("delete")) {
            driver.findElement(By.id("ContentPlaceHolder1_CheckBoxList1_1")).click();
        }

        if (option.equalsIgnoreCase("both")) {
            driver.findElement(By.id("ContentPlaceHolder1_CheckBoxList1_0")).click();
            driver.findElement(By.id("ContentPlaceHolder1_CheckBoxList1_1")).click();
        }

    }

    public void setAccessModule(String modulename) {

        if (modulename.contains("ADMIN")) {
            driver.findElement(By.id("ContentPlaceHolder1_CheckBoxList2_0")).click();
        }
        if (modulename.contains("ACCOUNTS")) {
            driver.findElement(By.id("ContentPlaceHolder1_CheckBoxList2_1")).click();
        }

        if (modulename.contains("LAB")) {
            driver.findElement(By.id("ContentPlaceHolder1_CheckBoxList2_2")).click();
        }
        if (modulename.contains("NURSE")) {
            driver.findElement(By.id("ContentPlaceHolder1_CheckBoxList2_3")).click();
        }


    }

    public void selectStatus() {
        Select status1 = new Select(driver.findElement(By.id("ContentPlaceHolder1_dropstatus")));
        status1.selectByVisibleText("ACTIVE");
    }

    public void clickCreate() {
        driver.findElement(By.id("ContentPlaceHolder1_btncreate")).click();
    }
}
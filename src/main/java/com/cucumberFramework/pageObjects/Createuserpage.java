package com.cucumberFramework.pageObjects;

import com.cucumberFramework.testBase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Createuserpage extends TestBase {


    public void navigateCreateuser() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[.=\"User Creation\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[.=\"Create User\"]")).click();

    }

    public void selectEmployeename(String empName) {
        Select Ename = new Select(driver.findElement(By.id("ContentPlaceHolder1_Dropempname")));
        //Ename.selectByValue(9);
        Ename.selectByVisibleText(empName);
    }

    public void inputUserName(String userName) {
        driver.findElement(By.id("ContentPlaceHolder1_txtusername")).sendKeys(userName);

    }

    public void inputPassword(String password) {
        driver.findElement(By.id("ContentPlaceHolder1_txtpassword")).sendKeys(password);
    }

    public void inputconfirmPassword(String confirmpwd) {
        driver.findElement(By.id("ContentPlaceHolder1_txtcnfrmpassword")).sendKeys(confirmpwd);
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

    public void selectStatus(String staus) {
        Select status1 = new Select(driver.findElement(By.id("ContentPlaceHolder1_dropstatus")));
        status1.selectByVisibleText("ACTIVE");
    }

    public void clickCreate() {
        driver.findElement(By.id("ContentPlaceHolder1_btncreate")).click();
    }


    public boolean userAlreadyInuse() {

        boolean displayed = true;
        WebDriverWait wait = new WebDriverWait(driver, 300 /*timeout in seconds*/);
        if (wait.until(ExpectedConditions.alertIsPresent()) == null) {
            System.out.println("User creation is sucessful");
            displayed = false;
        } else {
            System.out.println("alert was present");
            driver.switchTo().alert().getText().contains("already in use");
            System.out.println("User creation is Failed");
            displayed = true;
        }
        return displayed;
    }

}
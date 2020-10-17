package com.cucumberFramework.pageObjects;

import com.cucumberFramework.testBase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;

public class HMS_logonPage extends TestBase {
    @FindBy(xpath = "//img[@alt='enext']")
    private WebElement logo;


    @FindBy(xpath = "//i[.='Financial Year ']")
    private WebElement Fyear;

    @FindBy(xpath = "//i[.='User Name ']")
    private WebElement userName;

    @FindBy(xpath = "//i[.='Password ']")
    private WebElement pwd;

    @FindBy(id = "ddlFin")
    private WebElement finyearselect;

    @FindBy(id = "ddlUser")
    private WebElement usernameselect;

    @FindBy(id = "txtPwd")
    private WebElement pwdselect;

    @FindBy(id = "btnLogin")
    private WebElement logonbtn;

    @FindBy(xpath = "(//i)[4]")
    private WebElement footer;

    public void openHomepage(){
        driver.get("http://demohms.finatma.in:1019/MMMaster/Login ");

    }


    public void selectFyear(String financialyr) {
        Select Fyear1 = new Select(driver.findElement(By.id("ddlFin")));
        Fyear1.selectByVisibleText(financialyr);
        System.out.println("test");
    }

    public void selectUsername(String userName){

        Select Fyear1 = new Select(driver.findElement(By.id("ddlUser")));
        Fyear1.selectByVisibleText(userName);
    }


    public void selectPwd(String password){
        driver.findElement(By.id("txtPwd")).sendKeys(password);

    }

    public void clicklogon(){

        driver.findElement(By.id("btnLogin")).click();
    }
    public boolean isLandingpage(){
        boolean status  =driver.findElement(By.xpath("//span[.=\"Hospital Management System\"]")).isDisplayed();
        return status;
    }


}


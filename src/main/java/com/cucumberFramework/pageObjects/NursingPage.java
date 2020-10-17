package com.cucumberFramework.pageObjects;

import com.cucumberFramework.testBase.TestBase;
import org.openqa.selenium.By;

public class NursingPage extends TestBase {


    public void navigatetolandingpage() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.xpath("(//a[.=\"More info \"])[7]")).click();
    }

    public boolean isNursingPage() {

        return driver.findElement(By.xpath("//span[.='Nursing']")).isDisplayed();
    }

    public void expandTransaction() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.xpath("//span[.='Transaction']")).click();
    }

    public boolean isTransactionavailable(String option) {
        boolean displayed = false;

        switch (option) {
            case "IP Doctor Charges":
                displayed = driver.findElement(By.xpath("//span[.=\"IP Doctor Charges\"]")).isDisplayed();
                break;

            case "IP Other Charges":
                displayed = driver.findElement(By.xpath("//span[.=\"IP Other Charges\"]")).isDisplayed();
                break;

            case "Doctor's Note":
                displayed = driver.findElement(By.xpath("//span[.=\"Doctor's Note\"]")).isDisplayed();
                break;
            case "OT Concent Form":
                displayed = driver.findElement(By.xpath("//span[.=\"OT Concent Form\"]")).isDisplayed();
                break;

            case "Progress Report":
                displayed = driver.findElement(By.xpath("//span[.=\"Progress Report\"]")).isDisplayed();
                break;

            case "Infant Entry":
                displayed = driver.findElement(By.xpath("//span[.=\"Infant Entry\"]")).isDisplayed();
                break;
            case "E_prescription":
                displayed = driver.findElement(By.xpath("//span[.=\"E_prescription\"]")).isDisplayed();
                break;



        }
return  displayed;

    }
    public void navigateToIPDoctorChargePage(){
        driver.findElement(By.xpath("//span[.=\"IP Doctor Charges\"]")).click();
    }
    public boolean isIPDoctorChargesAvailable(){
        boolean doctorPage=driver.findElement(By.xpath("//u")).isDisplayed();
        return doctorPage;
    }
    public void enterIPNo(String IPNO){
        switch(IPNO){
            case "IP7603":
                driver.findElement(By.xpath("//input[@id=\"ContentPlaceHolder1_txtip\"]")).sendKeys(IPNO);
                break;
            case "IP8000":
                driver.findElement(By.xpath("//input[@id=\"ContentPlaceHolder1_txtip\"]")).sendKeys(IPNO);
                break;
        }
    }
    public void clickOnShow(){

        driver.findElement(By.xpath("//input[@id=\"ContentPlaceHolder1_btnshow\"]")).click();
    }
    public void isBedDisplaying(){
        boolean bed=driver.findElement(By.xpath("(//label)[3]")).isDisplayed();
        if (bed= true){
            System.out.println("Valid IP NO");
        }
        else{
            System.out.println("Invalid IP address");
        }

    }
}

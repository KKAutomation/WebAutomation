package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.pageObjects.HMS_logonPage;
import com.cucumberFramework.pageObjects.NursingPage;
import com.cucumberFramework.pageObjects.Readexcel;
import com.cucumberFramework.testBase.TestBase;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;

public class NursingStepdef extends TestBase {
    HMS_logonPage hms_logonPage =new HMS_logonPage();
    NursingPage nursingPage = new NursingPage();
    Readexcel readxls=new Readexcel();



    @When("^user login to HMS system$")
    public void userLoginToHMSSystem() throws IOException, InvalidFormatException {
        readxls.readExcel();

        hms_logonPage.openHomepage();
        hms_logonPage.selectFyear("2020-2021");
        hms_logonPage.selectUsername("KH-ADMIN");
        hms_logonPage.selectPwd("ZEM@#$123");
        hms_logonPage.clicklogon();
    }


    @And("^Navigate to Nursing Module$")
    public void navigateToNursingModule() throws InterruptedException {
        nursingPage.navigatetolandingpage();




    }

    @Then("^User should able to see Nursing Home page$")
    public void userShouldAbleToSeeNursingHomePage() {
        Assert.assertTrue(nursingPage.isNursingPage());

    }

    @And("^Expand the Transaction$")
    public void expandTheTransaction() throws InterruptedException {
        nursingPage.expandTransaction();

    }

    @Then("^home screen should displayed \"([^\"]*)\"$")
    public void homeScreenShouldDisplayed(String option) throws Throwable {
        Assert.assertTrue(nursingPage.isTransactionavailable(option));
    }

    @And("^Click on IP Doctor Charges$")
    public void clickOnIPDoctorCharges() {
nursingPage.navigateToIPDoctorChargePage();
    }

    @Then("^User should be able to display Charges For Doctors$")
    public void userShouldBeAbleToDisplayChargesForDoctors() {
        Assert.assertTrue(nursingPage.isIPDoctorChargesAvailable());
    }

    @And("^enter  IP NO$")
    public void enterIPNO(String IPNO) {
        nursingPage.enterIPNo(IPNO);
    }

    @And("^click on show button$")
    public void clickOnShowButton() {
        nursingPage.clickOnShow();
    }

    @Then("^user should be able to view patient details as BED$")
    public void userShouldBeAbleToViewPatientDetailsAsBED() {
        nursingPage.isBedDisplaying();

    }


}

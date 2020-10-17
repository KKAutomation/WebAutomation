package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.pageObjects.HMS_logonPage;
import com.cucumberFramework.testBase.TestBase;
import com.google.inject.Inject;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Sunilpagedef extends TestBase {
    @Inject
    HMS_logonPage logonPage = new HMS_logonPage();


    @When("^user open HMS Application by entering \"([^\"]*)\"$")
    public void userOpenHMSApplicationByEntering(String url) throws Throwable {
        driver.get(url);

    }

    @And("^select financial year as \"([^\"]*)\"$")
    public void selectFinancialYearAs(String finacialyear) {

        if (!finacialyear.equalsIgnoreCase("BLANK")) {
            logonPage.selectFyear(finacialyear);
        }

    }

    @And("^Select user name as \"([^\"]*)\"$")
    public void selectUserNameAs(String username) throws Throwable {


        if (!username.equalsIgnoreCase("BLANK")) {
            logonPage.selectUsername(username);
        }


    }

    @And("^Fill the password \"([^\"]*)\"$")
    public void fillThePassword(String password) throws Throwable {
        if (!password.equalsIgnoreCase("BLANK")) {
            logonPage.selectPwd(password);
        }
    }

    @And("^Click on login button$")
    public void clickOnLoginButton() {
        logonPage.clicklogon();
    }


    @Then("^we should see the homepage$")
    public void weShouldSeeTheHomepage() {

    }

    @Then("^user should able to see \"([^\"]*)\"$")
    public void userShouldAbleToSee(String outcome) throws Throwable {
        switch (outcome) {

            case "homepage":
                boolean landigpageDisplayed = logonPage.isLandingpage();
                Assert.assertTrue(landigpageDisplayed);
                break;
            case "ERRORMSG":
                System.out.println("yet to implement ");
        }
    }
    }

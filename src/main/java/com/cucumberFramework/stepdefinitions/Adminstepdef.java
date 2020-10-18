package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.pageObjects.Adminpage;
import com.cucumberFramework.pageObjects.Createuserpage;
import com.cucumberFramework.testBase.TestBase;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Adminstepdef extends TestBase {
    Adminpage adminpage = new Adminpage();
    Createuserpage createuserpage = new Createuserpage();


    @And("^Navigate to Admin Module$")
    public void navigateToAdminModule() throws InterruptedException {
        Thread.sleep(10000);
//        driver.findElement(By.xpath("\"(//a[.=\\\"More info \\\"])[2]\"")).click();
        driver.findElement(By.xpath("(//*[@class=\"svg-inline--fa fa-arrow-circle-right fa-w-16\"])[2]")).click();
    }

    @Then("^validate the admin page$")
    public boolean validateTheAdminPage() throws InterruptedException {
        Thread.sleep(10000);
        Assert.assertTrue(adminpage.isAdminpage());
        return false;
    }

    @And("^Navigate to user creation module$")
    public void navigateToUserCreationModule() throws InterruptedException {
      createuserpage.navigateCreateuser();

    }

    @And("^input all mandatory field$")
    public void inputAllMandatoryField() {
//        createuserpage.selectEmployeename();
//        createuserpage.inputUserName();
//        createuserpage.inputPassword();
//        createuserpage.inputconfirmPassword();
//        createuserpage.setAccessPermission("edit");
//        createuserpage.setAccessModule("LAB");
//        createuserpage.selectStatus();

    }

    @And("^click on create user$")
    public void clickOnCreateUser() {
        createuserpage.clickCreate();
    }

    @And("^input all mandatory field \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void inputAllMandatoryField(String empName, String userName, String password, String confirmPasword, String accessPermission, String accessModule, String status) throws Throwable {
        createuserpage.selectEmployeename(empName);
        createuserpage.inputUserName(userName);
        createuserpage.inputPassword(password);
        createuserpage.inputconfirmPassword(confirmPasword);
        createuserpage.setAccessPermission(accessPermission);
        createuserpage.setAccessModule(accessModule);
        createuserpage.selectStatus(status);
    }

    @Then("^It should not display user already registered$")
    public void itShouldNotDisplayUserAlreadyRegistered() {
       Assert.assertFalse(createuserpage.userAlreadyInuse());
    }
}


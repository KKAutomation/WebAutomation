package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.pageObjects.CommonFunctions;
import com.cucumberFramework.testBase.TestBase;
import com.google.inject.Inject;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class NehaAmazonSteps extends TestBase {


    @When("^I enter url \"([^\"]*)\"$")
    public void iEnterUrl(String url) throws Throwable {
        driver.get(url);

    }


    @When("^I click on Signin button it should open sign in page$")
    public void iClickOnSigninButtonItShouldOpenSignInPage() {
        clickElement("//span[.='Hello, Sign in']");

//        driver.findElement(By.xpath("//span[.=\"Hello, Sign in\"]")).click();
    }

    @Then("^Enter id as \"([^\"]*)\"$")
    public void enterIdAs(String arg0) throws Throwable {
        inputText("//*[@id=\"ap_email\"]",arg0);
//        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(arg0);
        System.out.println("test");
    }

    @And("^Click on Continue button$")
    public void clickOnContinueButton() {
       clickElement("//*[@id=\"continue\"]");

//        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
    }


    @And("^Password as \"([^\"]*)\"$")
    public void passwordAs(String pass) throws Throwable {
         driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(pass);
    }

    @Then("^click login so it should open homepage$")
    public void clickLoginSoItShouldOpenHomepage() {
        driver.findElement(By.id("signInSubmit")).click();
    }

    @Given("^i will enter url \"([^\"]*)\"$")
    public void iWillEnterUrl(String url2) throws Throwable {
        driver.get(url2);
    }

    @Then("^I click on returns and order$")
    public void iClickOnReturnsAndOrder() {
        driver.findElement(By.xpath("//*[@id=\"nav-orders\"]/span[2]")).click();
    }

    @And("^I select the your order and navigate to (\\d+)$")
    public void iSelectTheYourOrderAndNavigateTo(int arg0) {
        driver.findElement(By.xpath("//*[@id=\"a-autoid-1-announce\"]")).click();
    }

    @And("^I select (\\d+)$")
    public void iSelect(int arg0) {
        driver.findElement(By.id("orderFilter_4")).click();
    }

    @And("^Slect the menu option$")
    public void slectTheMenuOption() {
        driver.findElement(By.id("nav-hamburger-menu")).click();
    }

    @When("^I select the echo and alexa it should open list of all option of the products\\.$")
    public void iSelectTheEchoAndAlexaItShouldOpenListOfAllOptionOfTheProducts() {
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a/div")).click();
    }

    @Then("^I sleect all new amazon echo option and it should display all products to me$")
    public void iSleectAllNewAmazonEchoOptionAndItShouldDisplayAllProductsToMe() {
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[2]/li[4]/a")).click();
    }

    @And("^Select the video option so video should be played\\.$")
    public void selectTheVideoOptionSoVideoShouldBePlayed() {
        driver.findElement(By.xpath("//*[@id=\"a-autoid-11\"]/span/input")).click();
    }

    @Given("^I am on amazon homepage and i select the pantry option to add tem to cart$")
    public void iAmOnAmazonHomepageAndISelectThePantryOptionToAddTemToCart() {
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[7]")).click();
    }

    @Then("^i slect kahonoor basmati rice$")
    public void iSlectKahonoorBasmatiRice() {
        driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[4]/div/div/div[4]/div/form/div/div/div[1]/span/span/span/span/span")).click();
    }

    @And("^i slect the quesntity to (\\d+) kg$")
    public void iSlectTheQuesntityToKg(int arg0) {
        driver.findElement(By.id("dropdown1_2")).click();

    }

    @When("^i add the item to cart it should be displayed in cart to me\\.$")
    public void iAddTheItemToCartItShouldBeDisplayedInCartToMe() {
        driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[4]/div/div/div[4]/div/form/div/div/div[2]/span/span/span/input")).click();
    }

    @Then("^I should able to view my name$")
    public void iShouldAbleToViewMyName() {
        Assert.assertTrue(nameDisplayed());
        System.out.println(getAppdownloadText());
    }
}

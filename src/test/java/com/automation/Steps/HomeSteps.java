package com.automation.Steps;

import com.automation.Pages.HomePage;
import com.automation.Utils.ConfigReader;
import com.automation.Utils.ReportManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {
    HomePage homePage = new HomePage();

    @Given("user opens application")
    public void user_opens_application() {
        homePage.openApplication();
    }

    @Then("verify user is on home screen")
    public void verify_user_is_on_home_screen() {
        Assert.assertTrue(homePage.isHomeScreenDisplayed());
        ReportManager.attachScreenShot();
    }

    @When("user click on flight tab")
    public void user_click_on_flight_tab() {
        homePage.clickOnFlightTab();
    }


    @Given("user opens the application")
    public void user_opens_the_application() {
        homePage.openApplication();
    }


    @When("user click on packages tab")
    public void userClickOnPackagesTab() {
        homePage.clickOnPackagesTab();
    }


    @When("user clicks on account")
    public void userClicksOnAccount() {
        homePage.clickOnAccount();
    }

    @When("user clicks on chat option")
    public void userClicksOnChatOption() {
        homePage.clickOnChat();
    }

    @When("user click on cruises tab")
    public void userClickOnCruisesTab() {
        homePage.clickOnCruises();
    }

    @When("user clicks on the car tab")
    public void userClicksOnTheCarTab() {
        homePage.clickOnCars();
    }

    @When("user click on things to do")
    public void userClickOnThingsToDo() {
        homePage.clickOnThingsToDo();
    }

    @When("user clicks on discover")
    public void userClicksOnDiscover() {
        homePage.clickOnDiscover();
    }

    @When("user clicks on the stays tab")
    public void userClicksOnTheStaysTab() {
        homePage.clickOnStays();
    }

    @When("user reopens website")
    public void userReopensWebsite() {
        homePage.reopenWebsite();
    }

    @When("user scrolls to go Last-minute weekend deals")
    public void userScrollsToGoLastMinuteWeekendDeals() {
        homePage.goToLastMinuteWeekendDeals();
    }

    @And("user slides to the deal with offer with {string}")
    public void userSlidesToTheDealWithOfferWith(String offerPrice) {
        homePage.scrollToLastMinuteOfferPrice(ConfigReader.getValue(offerPrice));
    }

    @Then("verify the offer tag with offer price and actual price")
    public void verifyTheOfferTagWithOfferPriceAndActualPrice() {
        Assert.assertTrue(homePage.verifyLastMinutePrice());
    }

    @And("user selects the offer card")
    public void userSelectsTheOfferCard() {
        homePage.selectOfferCard();
    }
}

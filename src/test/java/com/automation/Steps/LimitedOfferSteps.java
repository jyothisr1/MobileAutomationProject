package com.automation.Steps;

import com.automation.Pages.LimitedOfferPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LimitedOfferSteps {
    LimitedOfferPage limitedOfferPage=new LimitedOfferPage();
    @When("user selects select your room button")
    public void userSelectsSelectYourRoomButton() {
        limitedOfferPage.selectSelectYourRoom();
    }

    @Then("verify the price in the price details with offer price")
    public void verifyThePriceInThePriceDetailsWithOfferPrice() {
        limitedOfferPage.verifyOfferPrice();
    }

    @Then("verify the first card price with offer with homepage price")
    public void verifyTheFirstCardPriceWithOfferWithHomepagePrice() {
        Assert.assertTrue(limitedOfferPage.verifyCardOfferPrice());
    }
}

package com.automation.Steps;

import com.automation.Pages.ThingsToDoPage;
import com.automation.Utils.ConfigReader;
import com.automation.Utils.ReportManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ThingsToDoSteps {
    ThingsToDoPage thingsToDoPage=new ThingsToDoPage();

    @Then("verify user is on search page")
    public void verifyUserIsOnSearchPage() {
        Assert.assertTrue(thingsToDoPage.verifyOnThingsToDoPage().isDisplayed());
        ReportManager.attachScreenShot();
    }

    @And("user enters {string} into enter destination")
    public void userEntersIntoEnterDestination(String destination) {
        thingsToDoPage.enterThingsToDoDestination(ConfigReader.getValue(destination));
    }

    @When("user gives the dates")
    public void userGivesTheDates() {
        thingsToDoPage.selectDates();
    }

    @And("user select the destination")
    public void userSelectTheDestination() {
        thingsToDoPage.selectThingsToDoDestination();
    }

    @And("user click on search button")
    public void userClickOnSearchButton() {
        thingsToDoPage.clickSearchButton();
    }

    @Then("verify things to do page is displayed")
    public void verifyThingsToDoPageIsDisplayed() {
        Assert.assertTrue(thingsToDoPage.verifyThingsToDoPage());
    }

    @When("user clicks on the card")
    public void userClicksOnTheCard() {
        thingsToDoPage.selectCard();
    }

    @Then("verify user entered details with details on the card")
    public void verifyUserEnteredDetailsWithDetailsOnTheCard() {
        Assert.assertTrue(thingsToDoPage.verifyDestination());
        Assert.assertTrue(thingsToDoPage.verifyStartDates());
        Assert.assertTrue(thingsToDoPage.verifyEndDates());
    }
}

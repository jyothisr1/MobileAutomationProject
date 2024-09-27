package com.automation.Steps;

import com.automation.Pages.StaysPage;
import com.automation.Utils.ConfigReader;
import com.automation.Utils.ReportManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StaysStep {
    StaysPage staysPage = new StaysPage();

    @Then("user is on the stays page")
    public void userIsOnTheStaysPage() {
        Assert.assertTrue(staysPage.verifyOnStaysPage().isDisplayed());
        ReportManager.attachScreenShot();
    }

    @When("user enters {string} location field")
    public void userEntersLocationField(String destination) {
        staysPage.enterGoingTo(destination);
    }

    @And("user select the destination of stays")
    public void userSelectTheDestinationOfStays() {
        staysPage.selectDestination();
    }

    @And("user selects the {string} and {string}")
    public void userSelectsTheAnd(String startDate, String endDate) {
        staysPage.selectDates(ConfigReader.getValue(startDate),ConfigReader.getValue(endDate));
    }
}

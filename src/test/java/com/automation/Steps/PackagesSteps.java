package com.automation.Steps;

import com.automation.Pages.PackagesPage;
import com.automation.Utils.ConfigReader;
import com.automation.Utils.ReportManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class PackagesSteps {
    PackagesPage packagesPage = new PackagesPage();

    @Then("verify user is on packages search page")
    public void verifyUserIsOnPackagesSearchPage() {
        assertTrue(packagesPage.verifyOnPackagePage().isDisplayed());
        ReportManager.attachScreenShot();
    }

    @When("user enters {string} into enter origin field")
    public void userEntersIntoEnterOriginField(String origin) {
        packagesPage.enterOrigin(ConfigReader.getValue(origin));
    }

    @And("user enters {string} into enter destination field")
    public void userEntersIntoEnterDestinationField(String destination) {
        packagesPage.enterDestination(ConfigReader.getValue(destination));
    }

    @And("user gives {string}")
    public void userGives(String preferredClass) {
        packagesPage.selectPreferredClass(ConfigReader.getValue(preferredClass));
    }

    @And("select dates from {string} {string} to {string} {string}")
    public void selectDatesFromTo(String startMonth, String startDate, String endMonth, String endDate) {
        packagesPage.packagesEnterDates(ConfigReader.getValue(startMonth),
                ConfigReader.getValue(startDate),
                ConfigReader.getValue(endMonth),
                ConfigReader.getValue(endDate));
    }
}

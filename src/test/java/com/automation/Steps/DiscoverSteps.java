package com.automation.Steps;

import com.automation.Pages.DiscoverPage;
import com.automation.Utils.ReportManager;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class DiscoverSteps {
    DiscoverPage discoverPage = new DiscoverPage();

    @Then("verify user is on discover page")
    public void verifyUserIsOnDiscoverPage() {
        Assert.assertTrue(discoverPage.verifyOnDiscoverPage().isDisplayed());
        ReportManager.attachScreenShot();
    }
}

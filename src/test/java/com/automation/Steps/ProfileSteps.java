package com.automation.Steps;

import com.automation.Pages.ProfilePage;
import com.automation.Utils.ConfigReader;
import com.automation.Utils.ReportManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProfileSteps {
    ProfilePage profilePage = new ProfilePage();

    @Then("verify user is on profile page")
    public void verifyUserIsOnProfilePage() {
        Assert.assertTrue(profilePage.verifyOnProfilePage().isDisplayed());
        ReportManager.attachScreenShot();
    }

    @When("user clicks on settings")
    public void userClicksOnSettings() {
        profilePage.clickOnSettings();
    }

    @When("user clicks on change display appearance")
    public void user_clicks_on_change_display_appearance() {
        profilePage.clickDisplayAppearances();
    }

    @When("user clicks on done")
    public void user_clicks_on_done() {
        profilePage.clickThemeDone();
    }

    @Then("verify user is having the appearance selected")
    public void verify_user_is_having_the_appearance_selected() {
        Assert.assertTrue(profilePage.verifyThemeSelected());
    }

    @And("user selects {string}")
    public void userSelects(String theme) {
        ConfigReader.getValue(theme);
        profilePage.clickDarkTheme();
    }

    @And("user clicks on change region")
    public void userClicksOnChangeRegion() {
        profilePage.clickRegion();
    }

    @And("user select {string}")
    public void userSelect(String region) {
        profilePage.selectRegion(ConfigReader.getValue(region));
    }

    @Then("user click on ok and confirms to clear the data")
    public void userClickOnOkAndConfirmsToClearTheData() {
        profilePage.clickOkClearData();
    }

    @Then("verify user is having the destination selected")
    public void verifyUserIsHavingTheDestinationSelected() {
        Assert.assertTrue(profilePage.verifyRegionSelected());
    }
}

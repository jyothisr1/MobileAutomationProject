package com.automation.Steps;

import com.automation.Pages.CarBookingPage;
import com.automation.Utils.ConfigReader;
import com.automation.Utils.ReportManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CarBookingSteps {
    CarBookingPage carBookingPage = new CarBookingPage();

    @Then("user is on the car booking page")
    public void userIsOnTheCarBookingPage() {
        Assert.assertTrue(carBookingPage.verifyOnCarBookingPage());
        ReportManager.attachScreenShot();
    }

    @When("user enters {string} into the Pick-up location field")
    public void userEntersIntoThePickUpLocationField(String pickUp) {
        carBookingPage.enterPickUp(ConfigReader.getValue("car.pick.up"));
    }

    @And("user enters {string} into the Drop-off location field")
    public void userEntersIntoTheDropOffLocationField(String dropOff) {
        carBookingPage.enterDropOff(ConfigReader.getValue(dropOff));
    }

    @And("user selects {string} and {string}")
    public void userSelectsAnd(String pickUpDate, String pickUpTime) {
    }
}

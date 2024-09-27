package com.automation.Pages;

import com.automation.Utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StaysPage extends BasePage {
    @FindBy(xpath = "//android.widget.TextView[@resource-id='TeamTypeaheadInputPlaceholder']")
    WebElement staysInput;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"TeamTypeaheadInputPlaceholder\"]")
    WebElement goingToSearchInput;

    @FindBy(xpath = "")
    WebElement selectDateButton;

    @FindBy(xpath = "")
    WebElement selectStartDate;

    @FindBy(xpath = "")
    WebElement selectEndDate;

    String selectStaysDestination="//android.view.View/android.widget.TextView[1][contains(@text,'%s')]";

    public WebElement verifyOnStaysPage() {
        return staysInput;
    }

    public void enterGoingTo(String destination) {
        goingToSearchInput.sendKeys(destination);
    }

    public void selectDestination() {
        String selectStaysDestinationLocator=String.format(selectStaysDestination,
                ConfigReader.getValue("stays.destination"));
        driver.findElement(By.xpath(selectStaysDestinationLocator)).click();
    }

    public void selectDates(String startDate, String endDate) {
        selectDateButton.click();
        selectStartDate.click();
        selectEndDate.click();

    }
}

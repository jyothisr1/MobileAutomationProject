package com.automation.Pages;

import com.automation.Utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThingsToDoPage extends BasePage {
    @FindBy(xpath = "//android.widget.AutoCompleteTextView[@resource-id='com.expedia.bookings:id/search_src_text']")
    WebElement destinationInput;

    @FindBy(xpath = "//android.widget.AutoCompleteTextView[@resource-id=\"com.expedia.bookings:id/search_src_text\"]")
    WebElement entersThingsToDoDestination;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Wed, Sep 18, Not Selected\"]")
    WebElement selectStartDate;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Thu, Sep 19, Not Selected\"]")
    WebElement selectEndDate;

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Done Button\"]")
    WebElement dateDoneButton;

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Search Button\"]")
    WebElement clickSearchButton;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'things to do')]")
    WebElement thingsToDoPageContent;

    @FindBy(xpath = "//android.view.View[@content-desc=\". Button\"]")
    WebElement clickCard;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.expedia.bookings:id/section_title\"]")
    WebElement activityLocation;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.expedia.bookings:id/section_title\"]/following-sibling::android.widget.TextView")
    WebElement activityLocationDetails;

    @FindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"com.expedia.bookings:id/date_container\"]/android.widget.TextView")
    WebElement startDateOnCard;

    @FindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"com.expedia.bookings:id/date_container\"]/android.widget.TextView[last()]")
    WebElement endDateOnCard;

    String selectThingsToDoDestination = "//android.widget.LinearLayout/android.widget.TextView[1][contains(@text,'%s')]";

    public WebElement verifyOnThingsToDoPage() {
        return destinationInput;
    }

    public void enterThingsToDoDestination(String destination) {
        entersThingsToDoDestination.sendKeys(destination);
    }

    public void selectThingsToDoDestination() {
        String selectThingsToDoDestinationLocation = String.format(selectThingsToDoDestination,
                ConfigReader.getValue("things.to.do.destination"));
        driver.findElement(By.xpath(selectThingsToDoDestinationLocation)).click();
    }

    public void selectDates() {
        selectStartDate.click();
        selectEndDate.click();
        dateDoneButton.click();
    }

    public void clickSearchButton() {
        clickSearchButton.click();
    }

    public boolean verifyThingsToDoPage() {
        return thingsToDoPageContent.isDisplayed();
    }

    public void selectCard() {
        clickCard.click();
    }

    public boolean verifyDestination() {
        scrollTillElement(activityLocation);
        return activityLocationDetails.getText().contains(
                ConfigReader.getValue("things.to.do.destination")
        );
    }

    public boolean verifyStartDates() {
        scrollTillElement(startDateOnCard);
        return startDateOnCard.getText().contains("18");
    }

    public boolean verifyEndDates() {
        return endDateOnCard.getText().contains("19");
    }
}

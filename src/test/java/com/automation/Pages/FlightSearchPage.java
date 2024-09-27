package com.automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightSearchPage extends BasePage {

    @FindBy(xpath = "//android.view.View[@content-desc='Leaving from Button']")
    WebElement flyingFromInput;

    @FindBy(xpath = "//android.view.View[@content-desc='Going to Button']")
    WebElement flyingToInput;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"TeamTypeaheadInput\"]")
    WebElement flyingFromTextInput;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"TeamTypeaheadInput\"]")
    WebElement flyingToTextInput;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Chicago (ORD - O'Hare Intl.)\"]/ancestor::android.view.View/following-sibling::android.widget.Button")
    WebElement fromInput;

    @FindBy(xpath = "(//android.widget.TextView[@text=\"Florida, United States\"])[1]")
    WebElement toInput;

    @FindBy(xpath = "//android.widget.TextView[@text='Search']")
    WebElement searchBtn;

    @FindBy(xpath = "//android.view.View[contains(@content-desc,'Dates Button')]")
    WebElement dateField;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='buttonLabel']")
    WebElement doneBtn;

    String flyingFromAndToLocator = "//android.widget.TextView[contains(@text,'%s')]";

    String dateSelection = "//android.view.View[contains(@content-desc,'%s')]/following-sibling::android.widget.Button";


    public boolean isFlightSearchPageDisplayed() {
        return isPresent(flyingFromInput) && isPresent(flyingToInput);
    }

    public void enterFromLocation(String fromLocation) {
        flyingFromInput.click();
        flyingFromTextInput.sendKeys(fromLocation);
        String loc = String.format(flyingFromAndToLocator, fromLocation);
        driver.findElement(By.xpath(loc)).click();
    }

    public void enterToLocation(String toLocation) {
        flyingToInput.click();
        waitForElementToBeClickable(flyingToTextInput);
        flyingToTextInput.sendKeys(toLocation);
        String loc = String.format(flyingFromAndToLocator, toLocation);
        driver.findElement(By.xpath(loc)).click();
    }

    public void clickOnDateField() {
        dateField.click();
    }

    public void clickOnSearchBtn() {
        searchBtn.click();
    }

    public void clickOnDoneBtn() {
        doneBtn.click();
    }

    public void selectDate(String fromDate) {
        String loc = String.format(dateSelection, fromDate);
//        clickOnElementIfPresent(driver.findElement(By.xpath(loc)));
        driver.findElement(By.xpath(loc)).click();
    }
}

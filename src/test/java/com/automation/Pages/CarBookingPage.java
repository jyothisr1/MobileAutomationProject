package com.automation.Pages;

import com.automation.Utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarBookingPage extends BasePage {

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.expedia.bookings:id/uds_toolbar_title']")
    WebElement carBooking;

    @FindBy(xpath = "//android.widget.LinearLayout[contains(@content-desc,'Pick-up in. Button')]")
    WebElement pickUpButton;

    @FindBy(xpath = "//android.widget.AutoCompleteTextView[@resource-id=\"com.expedia.bookings:id/search_src_text\"]")
    WebElement pickUpInput;

//    @FindBy(xpath = "//android.widget.TextView/preceding-sibling::android.widget.TextView[contains(@text,'Alberta')]")
//    WebElement selectPickUp;

    @FindBy(xpath = "//android.widget.CheckBox[@resource-id=\"com.expedia.bookings:id/car_drop_off_checkbox\"]")
    WebElement checkDropOff;

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Drop-off. Button\"]")
    WebElement dropOffButton;

    String selectPickUpDrop="//android.widget.TextView/preceding-sibling::android.widget.TextView[contains(@text,'%s')]";


    public boolean verifyOnCarBookingPage() {
        return carBooking.isDisplayed();
    }

    public void enterPickUp(String pickUp) {
        pickUpButton.click();
        pickUpInput.sendKeys(pickUp);
        String selectPickUp=String.format(selectPickUpDrop, ConfigReader.getValue("car.pick.up"));
        driver.findElement(By.xpath(selectPickUp)).click();
    }

    public void enterDropOff(String dropOff) {
        if(checkDropOff.isSelected()){
            checkDropOff.click();
        }
        dropOffButton.click();
        pickUpInput.sendKeys(dropOff);
        String selectDropOff=String.format(selectPickUpDrop, ConfigReader.getValue("car.drop.off"));
        driver.findElement(By.xpath(selectDropOff)).click();
    }
}

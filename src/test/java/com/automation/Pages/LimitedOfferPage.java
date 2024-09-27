package com.automation.Pages;

import com.automation.Utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LimitedOfferPage extends BasePage{

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Select your room Link']")
    WebElement selectYourRoomButton;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"Lead Price formatted\"]")
    WebElement finalCardPrice;

    public void selectSelectYourRoom() {
        selectYourRoomButton.click();
    }

    public void verifyOfferPrice() {

    }

    public boolean verifyCardOfferPrice() {
        int homePagePrice=Integer.parseInt(ConfigReader.getValue("limited.offer.last.price"));
        int cardPrice=Integer.parseInt(finalCardPrice.getText().split("₹")[0]);
        return homePagePrice==cardPrice;
    }
}

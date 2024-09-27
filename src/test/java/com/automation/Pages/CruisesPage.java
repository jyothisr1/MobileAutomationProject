package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CruisesPage extends BasePage {
    @FindBy(xpath = "//android.widget.TextView[@text='Cruises']")
    WebElement cruises;

    public WebElement verifyOnCruisesPage() {
        return cruises;
    }
}

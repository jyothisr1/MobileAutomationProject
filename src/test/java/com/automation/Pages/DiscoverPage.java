package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiscoverPage extends BasePage {
    @FindBy(xpath = "//android.widget.ScrollView/android.view.View[1]")
    WebElement discover;


    public WebElement verifyOnDiscoverPage() {
        return discover;
    }
}

package com.automation.Pages;

import com.automation.Utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {
    @FindBy(xpath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.Button")
    WebElement settings;

    @FindBy(xpath = "//android.widget.TextView[@text='Display appearance']/parent::android.view.View/following-sibling::android.widget.Button")
    WebElement clickAppearances;

    @FindBy(xpath = "//android.widget.TextView[@text='Dark']/preceding-sibling::android.view.View")
    WebElement selectDark;

    @FindBy(xpath = "//android.widget.Button")
    WebElement themeDone;

    @FindBy(xpath = "//android.widget.TextView[@text='Region']/parent::android.view.View/following-sibling::android.widget.Button")
    WebElement clickRegionButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Display appearance']/following-sibling::android.widget.TextView")
    WebElement themeSelected;

    @FindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
    WebElement clickOkClearData;

    @FindBy(xpath = "//android.widget.TextView[@text='Region']/following-sibling::android.widget.TextView")
    WebElement regionSelected;

    String selectRegion="//android.widget.TextView[@text='%s']/following-sibling::android.widget.RadioButton";

    public WebElement verifyOnProfilePage() {
        return settings;
    }

    public void clickOnSettings() {
        settings.click();
    }

    public void clickDisplayAppearances() {
        clickAppearances.click();
    }

    public void clickDarkTheme() {
        selectDark.click();
    }

    public void clickThemeDone() {
        themeDone.click();
    }

    public boolean verifyThemeSelected() {
        return themeSelected.getText().contains("Dark");
    }

    public void clickRegion() {
        clickRegionButton.click();
    }

    public void selectRegion(String region) {
        String regionLoc=String.format(selectRegion,region);
        driver.findElement(By.xpath(regionLoc)).click();

    }

    public void clickOkClearData() {
        clickOkClearData.click();
    }

    public boolean verifyRegionSelected() {
        return regionSelected.getText().contains(ConfigReader.getValue("region"));
    }
}

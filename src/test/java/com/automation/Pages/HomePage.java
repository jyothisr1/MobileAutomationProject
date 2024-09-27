package com.automation.Pages;

import com.automation.Utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//android.widget.Button")
    WebElement clickGetStarted;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]")
    WebElement doNotAllowNotification;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"PreSignInDismissIcon\"]")
    WebElement closeButton;

    @FindBy(xpath = "//android.widget.Button")
    WebElement getStartedButton;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Close\"]/following-sibling::android.widget.Button")
    WebElement closeSignIn;

    @FindBy(xpath = "//android.view.ViewGroup[@resource-id=\"android:id/content\"]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.Button")
    WebElement closeLocation;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Expedia logo']")
    WebElement expediaLogo;

    @FindBy(xpath = "//android.widget.TextView[@text='Flights']")
    WebElement flightsTab;

    @FindBy(xpath = "//android.view.View[@content-desc='List of choices, 6 choices']/android.view.View/android.view.View[4]/android.view.View/android.view.View")
    WebElement packagesTab;

    @FindBy(xpath = "//android.widget.HorizontalScrollView[@resource-id='com.expedia.bookings:id/bottom_tab_layout']/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.LinearLayout")
    WebElement accountIcon;

    @FindBy(xpath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")
    WebElement chatIcon;

    @FindBy(xpath = "//android.view.View[@content-desc='List of choices, 6 choices']/android.view.View/android.view.View[6]/android.view.View/android.widget.Button")
    WebElement cruisesTab;

    @FindBy(xpath = "//android.view.View[@content-desc='List of choices, 6 choices']/android.view.View/android.view.View[3]/android.view.View/android.widget.Button")
    WebElement carsTab;

    @FindBy(xpath = "//android.view.View[@content-desc='List of choices, 6 choices']/android.view.View/android.view.View[5]/android.view.View/android.widget.Button")
    WebElement thingsToDoTab;

    @FindBy(xpath = "//android.widget.HorizontalScrollView[@resource-id='com.expedia.bookings:id/bottom_tab_layout']/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout")
    WebElement discoverIcon;

    @FindBy(xpath = "//android.view.View[@content-desc='List of choices, 6 choices']/android.view.View/android.view.View[1]/android.widget.Button")
    WebElement staysTab;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Last-minute weekend deals\"]")
    WebElement lastMinuteWeekendDeals;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Last-minute weekend deals\"]/parent::android.view.View/following-sibling::android.view.View//android.widget.TextView[contains(@text,'% off')]")
    WebElement lastMinuteWeekendDealsOfferTag;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Last-minute weekend deals\"]/parent::android.view.View/following-sibling::android.view.View//android.view.View[contains(@content-desc,'Page')]")
    WebElement lastMinuteWeekendPage;

    @FindBy(xpath = "//android.widget.TextView[contains(@content-desc,'Price is')]")
    WebElement lastMinuteCurrentPrice;

    @FindBy(xpath = "//android.widget.TextView[contains(@content-desc,'Price was')]")
    WebElement lastMinutePriceBefore;


    public void openApplication() {

        if(isPresent(getStartedButton)){
            getStartedButton.click();
        }
        if(isPresent(closeSignIn)){
            closeSignIn.click();
        }
//        if (isPresent(closeButton)) {
//            closeButton.click();
//        }
//        if (isPresent(doNotAllowNotification)) {
//            doNotAllowNotification.click();
//        }
//        if (isPresent(closeLocation)) {
//            closeLocation.click();
//        }

    }

    public boolean isHomeScreenDisplayed() {
        isPresent(expediaLogo);
        return expediaLogo.isDisplayed();
    }


    public void clickOnFlightTab() {
        flightsTab.isDisplayed();
        flightsTab.click();
    }

    public void clickOnPackagesTab() {
        packagesTab.click();
    }

    public void clickOnAccount() {
        accountIcon.click();
    }

    public void clickOnChat() {
        chatIcon.click();
    }

    public void clickOnCruises() {
        cruisesTab.click();
    }

    public void clickOnCars() {
        carsTab.click();
    }

    public void clickOnThingsToDo() {
        thingsToDoTab.click();
    }

    public void clickOnDiscover() {
        discoverIcon.click();
    }

    public void clickOnStays() {
        staysTab.click();
    }

    public void reopenWebsite() {
        if (isPresent(clickGetStarted)) {
            clickGetStarted.click();
        }
        if (isPresent(closeSignIn)) {
            closeSignIn.click();
        }
        if (isPresent(doNotAllowNotification)) {
            doNotAllowNotification.click();
        }
        if (isPresent(closeLocation)) {
            closeLocation.click();
        }
    }

    public void goToLastMinuteWeekendDeals() {
        scrollTillElement(lastMinuteWeekendDeals);
        int startX = lastMinuteWeekendDeals.getLocation().getX();
        int startY = lastMinuteWeekendDeals.getLocation().getY();
        scrollOrSwipe(startX, startY, startX, 10);
    }

    public void scrollToLastMinuteOfferPrice(String offerPrice) {
        String tagOfferPrice = lastMinuteWeekendDealsOfferTag.getText().split("%")[0];
        System.out.println(tagOfferPrice);
        while (Integer.parseInt(tagOfferPrice) < Integer.parseInt(offerPrice)) {
            int startX=lastMinuteWeekendPage.getLocation().getX();
            int startY=lastMinuteWeekendPage.getLocation().getY();
            int width=lastMinuteWeekendPage.getSize().getWidth();
            scrollOrSwipe(startX+width,startY,0,startY);
            tagOfferPrice = lastMinuteWeekendDealsOfferTag.getText().split("%")[0];
        }

    }

    public boolean verifyLastMinutePrice() {
        int beforePrice=Integer.parseInt(lastMinutePriceBefore.getText().substring(1));
        Double offer=(Double.parseDouble(lastMinuteWeekendDealsOfferTag.getText().split("%")[0]))/100.0;
        int afterPrice=Integer.parseInt(lastMinuteCurrentPrice.getText().substring(1));
        ConfigReader.setValue("limited.offer.last.price",String.valueOf(afterPrice));
        return beforePrice-(beforePrice*offer)>=afterPrice;
    }

    public void selectOfferCard() {
        lastMinuteWeekendPage.click();
    }
}
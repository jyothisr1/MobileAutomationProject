package com.automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PackagesPage extends BasePage {

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.expedia.bookings:id/uds_toolbar_title']")
    WebElement packages;

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Enter origin. Button\"]")
    WebElement enterOriginButton;

    @FindBy(xpath = "//android.widget.AutoCompleteTextView[@resource-id=\"com.expedia.bookings:id/search_src_text\"]")
    WebElement enterOriginInput;

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Enter destination. Button\"]")
    WebElement enterDestinationButton;

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Select travel dates. Button. Opens dialog\"]")
    WebElement selectDatesButton;

    @FindBy(xpath = "//android.widget.LinearLayout[contains(@content-desc,\"Select preferred class. Button.\")]")
    WebElement preferredClassButton;

    @FindBy(xpath = "//android.widget.LinearLayout[contains(@content-desc,\"Travelers. Button. Opens dialog.\")]")
    WebElement travellersButton;

    String monthDay="//android.widget.TextView[contains(@text,'%s')]/following-sibling::android.widget.GridView[2]/android.widget.TextView[contains(@content-desc,'%s')]";


    public WebElement verifyOnPackagePage() {
        isPresents(selectDatesButton);
        return selectDatesButton;
    }

    public void enterOrigin(String origin) {
        enterOriginButton.click();
        enterOriginInput.sendKeys(origin);
    }

    public void enterDestination(String destination) {
        enterDestinationButton.click();
        enterOriginInput.sendKeys(destination);
    }

    public void selectPreferredClass(String preferredClass) {
    }

    public void packagesEnterDates(String startMonth, String startDate, String endMonth, String endDate) {
        selectDatesButton.click();
        String startMonthDateElement=String.format(monthDay,startMonth,startDate);
        while (!isPresents(driver.findElement(By.xpath(startMonthDateElement)))){
            scroll();
        }
        driver.findElement(By.xpath(startMonthDateElement)).click();
        String endMonthDateElement=String.format(monthDay,endMonth,endDate);
        Boolean monthFound;
        try {
            driver.findElement(By.xpath(endMonthDateElement));
            monthFound=true;
        }catch (Exception e){
            monthFound=false;
        }
        while (!monthFound){
            scroll();
            try {
                driver.findElement(By.xpath(endMonthDateElement));
                monthFound=true;
            }catch (Exception e){
                monthFound=false;
            }
        }
        driver.findElement(By.xpath(endMonthDateElement)).click();
    }
}

package com.automation.Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
//import org.openqa.selenium.html5.Location;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class DriverManager {
    static AndroidDriver driver;

    public static void createDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", ConfigReader.getValue("platform.name"));
        capabilities.setCapability("deviceName", ConfigReader.getValue("device.name"));
        capabilities.setCapability("automationName", ConfigReader.getValue("automation.name"));
        capabilities.setCapability("app", System.getProperty("user.dir") + "\\" + ConfigReader.getValue("app.path"));
        capabilities.setCapability("appActivity", ConfigReader.getValue("app.activity"));
        capabilities.setCapability("appPackage", ConfigReader.getValue("app.package"));
//        capabilities.setCapability("gps","true");
//        capabilities.setCapability("autoGrantPermissions", true);;
        driver = new AndroidDriver(capabilities);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        driver.setLocation(new Location(39.69052590674079, -101.44996688527546,100));
//        Map<String, Object> location = new HashMap<>();
//        location.put("latitude", 39.69052590674079);
//        location.put("longitude", -101.44996688527546);
//        location.put("altitude", 0.0); // Optional, usually 0.0 is sufficient
//
//        driver.executeScript("mobile: setLocation", location);
//        driver.setLocation(new Location(40.24110400434607, -83.03271122145355,100));
//        driver.setLocation(new Location(40.24110400434607, -83.03271122145355,100));
//        driver.setLocation(new Location(40.24110400434607, -83.03271122145355,100));
    }

    public static AndroidDriver getDriver() {
        return driver;
    }
}

package com.automation.Steps;

import com.automation.Utils.ConfigReader;
import com.automation.Utils.DriverManager;
import com.automation.Utils.ReportManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void setUp(Scenario scenario) {
        ConfigReader.initProperties();
        ReportManager.initScenario(scenario);
        DriverManager.createDriver();
    }

    @After
    public void cleanUp(Scenario scenario) {
        if (scenario.isFailed()) {
            ReportManager.attachScreenShot();
        }
//        DriverManager.getDriver().quit();
    }
}

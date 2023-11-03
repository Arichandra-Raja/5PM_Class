package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utilities.BrowserUtil;

public class Hooks {
    
    @Before
    public void beforeScenario(Scenario scenario) {
        System.out.println("Before Scenario: " + scenario.getName());
        BrowserUtil.launchBrowser();
    }
    
  

    @After()
    public void afterFirstScenario(Scenario scenario) {
        System.out.println("After the first scenario");
        BrowserUtil.closeBrowser();
    }
    

    
}

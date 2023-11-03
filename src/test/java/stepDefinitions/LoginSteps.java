package stepDefinitions;

import io.cucumber.java.en.*;
import pageObjects.LeafGroundPages;


public class LoginSteps {
	LeafGroundPages leafGroundPages = new LeafGroundPages();

    @When("I click the element")
    public void i_click_the_element() throws InterruptedException {
		leafGroundPages.clickMainBodyElement();
    }

    @When("I click the href element")
    public void i_click_the_href_element() {
    	leafGroundPages.clickHrefElement();
    }

    @Then("I type {string} in the text box with id")
    public void i_type_in_the_text_box_with_id(String text) {
    	leafGroundPages.enterText(text);
    	
    }
    
     
    }


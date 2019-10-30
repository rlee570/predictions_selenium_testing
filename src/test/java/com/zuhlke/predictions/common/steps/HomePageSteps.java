package com.zuhlke.predictions.common.steps;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class HomePageSteps {

    private WebDriver driver;

    @Given("Given driver $driver")
    public void aWebDriver(WebDriver driver) {
        this.driver = driver;
    }

    @When("When go to $url")
    public void theUrl(String url) {
        this.driver.get(url);
    }

    @Then("Then home page is displayed")
    public void theHomePageIsDisplayed() {
        assertEquals("Predictions",this.driver.getTitle());
    }

}

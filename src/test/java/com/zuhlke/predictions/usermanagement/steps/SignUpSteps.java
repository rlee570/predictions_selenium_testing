package com.zuhlke.predictions.usermanagement.steps;

import io.github.bonigarcia.wdm.DriverManagerType;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

public class SignUpSteps {

    private WebDriver driver;

    @Given("Given webdriver $webdriver")
    public void aWebDriver(WebDriver driver) {
        this.driver = driver;
    }

    @When("When fields provided firstname $firstname , lastname $lastname, email $email , password $password")
    public void theSignUpForm(String firstname, String lastname, String email, String password){
//        "//button[@type=\"submit\"]"
    }

    @Then("Then show success message $message")
    public void theSuccessMessageIsDisplayed(String message){

    }


}

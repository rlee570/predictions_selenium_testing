package com.zuhlke.predictions.usermanagement.steps;

import com.zuhlke.predictions.common.page.HomePage;
import com.zuhlke.predictions.usermanagement.page.SignUpPage;
import io.github.bonigarcia.wdm.DriverManagerType;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SignUpSteps {

    private WebDriver driver;
    private HomePage homePage;
    private SignUpPage signUpPage;

    @Given("Given webdriver $webdriver")
    public void aWebDriver(WebDriver driver) {
        this.driver = driver;
        this.homePage = new HomePage(driver);
        this.signUpPage = new SignUpPage(driver);
        homePage.clickSignUpBtn();
    }

    @When("When fields provided firstname $firstname , lastname $lastname, email $email , password $password")
    public void theSignUpForm(String firstname, String lastname, String email, String password){
        signUpPage.enterFirstName(firstname);
        signUpPage.enterLastName(lastname);
        signUpPage.enterEmailAddress(email);
        signUpPage.enterPassword(password);
        signUpPage.submitForm();
    }

    @Then("Then show success message $message")
    public void theSuccessMessageIsDisplayed(String message){
        String[] urlStr = driver.getCurrentUrl().split("/");
        assertEquals("login",urlStr[urlStr.length-1]);
    }


}

package com.zuhlke.predictions.usermanagement;

import com.zuhlke.predictions.BaseSeleniumTest;
import com.zuhlke.predictions.common.steps.HomePageSteps;
import com.zuhlke.predictions.usermanagement.steps.SignUpSteps;
import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(SerenityRunner.class)
public class SignUpTest extends BaseSeleniumTest {

    @Steps
    private HomePageSteps homePageSteps;

    @Steps
    private SignUpSteps signUpSteps;

    @Test
    public void signUpNewUserAllFieldsEnteredCorrectly() {
        homePageSteps.aWebDriver(driver);
        homePageSteps.theUrl("http://10.4.103.131:3000");
        signUpSteps.aWebDriver(driver);
        signUpSteps.theSignUpForm("Jed", "Dayo", "jesus_dayo@zuhlke.com", "abcdefgh");
        signUpSteps.theSuccessMessageIsDisplayed("Sign up was successful");
    }


}

package com.zuhlke.predictions.common;

import com.zuhlke.predictions.BaseSeleniumTest;
import com.zuhlke.predictions.common.steps.HomePageSteps;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(SerenityRunner.class)
public class HomePageTest extends BaseSeleniumTest {

    @Steps
    private HomePageSteps homePageSteps;

    @Test
    public void goToHomePage() {
        homePageSteps.aWebDriver(driver);
        homePageSteps.theUrl("http://10.4.103.131:3000");
        homePageSteps.theHomePageIsDisplayed();
    }

}

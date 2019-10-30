package com.zuhlke.predictions.common.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;
    private WebElement signUpBtn;
    private WebElement loginBtn;

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getSignUpBtn() {
        return driver.findElement(By.xpath("//span[contains(text(),'Sign up')]"));
    }

    public WebElement getLoginBtn() {
        return driver.findElement(By.id("//span[contains(text(),'Log in')]"));
    }

    public void clickSignUpBtn() {
        getSignUpBtn().click();
    }

    public void clickLoginBtn() {
        getLoginBtn().click();
    }

}

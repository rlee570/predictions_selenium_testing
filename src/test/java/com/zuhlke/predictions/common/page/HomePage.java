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

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSignUpBtn() {
        signUpBtn = driver.findElement(By.xpath("//span[contains(text(),'Sign up')]"));
        return signUpBtn;
    }

    public WebElement getLoginBtn() {
        loginBtn = driver.findElement(By.id("//span[contains(text(),'Log in')]"));
        return loginBtn;
    }

}

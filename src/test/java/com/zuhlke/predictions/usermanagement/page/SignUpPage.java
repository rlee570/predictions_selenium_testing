package com.zuhlke.predictions.usermanagement.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;
    private WebElement firstNameField;
    private WebElement lastNameField;
    private WebElement emailAddressField;
    private WebElement passwordField;
    private WebElement signUpBtn;

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getFirstNameField() {
        return driver.findElement(By.id("firstName"));
    }

    public WebElement getLastNameField() {
        return driver.findElement(By.id("lastName"));
    }

    public WebElement getEmailAddressField() {
        return driver.findElement(By.id("email"));
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getSignUpBtn() {
        return driver.findElement(By.xpath("//span[contains(text(),'Sign up')]/parent::*"));
    }

    public WebElement getSignUpForm(){
        return driver.findElement(By.id("signup-form"));
    }

    public void clickSignUpBtn(){
        getSignUpBtn().click();
    }

    public void submitForm(){
        getSignUpForm().submit();
    }

    public void enterFirstName(String firstName){
        getFirstNameField().sendKeys(firstName);
    }

    public void enterLastName(String lastName){
        getLastNameField().sendKeys(lastName);
    }

    public void enterEmailAddress(String email){
        getEmailAddressField().sendKeys(email);
    }

    public void enterPassword(String password){
        getPasswordField().sendKeys(password);
    }
}

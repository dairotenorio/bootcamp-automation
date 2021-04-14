package com.bootcamp.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage{

    public SignUpPage(WebDriver pDriver) {
        super(pDriver);
    }

    @FindBy(css = ".input-wrapper.ng-scope input[name='firstName'")
    private WebElement firstNameInput;

    @FindBy(css = ".input-wrapper.ng-scope input[name='lastName'")
    private WebElement lastNameInput;

    @FindBy(css = ".input-wrapper input[name='email']")
    private WebElement emailInput;

    @FindBy(css = ".input-wrapper input[name='newPassword']")
    private WebElement passwordInput;

    @FindBy(css = ".field.ng-scope .name.ng-isolate-scope")
    private WebElement brandsCheckBox;

    @FindBy(css = ".btn-group button[type='submit']")
    private WebElement sugnUpSubmitButton;

    
    
}

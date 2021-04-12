package com.bootcamp.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EspnLoginPage extends BasePage{
    
    public EspnLoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "disneyid-iframe")
    private WebElement loginIFrame;

    @FindBy(css = ".input-wrapper input[type='email']")
    private WebElement usernameInput;

    @FindBy(css = ".input-wrapper input[type='password']")
    private WebElement passwordInput;

    @FindBy(css = "button[type='submit']")
    private WebElement submitButton;

    public void switchToLoginIFrame(){
       getDriver().switchTo().frame(loginIFrame);
    }

    public EspnWelcomePage submitLoginForm(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        getWait().until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();
        return new EspnWelcomePage(getDriver());
    }

}

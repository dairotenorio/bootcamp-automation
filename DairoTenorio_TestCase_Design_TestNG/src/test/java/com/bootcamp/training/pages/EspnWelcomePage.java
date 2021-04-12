package com.bootcamp.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EspnWelcomePage extends BasePage{
    
    EspnWelcomePage (WebDriver driver){
        super(driver);
    }

    @FindBy(className = "small")
    private WebElement logOutLink;

    public WebElement getLogOutLink (){
        return logOutLink;
    }

    public void logout (){
        hoverProfileAvatar();
        logOutLink.click();
    }

}
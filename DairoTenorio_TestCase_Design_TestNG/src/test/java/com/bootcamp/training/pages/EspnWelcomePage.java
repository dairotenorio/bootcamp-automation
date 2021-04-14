package com.bootcamp.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EspnWelcomePage extends BasePage{
    
    EspnWelcomePage (WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".small")
    private WebElement logOutLink;

    @FindBy(css = ".account-management > li:nth-child(5) > a")
    private WebElement espnProfileLink;

    public WebElement getLogOutLink (){
        return logOutLink;
    }

    public WebElement getEspnProfileLink (){
        return espnProfileLink;
    }

    public void logout (){
        hoverProfileAvatar();
        logOutLink.click();
    }

}

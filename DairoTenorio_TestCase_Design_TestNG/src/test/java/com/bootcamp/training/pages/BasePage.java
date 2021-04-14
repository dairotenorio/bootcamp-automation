package com.bootcamp.training.pages;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BasePage {

    Logger logger = LoggerFactory.getLogger(BasePage.class);

    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver pDriver){
        PageFactory.initElements(pDriver, this);
        wait = new WebDriverWait(pDriver, Duration.ofSeconds(15));
        driver = pDriver;
    }

    @FindBy(css = "#global-user-trigger")
    private WebElement profileAvatar;

    public void hoverProfileAvatar(){
        Actions actions = new Actions(driver);
        actions.moveToElement(profileAvatar).perform();
    }
    
    public WebDriverWait getWait(){
        return wait;
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void dispose(){
        if(driver != null){
            driver.quit();
        }
    }
}

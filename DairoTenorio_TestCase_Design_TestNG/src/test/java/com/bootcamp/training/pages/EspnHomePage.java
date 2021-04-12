package com.bootcamp.training.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EspnHomePage extends BasePage {

    public EspnHomePage(WebDriver driver){
        super(driver);
        driver.get("https://www.espn.com/?src=com&adblock=true");
    }

    @FindBy(css = "#sideLogin-left-rail button.button-alt.med")
    private WebElement goToLoginButton;

    public WebElement getGoToLoginButton (){
        return goToLoginButton;
    }

    public EspnLoginPage goToLogin(){
        getDriver().manage().window().maximize();
        getWait().until(ExpectedConditions.elementToBeClickable(goToLoginButton));
        goToLoginButton.click();
        return new EspnLoginPage(getDriver());
    }

    public boolean goToLoginButtonDisplayed () {
        getWait().until(ExpectedConditions.elementToBeClickable(goToLoginButton));
        boolean btnEnabled = goToLoginButton.isDisplayed();
        return btnEnabled;
    }

}

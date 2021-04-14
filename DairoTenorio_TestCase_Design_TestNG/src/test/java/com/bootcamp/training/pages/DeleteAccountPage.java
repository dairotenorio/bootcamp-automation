package com.bootcamp.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteAccountPage extends BasePage{

    public DeleteAccountPage(WebDriver pDriver) {
        super(pDriver);
    }

    @FindBy(css = ".field-group a[id='cancel-account']")
    private WebElement deleteAccountLink;
    
    @FindBy(css = ".workflow.workflow-deactivate button[type='submit']")
    private WebElement deleteAccountSubmitButton;

    @FindBy(css = ".btn-group button[type='submit']")
    private WebElement deleteAccountOkButton;

}

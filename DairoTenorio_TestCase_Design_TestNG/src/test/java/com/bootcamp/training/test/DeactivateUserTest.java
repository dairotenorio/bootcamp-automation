package com.bootcamp.training.test;

import com.bootcamp.training.pages.EspnHomePage;
import com.bootcamp.training.pages.EspnLoginPage;
import com.bootcamp.training.pages.EspnWelcomePage;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeactivateUserTest extends BaseTests{

    Logger logger = LoggerFactory.getLogger(BaseTests.class);
    
    @Test
    @Parameters({"username3", "password3"})
    public void testEspnSuccessfulDeactivation(String username3, String password3){
        logger.info(">>>>> Accesing homepage");
        EspnHomePage home = getEspnHomePage();
        logger.info(">>>>> Accessing to login");
        EspnLoginPage loginPage = home.goToLogin();
        logger.info(">>>>> Getting into the login modal");
        loginPage.switchToLoginIFrame();
        logger.info(">>>>> Submitting username and password");
        EspnWelcomePage welcomePage = loginPage.submitLoginForm(username3, password3);
        welcomePage.hoverProfileAvatar();
        logger.info(">>>>> Clicking on the profile link to delete the account");
        welcomePage.getEspnProfileLink().click();
        logger.info(">>>>> Delete account");
    }
}

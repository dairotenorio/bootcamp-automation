package com.bootcamp.training.test;

import com.bootcamp.training.pages.EspnLoginPage;
import com.bootcamp.training.pages.EspnWelcomePage;
import com.bootcamp.training.pages.EspnHomePage;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EspnLoginTest extends BaseTests {
    
    Logger logger = LoggerFactory.getLogger(EspnLoginTest.class);

    @Test
    @Parameters({"username", "password"})
    public void testEspnSuccessfulLogin(String username, String password){
        logger.info(">>>>> Accesing homepage");
        EspnHomePage home = getEspnHomePage();
        logger.info(">>>>> Accessing to login");
        EspnLoginPage loginPage = home.goToLogin();
        logger.info(">>>>> Getting into the login modal");
        loginPage.switchToLoginIFrame();
        logger.info(">>>>> Submitting username and password");
        EspnWelcomePage welcomePage = loginPage.submitLoginForm(username, password);
        welcomePage.hoverProfileAvatar();
        logger.info(">>>>> Validating that the user is actually logged in");
        Assert.assertEquals(welcomePage.getLogOutLink().getText(), "Log Out");
    }
}

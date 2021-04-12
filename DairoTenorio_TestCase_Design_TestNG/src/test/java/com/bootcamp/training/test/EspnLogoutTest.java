package com.bootcamp.training.test;

import com.bootcamp.training.pages.EspnLoginPage;
import com.bootcamp.training.pages.EspnWelcomePage;
import com.bootcamp.training.pages.EspnHomePage;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EspnLogoutTest extends BaseTests {

    @Test
    @Parameters({"username2", "password2"})
    public void testEspnSuccessfulLogout(String username2, String password2){
        logger.info("·····················Starting Logout Scenario·····················");
        logger.info(">>>>> Accesing homepage");
        EspnHomePage home = getEspnHomePage();
        logger.info(">>>>> Accessing to login");
        EspnLoginPage loginPage = home.goToLogin();
        logger.info(">>>>> Getting into the login modal");
        loginPage.switchToLoginIFrame();
        logger.info(">>>>> Submitting username and password");
        EspnWelcomePage welcomePage = loginPage.submitLoginForm(username2, password2);
        welcomePage.hoverProfileAvatar();
        logger.info(">>>>> Logging out");
        welcomePage.logout();
        logger.info(">>>>> Validating that the user is actually logged out");
        logger.info("·····················Finishing Login Scenario·····················");
        Assert.assertEquals(home.goToLoginButtonDisplayed(), true);
    }

}

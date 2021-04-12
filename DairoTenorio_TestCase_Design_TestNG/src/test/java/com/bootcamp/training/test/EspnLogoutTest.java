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
        EspnHomePage home = getEspnHomePage();
        EspnLoginPage loginPage = home.goToLogin();
        loginPage.switchToLoginIFrame();
        EspnWelcomePage welcomePage = loginPage.submitLoginForm(username2, password2);
        welcomePage.hoverProfileAvatar();
        welcomePage.logout();
        Assert.assertEquals(home.goToLoginButtonDisplayed(), true);
    }

}

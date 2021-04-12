package com.bootcamp.training.test;

import com.bootcamp.training.pages.EspnLoginPage;
import com.bootcamp.training.pages.EspnWelcomePage;
import com.bootcamp.training.pages.EspnHomePage;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EspnLoginTest extends BaseTests {
    
    @Test
    @Parameters({"username", "password"})
    public void testEspnSuccessfulLogin(String username, String password){
        EspnHomePage home = getEspnHomePage();
        EspnLoginPage loginPage = home.goToLogin();
        loginPage.switchToLoginIFrame();
        EspnWelcomePage welcomePage = loginPage.submitLoginForm(username, password);
        welcomePage.hoverProfileAvatar();
        Assert.assertEquals(welcomePage.getLogOutLink().getText(), "Log Out");
    }
}

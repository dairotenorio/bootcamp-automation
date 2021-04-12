package com.bootcamp.training.test;
import com.bootcamp.training.utils.MyDriver;
import com.bootcamp.training.pages.EspnHomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseTests {

    MyDriver myDriver;

    private EspnHomePage EspnHome;

    Logger logger = LoggerFactory.getLogger(BaseTests.class);

    @BeforeSuite
    public void BeforeSuite(){
        logger.info(">>>>> Precondition: valid username and password for ESPN");
    }

    @BeforeMethod
    @Parameters({"browser"})
    public void beforeMethod(String browser){
        logger.info(">>>>> Opening the browser");
        myDriver = new MyDriver(browser);
        EspnHome = new EspnHomePage(myDriver.getDriver());
    }

    @AfterMethod
    public void afterMethod(){
        logger.info(">>>>> Closing the browser");
        EspnHome.dispose();
    }

    public EspnHomePage getEspnHomePage(){
        return EspnHome;
    }
    
}

package com.bootcamp.training.utils;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDriver {

    private WebDriver driver;
    
    public MyDriver(String browser){
        switch (browser) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "./src/test/java/com/bootcamp/training/resources/geckodriver");
                driver = new FirefoxDriver();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "./src/test/java/com/bootcamp/training/resources/chromedriver");
                driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                break;
            default:
                break;
        }
    }

    public WebDriver getDriver(){
        return this.driver;
    }
}

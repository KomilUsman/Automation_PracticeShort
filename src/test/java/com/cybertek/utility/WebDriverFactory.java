package com.cybertek.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverFactory {

    public static WebDriver get(String browserName) {
        WebDriver driver;

        switch (browserName.toLowerCase()) {

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();

            default:
                System.out.println("Unknown browser type " + browserName);
                driver = null;
        }
        driver.manage().window().maximize();


        return null;

    }


}

package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tessss {


    @Test
    public void testss() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

driver.get("http://practice.cybertekschool.com/forgot_password");
    }
}

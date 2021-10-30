package com.cybertek.tests;

import com.cybertek.utility.WebDriverFactory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


public class ForgotPassTest extends WebDriverFactory {

    @Test
    public void testForgetPassword() {


        WebDriver driver = WebDriverFactory.get("chrome");

        driver.get("https://www.google.com/");


    }
}

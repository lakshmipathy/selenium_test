package com.testamazon.test;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testamazon.utl.GetChromeDriver;

public class LoginTest {
    
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        // Set up ChromeDriver using WebDriverManager
//        WebDriverManager.chromedriver().setup();
        driver = GetChromeDriver.getDriver();
        
        // Open the application URL
        driver.get("https://www.amazon.in/");
    }

    @Test
    public void validateLogin() {
        // Add your Selenium code to validate login functionality
    	
        System.out.println("Login test executed");
        
        Map<String, String> hashmap=new HashMap<>();
        int []arr= {1,2,3,4,5};
        for (int i=0;i<arr.length; i++) {
        	System.out.println(iarr[i]);
        }
    
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
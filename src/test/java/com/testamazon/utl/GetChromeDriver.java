package com.testamazon.utl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class GetChromeDriver {
	
	private static WebDriver driver;

    // Private constructor to prevent instantiation
    private GetChromeDriver() {
        // Set the ChromeDriver path (if needed)
    	ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver\\chromedriver.exe");
//        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/129.0.6668.101 Safari/537.36");
//        options.addArguments("--headless");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

    // Public method to get the single instance of WebDriver
    public static WebDriver getDriver() {
        if (driver == null) {
            synchronized (GetChromeDriver.class) {
                if (driver == null) {
                    new GetChromeDriver();
                }
            }
        }
        return driver;
    }

    // Optional method to close the driver and reset the instance
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

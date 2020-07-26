package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

import static org.testng.reporters.jq.BasePanel.C;

public class BrowserManager extends Util {
    public void initialiseMethod () {
        //setting up chrome driver path
        System.setProperty("webdriver.chrome.driver", "src\\test\\resouces\\BrowserDrivers\\chromedriver.exe");
       // System.setProperty("webdriver.gecko.driver", "C:\\Soft\\geckodriver.exe");
        //creating object to open chrome driver
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");

    }

    public void closingMethod(){
        driver.close();}




}

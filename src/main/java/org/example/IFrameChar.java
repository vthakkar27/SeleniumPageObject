package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class IFrameChar extends Util {
     private By _TypeTopicName = By.xpath("//input[@type=\"text\"]");
    private By _CheckBox = By.xpath("//input[@type=\"checkbox\"]");
    private By _Animals = By.xpath("//select");

    //Method to

    public void SwitchtoIframes(){

        WebElement _iframe1 = driver.findElement(By.xpath("//iframe[@id=\"frame1\"]"));
        driver.switchTo().frame(_iframe1);
        typeText(_TypeTopicName, "Animal Name", 20);

        WebElement _iframe3 = driver.findElement(By.xpath("//iframe[@id=\"frame3\"]"));
        driver.switchTo().frame(_iframe3);
        clickOnElement(_CheckBox, 20);

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame2");

        Select select = new Select(driver.findElement(_Animals));
        select.selectByVisibleText("Avatar");
    }

    public void verifyIFrameURL() {

        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://chercher.tech/practice/frames-example-selenium-webdriver");

    }
}




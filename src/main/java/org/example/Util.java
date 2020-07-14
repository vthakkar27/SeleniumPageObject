package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

public class Util extends BasePage {
    public static void clickOnElement(By by, int time) {
        driver.findElement(by).click();
    }

    public static void typeText(By by, String text,int time) {
        driver.findElement(by).sendKeys(text);
    }

    public static long timestamp() {
        return (System.currentTimeMillis());
    }

    public static void getTextFromElement(By by) {
         driver.findElement(by).getText();
    }

    public static void selectFromDropDownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public static void selectFromDropDownByVisibleIndex(By by, int n) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(n);
    }

    public static void selectFromDropDownByValue(By by, String Value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(Value);
    }

    //creating Clickable method for driver to click on element
    public static void waitUntilElementToClickble(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(by));




    }
}
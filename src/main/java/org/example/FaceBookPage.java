package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class FaceBookPage extends Util
{
    private By _createPage = By.xpath("//button[@class=\"_4jy0 _4jy3 _4jy2 _51sy selected _42ft\"]");
    String expectedCreatePage = "Create a Page";

    public void UserIsOnHomeFaceBookPage() {
        String MainWindow = driver.getWindowHandle();
        // To handle all new opened window.
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        while (i1.hasNext()) {
            String ChildWindow = i1.next();
            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                // Switching to Child window
                driver.switchTo().window(ChildWindow);

                //   driver.switchTo().window(MainWindow);
                // driver.close();

            }

        }}

        public void AssertForURL () {
            String URL = driver.getCurrentUrl();
            Assert.assertEquals(URL, "https://www.facebook.com/nopCommerce");

        }

        public void AssertForCreatePage () {
            Assert.assertEquals(getTextFromElement(_createPage), expectedCreatePage);
        }

        public void CloseDriver () {
            //  Closing the Child Window.
            driver.close();
        }
        public void GoToMainWindow () {
            // Switching to Parent window i.e Main Window.
            String MainWindow = driver.getWindowHandle();
            driver.switchTo().window(MainWindow);
        }

        public void assertByColour () {
            String expectedColour = "#42b72a";
            String ActualColour = driver. findElement(_createPage). getCssValue("background-color");
            String hexColour = Color.fromString(ActualColour).asHex();
            String Actulcolour = hexColour;
            Assert.assertEquals(Actulcolour, expectedColour);
            System.out.println("Button color: " + ActualColour);

        }
    }
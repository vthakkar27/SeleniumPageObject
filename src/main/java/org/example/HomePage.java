package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Util {
    private By _registerButton = By.linkText("Register");
    private By _searchInputBox = By.id("small-searchterms");
    private By _WelcomeTitleText = By.xpath("//div[@class=\"topic-block-title\"]/h2");
    String expectedTitleOfThePage = "Welcome to our store";

    private By _Computer = By.linkText("Computers");
    private By _Books = By.linkText("Books");

    public void verifysOnHomePage() {
        getTextFromElement(_WelcomeTitleText);
        Assert.assertEquals(_WelcomeTitleText, expectedTitleOfThePage);

    }

    public void clickOnRegisterButton() {

        clickOnElement(_registerButton,20);


    }
    public void clickOnComputerButton(){
        clickOnElement(_Computer,20);
    }
    public void clickOnBookButton(){
        clickOnElement(_Books,30);
    }
}
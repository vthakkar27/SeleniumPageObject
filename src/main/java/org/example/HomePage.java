package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends Util {
    private By _registerButton = By.linkText("Register");
    private By _searchInputBox = By.id("small-searchterms");
    private By _WelcomeTitleText = By.xpath("//div[@class=\"topic-block-title\"]/h2");
    String expectedTitleOfThePage = "Welcome to our store";

    private By _Computer = By.linkText("Computers");
    private By _Books = By.linkText("Books");
    private By _SerchButton = By.xpath("//input[@class=\"button-1 search-box-button\"]");
    private By _FaceBookButton = By.linkText("Facebook");
    private By _newsDetailButton = By.xpath("//div[@class=\"news-list-homepage\"]//div[1]/div[3]/a[1]");
    private By _Currencyselect = By.xpath("//select[@id=\"customerCurrency\"]");


    public void verifysOnHomePage() {
        //getStringFromElement(_WelcomeTitleText);
      //  Assert.assertEquals(_WelcomeTitleText, expectedTitleOfThePage);

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

    public void clickOnSearchButton()
    {
        clickOnElement(_SerchButton,20);}

        public void handleAlertMessage(){
        // Switching to Alert
        Alert alert = driver.switchTo().alert();
        // Capturing alert message.
        String alertMessage= driver.switchTo().alert().getText();
        // Displaying alert message
        System.out.println(alertMessage);
        String expectedMessage = "Please enter some search keyword";
        Assert.assertEquals(alertMessage,expectedMessage);
        driver.switchTo().alert().accept();

    }
    public void clickOnFaceBook(){
        clickOnElement(_FaceBookButton,30);
    }
    public void clickOnDetailButton(){
        clickOnElement(_newsDetailButton,40);

    }
    public void SelectCurrency() { //Method to select currency from homepage

        clickOnElement(_Currencyselect, 20); //click on currency button

        Select currency = new Select(driver.findElement(_Currencyselect));//select Euro currency
        currency.selectByVisibleText("Euro");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//Wait time 30 second

        List<WebElement> ProductName = driver.findElements(By.className("prices"));
        for (WebElement Product : ProductName) //For each loop for confirming currency symbol of four products
            System.out.println(Product.getText().contains("")); // Print result of four products with Euro and prices
    }
    public void AssertCurrency () { //Method to assert currency and symbol

        String expectedTitle = "€21.50";
        String actualText1 = getTextFromElement(By.xpath("//span[text()='€21.50']"));
        Assert.assertEquals(actualText1, expectedTitle);

    }

    }


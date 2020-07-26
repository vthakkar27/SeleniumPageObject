package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

import java.util.List;

public class TestSuit extends BaseTest {
    HomePage homePage = new HomePage();//creating object for homepage
    Registerpage registerpage = new Registerpage();//creating object for registerpage
    RegisterSuccesPage registerSuccesPage = new RegisterSuccesPage();//creating object for registration successpage
    Computer computer = new Computer();//creating object for computer
    Desktops desktops = new Desktops();//creating object for Desktops
    emailSuccesPage emailSuccesPage = new emailSuccesPage();//creating object for emailsuccesspage
    BookCart bookCart = new BookCart();//creating object for bookCart
    FaceBookPage faceBookPage = new FaceBookPage();
    OnlineStore onlineStore = new OnlineStore();
    IFrameChar iFrameChar = new IFrameChar();


    @Test
    public void verifyUserShouldAbleToRegisterSuccessfully() {

        //click on register button
        homePage.clickOnRegisterButton();
        // user enters registration details
        registerpage.userEntersRegistrationDetails();
        //user click on register-submit button
        registerpage.userClickOnRegisterSubmitButton();
        registerSuccesPage.verifyUserRegisterSuccessfully();
    }

    @Test
    public void userShouldBeAbleToEmailFriendSuccessfully() {
        //click on registration method
        homePage.clickOnRegisterButton();
        //user enters registration details
        registerpage.userEntersRegistrationDetails();
        //user click on register-submit button
        registerpage.userClickOnRegisterSubmitButton();
        homePage.clickOnComputerButton();
        computer.userClickOnDesktop();
        desktops.ClickOnEmailFriend();
        // emailSuccesPage.emailAfriendMessage();
        homePage.clickOnSearchButton();
    }

    @Test
    public void VeryFyEachProductHaveName() {


        List<WebElement> ProductName = driver.findElements(By.xpath("//div[contains(@class,'product')]/div[2]/div/div[1]/div[2]/h2/a"));
        for (WebElement Product : ProductName)
            System.out.println(Product.getText());
    }

    @Test
    public void userShouldBeAbleToAddTheItemInCartSuccessfully() {
        //Calling Book Method from homepage
        homePage.clickOnBookButton();
        //calling Enter item add to cart Method
        bookCart.userEnterItemAddToCart();
    }

    @Test
    public void userShouldBeAbleToVerifySearchButton()
    {
        homePage.clickOnSearchButton();
        homePage.handleAlertMessage();

    }
    @Test
    public void userClickOnFaceBookButton()
    {
        homePage.clickOnFaceBook();
        faceBookPage.UserIsOnHomeFaceBookPage();
        faceBookPage.AssertForURL();
        faceBookPage.CloseDriver();

    }
            @Test
            public void CheckingAssertForCreatePage()
        {
            homePage.clickOnFaceBook();
            faceBookPage.UserIsOnHomeFaceBookPage();
            faceBookPage.AssertForCreatePage();
            faceBookPage.CloseDriver();
            }
            @Test
             public void ChekingTheColour()
            {
                homePage.clickOnFaceBook();
                faceBookPage.UserIsOnHomeFaceBookPage();
                faceBookPage.assertByColour();
                 faceBookPage.CloseDriver();
            }
            @Test
             public void NewOnlineStoreIsOpen()
            {
             homePage.clickOnDetailButton();
             onlineStore.verifyLeaveYourComment();
             onlineStore.AssertForOnlineURL();
             onlineStore.AssertforNewCommentMessageSuccesfully();
             onlineStore.VerifyOwnComment();

            }

        @Test
    public void CheckingIFrameForCharTech(){
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        iFrameChar.verifyIFrameURL();
        iFrameChar.SwitchtoIframes();

        }
        @Test
    public void CheckingForCurrency(){
        homePage.SelectCurrency();
        homePage.AssertCurrency();
        }



}
package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    HomePage homePage = new HomePage();//creating object for homepage
    Registerpage registerpage = new Registerpage();//creating object for registerpage
    RegisterSuccesPage registerSuccesPage = new RegisterSuccesPage();//creating object for registration successpage
    Computer computer = new Computer();//creating object for computer
    Desktops desktops = new Desktops();//creating object for Desktops
    emailSuccesPage emailSuccesPage = new emailSuccesPage();//creating object for emailsuccesspage
    BookCart bookCart = new BookCart();//creating object for bookcart


    @Test
    public void verifyUserShouldAbleToRegisterSuccessfully() {

        //click on register button
        homePage.clickOnRegisterButton();
        // user enters registration details
        registerpage.userEntersRegistrationDetails();
        //user click on register-submit button
        registerpage.userClickOnRegisterSubmitButton();
       // registerSuccesPage.verifyUserRegisterSuccessfully();
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
        }

       @Test
        public void userShouldBeAbleToAddTheItemInCartSuccessfully(){
        //Calling Book Method from homepage
        homePage.clickOnBookButton();
        //calling Enter item add to cart Method
        bookCart.userEnterItemAddToCart();









        }


    }

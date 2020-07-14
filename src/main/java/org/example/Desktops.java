package org.example;

import org.openqa.selenium.By;

public class Desktops extends Util{
  //  private By _desktops = By.linkText("Desktops");
    private By _digitalStorm = By.linkText("Digital Storm VANQUISH 3 Custom Performance PC");
    private By _emailFriend = By.xpath("//input[@value=\"Email a friend\"]");
    private By _typeFriendEmail =By.xpath("//input[@id=\"FriendEmail\"]");
    private By _typeYourEmail = By.xpath("//input[@id=\"YourEmailAddress\"]");
    private By _typeText = By.xpath("//textarea[@id=\"PersonalMessage\"]");
    private By _sendEmail = By.xpath("//input[@name=\"send-email\"]");


    public void ClickOnEmailFriend(){
       // clickOnElement(_desktops,10);
        clickOnElement(_digitalStorm,20);
        clickOnElement(_emailFriend,20);
        typeText(_typeFriendEmail,"jaiswaminarayan2020@yahoo.com",20);
       // typeText(_typeYourEmail,"dasvthakkar27@gmail.com",20);
        typeText(_typeText,"Happy Rakshabandhan",20);
        clickOnElement(_sendEmail,10);

    }
}

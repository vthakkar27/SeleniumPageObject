package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class emailSuccesPage extends Util {
    private By _emailSendSuccessMessage = By.linkText("Digital Storm VANQUISH 3 Custom Performance PC");
    String expectedMessageMessage = "Digital Storm VANQUISH 3 Custom Performance PC";

public void emailAfriendMessage(){
    getTextFromElement(_emailSendSuccessMessage);
    Assert.assertEquals(_emailSendSuccessMessage,expectedMessageMessage);
}


}

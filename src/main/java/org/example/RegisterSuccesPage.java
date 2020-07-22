package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterSuccesPage extends Util{
    private By _registerSuccessMessage = By.xpath("//div[@class=\"result\"]");
    String expectedRegisterSuccessMessage = "Your registration completed";

    public void verifyUserRegisterSuccessfully(){
        Assert.assertEquals(getTextFromElement(_registerSuccessMessage),expectedRegisterSuccessMessage);
    }

}

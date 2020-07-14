package org.example;

import org.openqa.selenium.By;

public class Computer extends Util{
    private By _desktop = By.linkText("Desktops");

    public void userClickOnDesktop(){
        clickOnElement(_desktop,30);


    }


}

package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Registerpage extends Util {
    private By _firstName = By.id("FirstName");
    private By _lastName = By.xpath("//input[@id=\"LastName\"]");
    private By _dateOfBirthday = By.xpath("//select[@name='DateOfBirthDay']");
    private By _dateOfBirthMonth = By.xpath("//select[@name='DateOfBirthMonth']");
    private By _dateOfBirthyear = By.name("DateOfBirthYear");
    private By _emailField = By.name("Email");
    private By _CompanyName = By.id("Company");
    private By _password = By.id("Password");
    private By _confirmpassword = By.xpath("//input[@id='ConfirmPassword']");
    private By _registerSubmitButton = By.id("register-button");


 public void userEntersRegistrationDetails() {
     typeText(_firstName, "Vaishali",10);
     typeText(_lastName, "Thakkar",10);
     selectFromDropDownByVisibleIndex(_dateOfBirthday, 27);
     selectFromDropDownByVisibleText(_dateOfBirthMonth, "October");
     selectFromDropDownByValue(_dateOfBirthyear, "1980");
     typeText(_emailField, "27vthakkar" + timestamp() + "@gmail.com",10);
     typeText(_CompanyName, "ABC LTD",10);
     typeText(_password, "das2020",30);
     typeText(_confirmpassword, "das2020",10);
 }
     public void userClickOnRegisterSubmitButton() {
     clickOnElement(_registerSubmitButton,30);

     }

    //  public void userIsOnRegisterPage(){
     //     Assert.assertTrue(driver.getCurrentUrl().contains("register"),"User is on Register Page");


}




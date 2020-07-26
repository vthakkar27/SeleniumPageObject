package org.example;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {
    HomePage homePage = new HomePage();
    Registerpage registerpage = new Registerpage();
    RegisterSuccesPage registerSuccesPage = new RegisterSuccesPage();

    @Given("^user is on homepage$")
    public void user_is_on_homepage() {


           }
    @When("^user clicks on register button$")
    public void user_clicks_on_register_button()  {
        homePage.clickOnRegisterButton();
    }

    @When("^user enters all required registration details$")
    public void user_enters_all_required_registration_details() {
      registerpage.userEntersRegistrationDetails();
    }
    @When("^user clicks on register-submit button$")
    public void user_clicks_on_register_submit_button()  {
        registerpage.userClickOnRegisterSubmitButton();


    }
    @Then("^user should be able to register successfully$")
    public void user_should_be_able_to_register_successfully()  {

        registerSuccesPage.verifyUserRegisterSuccessfully();

    }

}

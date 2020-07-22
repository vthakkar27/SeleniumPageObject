package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class OnlineStore extends Util {
    private By _leaveTittle = By.xpath("//input[@class=\"enter-comment-title\"]");
    private By _typeComment = By.xpath("//textarea[@class=\"enter-comment-text\"]");
    private By _clickOnCommentButton = By.xpath("//input[@name=\"add-comment\"]");
    private By _verifyNewComment = By.xpath("//div[@class=\"result\"]");
    String expectedCommentMessage = "News comment is successfully added.";
    private By _ownComment = By.xpath("//div[@class=\"comments\"]/div[3]/div[2]/div[2]");
    String expectedOwmTitle = "BestProduct21";


    public void AssertForOnlineURL ()
    {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://demo.nopcommerce.com/new-online-store-is-open");
    }

        public void verifyLeaveYourComment(){
        typeText(_leaveTittle,"BestProduct21",20);
        typeText(_typeComment,"HelloVipulBhai",20);
        clickOnElement(_clickOnCommentButton,20);
        }
        public void AssertforNewCommentMessageSuccesfully (){
        Assert.assertEquals(getTextFromElement(_verifyNewComment),expectedCommentMessage);
        }
        public void VerifyOwnComment(){
        Assert.assertEquals(getTextFromElement(_ownComment),expectedOwmTitle);


        }




    }

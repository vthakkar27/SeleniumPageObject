package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest  extends Util{
    BrowserManager browserManager = new BrowserManager();


    @BeforeMethod
    public void openBrowser(){
        browserManager.initialiseMethod();

    }

  @AfterMethod

    public void CloseBrowser(ITestResult result)
  { //Method to close browser
        if (ITestResult.FAILURE == result.getStatus())
        {
            ScreenShotCapture(result.getName()+timestamp());
        }
        browserManager.closingMethod();
  }
   // public void closeBrowser(){
   //    browserManager.closingMethod();

   // }

}

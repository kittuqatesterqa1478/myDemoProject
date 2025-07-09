package demoQaTests.testdemoqa.AlertsFrameWindows;

import Listerners.TestListener;
import Utilities.RetryUtilities;
import Utilities.SwitchToUtility;
import demoQaTests.base.BaseTest;
import demoqa.pages.AlertsFrameWindows.AlertsPage;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestListener.class)
public class AlertTest extends BaseTest {
    @Test(retryAnalyzer = RetryUtilities.class) 
    public void infoAlertTest(){
        SwitchToUtility ste = new SwitchToUtility(driver);
      var alertPage = homepage.gotoAlertsPage();
      alertPage.clickAlertsMenu();
      alertPage.clickAlertButton();
      String expectedAlertText = "You clicked a button";
      Assert.assertEquals(ste.getAlertText(),expectedAlertText,"alert does not match" );
      ste.acceptAlert();

    }
    @Test
    public void confirmAlertTest(){
        AlertsPage ap = new AlertsPage(driver);
        SwitchToUtility stu = new SwitchToUtility(driver);
     var confirmAlertPage = homepage.gotoAlertsPage();
        confirmAlertPage.clickAlertsMenu();
     confirmAlertPage.clickConfirmAlertButton();
        stu.dismissAlert();
     String expectedText = "You selected Cancel";
      Assert.assertEquals(ap.confirmResult(),expectedText, "text does not match");

    }
    @Test
    public void confirmPromptAlertTest(){
        AlertsPage ap = new AlertsPage(driver);
        String alterText = "prompt text";
        SwitchToUtility ste = new SwitchToUtility(driver);
        var promptalertPage = homepage.gotoAlertsPage();
        promptalertPage.clickAlertsMenu();
        promptalertPage.clickPrompt();
        ste.setAlertText(alterText);
        ste.acceptAlert();
        String actual = ap.promptResult();
        Assert.assertEquals(actual,"You entered "+ alterText,"does not match");
    }
}

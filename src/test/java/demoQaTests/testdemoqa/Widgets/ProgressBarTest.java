package demoQaTests.testdemoqa.Widgets;

import demoQaTests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ProgressBarTest extends BaseTest {
  //  WaitUtilities wtu=new WaitUtilities(driver);
@Test
    public void testProgressBar(){
    var testProgressBarPage = homepage.goToProgressBarPage();
    testProgressBarPage.clickProgressBarMenu();
    testProgressBarPage.clickStartButton();
   // wtu.fluentWaitUtil(10,);
    String actualText = testProgressBarPage.getProgressBarText();
    String expectedText = "100%";
    Assert.assertEquals(actualText,expectedText,"does not match");
}
}

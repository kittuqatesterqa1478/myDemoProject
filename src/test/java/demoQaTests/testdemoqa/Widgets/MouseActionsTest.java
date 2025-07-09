package demoQaTests.testdemoqa.Widgets;

import demoQaTests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MouseActionsTest extends BaseTest {
    @Test
    public void testMouseActions(){
      var testMouseActionsPage= homepage.gotoMouseActionsPage();
        testMouseActionsPage.clickSliderMenu();
        testMouseActionsPage.moveSliderAction();
       String actualValue =testMouseActionsPage.getSliderValue();
       String expectedValue ="100";
        Assert.assertEquals(actualValue,expectedValue,"does not match");


    }
}

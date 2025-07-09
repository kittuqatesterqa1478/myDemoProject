package demoQaTests.testdemoqa.AlertsFrameWindows;

import demoQaTests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowsTest extends BaseTest {
    @Test
    public void testNewWindowUrl(){
        var testNewwindowpage = homepage.goToWindowsPage();
        testNewwindowpage.clickNewTab();
      String expectedUrl =  testNewwindowpage.getWindowUrl();
      String actualUrl= "https://demoqa.com/sample";
        Assert.assertEquals(actualUrl,expectedUrl, "does not match");
    }
}

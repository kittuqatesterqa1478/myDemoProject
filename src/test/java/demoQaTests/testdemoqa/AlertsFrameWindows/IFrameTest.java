package demoQaTests.testdemoqa.AlertsFrameWindows;

import demoQaTests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IFrameTest extends BaseTest {
    @Test
    public void testBigIframes() throws InterruptedException {
    var testiframesbig = homepage.gotoIFramePage();
        testiframesbig.clickFramesMenu();
     String actualIFrameText= testiframesbig.getBigIFramesText();
     String expectedIFrameText = "This is a sample page";
        Assert.assertEquals(actualIFrameText,expectedIFrameText,"does not match");
        String actualHeaderFrameText = testiframesbig.getHeaderFrameText();
        String expectedHeaderFrameText = "Frames";
        Assert.assertEquals(actualHeaderFrameText,expectedHeaderFrameText,"does not match");
    }

    @Test
    public void testSmallIframes() throws InterruptedException {
        var testiframesmall = homepage.gotoIFramePage();
        testiframesmall.clickFramesMenu();
        String actualIFrameText= testiframesmall.getSmallIFramesText();
        String expectedIFrameText = "This is a sample page";
        Assert.assertEquals(actualIFrameText,expectedIFrameText,"does not match");

    }


}


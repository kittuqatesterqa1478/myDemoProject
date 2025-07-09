package demoQaTests.testdemoqa.ElementsTest;

import demoQaTests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicElementsTest extends BaseTest {
    @Test
    public void testDynamicPropertiesPage(){
      var dynamicPropertiesPage = homepage.goToDynamicPage();
        dynamicPropertiesPage.clickDynamicProperties();
       String actualText= dynamicPropertiesPage.getVisibleAfterText();
       String expectedText= "Visible After 5 Seconds";
        Assert.assertEquals(actualText,expectedText,"Does not match");
    }
}

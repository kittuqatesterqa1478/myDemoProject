package demoQaTests.testdemoqa.ElementsTest;

import demoQaTests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinksPageTest extends BaseTest {
    @Test
    public void testBadRequest(){
     var linkPage = homepage.gotoElements().clickLinks();
     linkPage.clickBadRequestLink();
     String adctualResponse =linkPage.getbadRequestResponse();
     String expectedResponse = "Link has responded with staus 400 and status text Bad Request";
        Assert.assertEquals(adctualResponse,expectedResponse,"not matching");


    }
}

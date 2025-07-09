package demoQaTests.testdemoqa.ElementsTest;

import demoQaTests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTablesTest extends BaseTest {
 @Test
    public void testWebTables(){
  String email = "alden@example.com";
     var webTablesPage = homepage.gotoElements().clickWebTables();
     webTablesPage.clickEditButton(email);
     webTablesPage.setAge("32");
     webTablesPage.clickSubmitButton();
      String actualage =webTablesPage.getAge(email);
     String expectedage= "32";
  Assert.assertEquals(actualage,expectedage,"actual and expected does not match");
 }
}

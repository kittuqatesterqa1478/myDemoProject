package demoQaTests.testdemoqa.Widgets;

import demoQaTests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DatePickerTest extends BaseTest {
   @Test
   public void testSelectingDate(){
       String day = "19";
       String month = "November";
       String monthValue = "11";
       String year = "2000";
       var datePicker = homepage.gotoWidgetsPageDate();
       datePicker.clickDatePicker();
       datePicker.SelectDateField();
       datePicker.selectMonth(month);
       datePicker.selectYear(year);
       datePicker.clickDay(day);
      String actualDate = datePicker.getDate();
      String ExpectedDate = monthValue +"/"+ day +"/"+ year;
      System.out.println(actualDate);
       System.out.println(ExpectedDate);
       Assert.assertEquals(actualDate,ExpectedDate,"actual date and expected dates do not match");

   }

}

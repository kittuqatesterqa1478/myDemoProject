package demoqa.pages.Widgets;

import Utilities.DropdownUtilities;
import Utilities.JavaScriptExecutor;
import demoqa.pages.BasePages.BasePageDqa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatePickerPage extends BasePageDqa {
    public DatePickerPage(WebDriver driver) {
        super(driver);
    }
    private By DatePicker = By.xpath("//span[text()='Date Picker']");
    private By SelectDate = By.id("datePickerMonthYearInput");
    private By monthDropDown = By.className("react-datepicker__month-select");
    private By yearDropDown = By.className("react-datepicker__year-select");
    private  By dayValue(String day){ 
        return By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='"+ day +"']");
    }
    public void clickDay(String day){
        click(dayValue(day));
    }
    public boolean isDayInMonth(String day){
     return find(dayValue(day)).isDisplayed();
    }
    public void clickDatePicker (){
        JavaScriptExecutor jse = new JavaScriptExecutor(driver);
        jse.scrollToElementJS(DatePicker);
        click(DatePicker);
    }
    public void SelectDateField(){
        click(SelectDate);
    }
public String getDate(){
    String date = find(SelectDate).getDomAttribute("value");
        return date;
}

 public void selectMonth(String month){
     DropdownUtilities du = new DropdownUtilities(driver);
     du.selectByVisibleText(monthDropDown,month);

 }
    public void selectYear(String year){
        DropdownUtilities du = new DropdownUtilities(driver);
        du.selectByVisibleText(yearDropDown,year);

}


}


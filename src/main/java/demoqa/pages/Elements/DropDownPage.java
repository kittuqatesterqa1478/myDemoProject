package demoqa.pages.Elements;

import Utilities.DropdownUtilities;
import Utilities.JavaScriptExecutor;
import demoqa.pages.BasePages.BasePageDqa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class DropDownPage extends BasePageDqa {
    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    //  private By selectVolvo = By.xpath("//option[@value='volvo']");
    private By selectMulti = By.id("cars");
    private By clickMenuOption = By.xpath("//span[text()='Select Menu']");

    public void selectMenuOption() {
        JavaScriptExecutor jse = new JavaScriptExecutor(driver);
        Delay(10000);
        jse.scrollToElementJS(clickMenuOption);
        click(clickMenuOption);
    }

    public void selectMulti(String text) {
        JavaScriptExecutor jse = new JavaScriptExecutor(driver);
        jse.scrollToElementJS(selectMulti);
        DropdownUtilities du = new DropdownUtilities(driver);
        du.selectByVisibleText(selectMulti, text);
    }

    public void selectMulti(int index) {
        JavaScriptExecutor jse = new JavaScriptExecutor(driver);
        jse.scrollToElementJS(selectMulti);
        DropdownUtilities du = new DropdownUtilities(driver);
        du.selectByIndex(selectMulti, index);


    }

    public void deselectMulti(String value) {
        JavaScriptExecutor jse = new JavaScriptExecutor(driver);
        jse.scrollToElementJS(selectMulti);
        DropdownUtilities du = new DropdownUtilities(driver);
        du.deselectByValue(selectMulti, value);
    }
    public List<String> getAllSelectedoption(){
        DropdownUtilities du = new DropdownUtilities(driver);
        return du.getAllSelectedOptions(selectMulti);
    }
}
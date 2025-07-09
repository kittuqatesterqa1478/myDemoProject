package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.*;
import java.util.stream.Collectors;

public class DropdownUtilities extends Utility {
    public DropdownUtilities(WebDriver driver) {
        super(driver);
    }

    public Select findDropDown(By locator) {
        return new Select(driver.findElement(locator));
    }

    public void selectByVisibleText(By locator, String text) {
        findDropDown(locator).selectByVisibleText(text);
    }

    public void selectByIndex(By locator, int index) {
        findDropDown(locator).selectByIndex(index);

    }

    public void selectByValue(By locator, String value) {
        findDropDown(locator).selectByValue(value);

    }

    public void deselectByValue(By locator, String value) {
        findDropDown(locator).deselectByValue(value);

    }
    public  List<String> getAllSelectedOptions(By locator){
        List<WebElement> allSelectedOptions = findDropDown(locator).getAllSelectedOptions();
        return allSelectedOptions.stream().map(WebElement::getText).collect(Collectors.toList());

    }
}

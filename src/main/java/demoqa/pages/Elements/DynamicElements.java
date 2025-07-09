package demoqa.pages.Elements;

import Utilities.WaitUtilities;
import demoqa.pages.BasePages.BasePageDqa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicElements extends BasePageDqa {
    public DynamicElements(WebDriver driver) {
        super(driver);
    }
    WaitUtilities wu = new WaitUtilities(driver);
    private By dynamicElementsMenu = By.xpath("//span[text()='Dynamic Properties']");
    private By visibleAfterMenu = By.xpath("//button[@id='visibleAfter']");
    public void clickDynamicProperties(){
    click(dynamicElementsMenu);
}
public String getVisibleAfterText(){
        wu.explicitWait(5,visibleAfterMenu);
     String visibleAfterText=   find(visibleAfterMenu).getText();
     return visibleAfterText;
}


}

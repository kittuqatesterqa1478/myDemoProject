package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtilities extends Utility{
    public ActionUtilities(WebDriver driver) {
        super(driver);
    }
    public void dragAndDropUtility(WebElement source, int x, int y){
        Actions action = new Actions(driver);
        action.dragAndDropBy(source,x,y).perform();
    }
}

package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToUtility extends Utility{

    public SwitchToUtility(WebDriver driver) {
        super(driver);
    }

private WebDriver.TargetLocator switchTo(){
        return driver.switchTo();
}
public String getAlertText(){
   return switchTo().alert().getText();

}
public void acceptAlert(){
        switchTo().alert().accept();
}
public void dismissAlert(){
        switchTo().alert().dismiss();
}
public void setAlertText(String promptText){
        switchTo().alert().sendKeys(promptText);
}
    public void switchToDefaultContent(String value) {

        switchTo().defaultContent();
    }
    public void switchToIFrameString(String value) {

        switchTo().frame(value);
    }
    public void switchToIFrameIndex(int index) {
        switchTo().frame(index);

    }
    public void switchToFrameElement(WebElement element){
        switchTo().frame(element);
    }
    public void switchToWindow(String windowHandle){
        switchTo().window(windowHandle);
    }
}

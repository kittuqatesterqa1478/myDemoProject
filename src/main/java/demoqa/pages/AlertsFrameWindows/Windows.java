package demoqa.pages.AlertsFrameWindows;

import Utilities.SwitchToUtility;
import demoqa.pages.BasePages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.*;

public class Windows extends HomePage {
    public Windows(WebDriver driver) {
        super(driver);
    }
    // types of windows - 1. getWindowHandle() , 2. getWindowHandles() , 3. switchTo().window()
private By newTabButton =By.id("tabButton");
    private By windowsCard = By.xpath("//span[text()='Browser Windows']");
    SwitchToUtility stu = new SwitchToUtility(driver);
    public void clickNewTab(){
        find(windowsCard).click();
        find(newTabButton).click();
    }
   public String getWindowUrl() {
       String currentWindow = driver.getWindowHandle();
       Set<String> allWindows = driver.getWindowHandles();

       String switchedWindowUrl = null; // if we want to use any varibale that we will get in any loop , then we should
       // first declare it outside the loop with null otherwise it will be out of scope
       for (String window : allWindows) {
           if (!window.equals(currentWindow)) {
               driver.switchTo().window(window);
               switchedWindowUrl = driver.getCurrentUrl();
               break; // optional: only switch once
           }
       }
       return switchedWindowUrl;
   }
}

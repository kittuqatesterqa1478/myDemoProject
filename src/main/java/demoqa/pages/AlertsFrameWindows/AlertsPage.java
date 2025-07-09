package demoqa.pages.AlertsFrameWindows;

import Utilities.JavaScriptExecutor;
import demoqa.pages.BasePages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage extends HomePage {
    public AlertsPage(WebDriver driver) {
        super(driver);
    }
   private By alertsMenu =By.xpath("//span[text()='Alerts']");
    private By alertButton = By.id("alertButton");
    private By confirmAlertButton= By.id("confirmButton");
    private By confirmResult = By.id("confirmResult");
    private By promptAlertButton = By.id("promtButton");
    private By promptResult = By.id("promptResult");

    public void  clickAlertsMenu(){
        JavaScriptExecutor jse =new JavaScriptExecutor(driver);
        jse.scrollToElementJS(alertsMenu);
        click(alertsMenu);
    }
public void clickAlertButton(){
        click(alertButton);
}
public void clickConfirmAlertButton(){
        click(confirmAlertButton);
}
public String confirmResult(){
   return find(confirmResult).getText();
}
public void clickPrompt(){
        click(promptAlertButton);
}
    public String promptResult() {
        return find(promptResult).getText();
    }

}

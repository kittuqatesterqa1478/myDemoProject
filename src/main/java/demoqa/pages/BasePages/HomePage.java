package demoqa.pages.BasePages;

import demoqa.pages.AlertsFrameWindows.*;
import demoqa.pages.BasePages.BasePageDqa;
import demoqa.pages.Elements.DropDownPage;
import demoqa.pages.Elements.DynamicElements;
import demoqa.pages.Elements.ElementsPage;
import demoqa.pages.Forms.PracticeFormsPage;
import demoqa.pages.Widgets.DatePickerPage;
import demoqa.pages.Widgets.MouseActions;
import demoqa.pages.Widgets.ProgressBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.JavaScriptExecutor;

public class HomePage extends BasePageDqa {
public HomePage(WebDriver driver) {
super(driver);
}
JavaScriptExecutor jse =new JavaScriptExecutor(driver);
private By formsCard = By.xpath("//div[@class='card-body']//h5[text()='Forms']");
private By elementsCard = By.xpath("//div//h5[text()='Elements']");
    private By widgetsCard = By.xpath("//div/h5[text()='Widgets']");
    private By alertsCard = By.xpath("//div/h5[text()='Alerts, Frame & Windows']");
  //  private By windowsCard = By.xpath("//span[text()='Browser Windows']");



public PracticeFormsPage goToForms() {   
jse.scrollToElementJS(formsCard);
click(formsCard);
return new PracticeFormsPage(driver);
}
public ElementsPage gotoElements(){
jse.scrollToElementJS(elementsCard);
click(elementsCard);
return new ElementsPage(driver);
}
public DropDownPage gotoWidgetsPage(){
    jse.scrollToElementJS(widgetsCard);
    click(widgetsCard);
    return new DropDownPage(driver);

}
    public DatePickerPage gotoWidgetsPageDate(){
        jse.scrollToElementJS(widgetsCard);
        click(widgetsCard);
        return new DatePickerPage(driver);

}
public ModalPage gotoModalPage(){
    jse.scrollToElementJS(alertsCard);
    click(alertsCard);
    return new ModalPage(driver);
}
public AlertsPage gotoAlertsPage(){
    jse.scrollToElementJS(alertsCard);
    click(alertsCard);
    return new AlertsPage(driver);
}
public IFramePage gotoIFramePage(){
    jse.scrollToElementJS(alertsCard);
    click(alertsCard);
    return new IFramePage(driver);
}
public Windows goToWindowsPage(){
    jse.scrollToElementJS(alertsCard);
    click(alertsCard);
    return new Windows(driver);
}
public DynamicElements  goToDynamicPage(){
    jse.scrollToElementJS(elementsCard);
    click(elementsCard);
    return new DynamicElements(driver);
}
public ProgressBar goToProgressBarPage(){
    jse.scrollToElementJS(widgetsCard);
    click(widgetsCard);
    return new ProgressBar(driver);
}
    public MouseActions gotoMouseActionsPage(){
        jse.scrollToElementJS(widgetsCard);
        click(widgetsCard);
        return new MouseActions(driver);

    }

}

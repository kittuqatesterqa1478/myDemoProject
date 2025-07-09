package demoqa.pages.AlertsFrameWindows;

import Utilities.JavaScriptExecutor;
import demoqa.pages.BasePages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalPage extends HomePage {

    public ModalPage(WebDriver driver) {
        super(driver);
    }
    private By modalDialogsMenu = By.xpath("//span[text()='Modal Dialogs']");
    private By smallModalCard = By.id("showSmallModal");
    private By modalBody = By.className("modal-body");
    private By closeModalButton = By.id("closeSmallModal");

    public void clickModalDialogs(){
        JavaScriptExecutor jse =new JavaScriptExecutor(driver);
        jse.scrollToElementJS(modalDialogsMenu);
        click(modalDialogsMenu);
    }
    public void clickSmallModal(){
        click(smallModalCard);

    }
    public String getModalText(){
   String modalBodyText= find(modalBody).getText();
    return modalBodyText;
    }
    public void closeModal(){
        click(closeModalButton);
    }
}

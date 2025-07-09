package demoqa.pages.Elements;

import Utilities.JavaScriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinksPage extends ElementsPage{


    public LinksPage(WebDriver driver) {
        super(driver);
    }

private By badReuquestLink = By.xpath("//a[@id='bad-request']");
    private By badRequestResponse= By.xpath("//p[text()='Link has responded with staus ']");
    public void clickBadRequestLink(){
    click(badReuquestLink);
    }
public String getbadRequestResponse(){
    JavaScriptExecutor jse =new JavaScriptExecutor(driver);
        jse.Delay(10000);
 String response=  find(badRequestResponse).getText();
 return response;
}


}

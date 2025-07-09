package demoqa.pages.Elements;

import demoqa.pages.BasePages.BasePageDqa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends BasePageDqa {

    public ElementsPage(WebDriver driver) {
        super(driver);
    }
private By webTablesMenu= By.xpath("//li[@id='item-3']/span[text()='Web Tables']");
    private By clickLinksMenu = By.xpath("//span[text()='Links']");

public WebTablesPage clickWebTables(){
click(webTablesMenu);
return new WebTablesPage(driver);
}
public LinksPage clickLinks(){
click(clickLinksMenu);
return new LinksPage(driver);
}
}

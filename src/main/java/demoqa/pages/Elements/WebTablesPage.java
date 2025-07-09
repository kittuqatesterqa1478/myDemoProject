package demoqa.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTablesPage extends ElementsPage{
    public WebTablesPage(WebDriver driver) {
        super(driver);
    }
    private By ageField = By.xpath("//input[@id='age']");
    private By submitButton = By.xpath("//button[@id='submit']");

    public void clickEditButton(String email){
    By editButton = By.xpath("//div[text()='"+email+"']/following::span[@title='Edit'][1]"); // use elements which does not change
        click(editButton);
}
public void setAge(String age){
 set(ageField,age);
    }
    public void clickSubmitButton(){
    click(submitButton);
    }
    public String getAge(String email){
   By tableAge = By.xpath("//div[text()='alden@example.com']/preceding::div[1]");
   return find(tableAge).getText();


    }
}

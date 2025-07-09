package demoqa.pages.Forms;

import Utilities.JavaScriptExecutor;
import demoqa.pages.BasePages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeFormsPage extends HomePage {

public PracticeFormsPage(WebDriver driver) {
super(driver);
}
    JavaScriptExecutor jse =new JavaScriptExecutor(driver);
private By femaleRadioBtn = By.xpath("//label[@for ='gender-radio-2']");
private By sportsCheckBox = By.xpath("//label[@for='hobbies-checkbox-1']");
private By readingCheckBox = By.xpath("//label[@for='hobbies-checkbox-2']");
private By musicCheckBox = By.xpath("//label[@for='hobbies-checkbox-3']");
    private By practiceFormsMenu = By.xpath("//span[text()='Practice Form']");
    public void clickPracticrForm() {
        jse.scrollToElementJS(practiceFormsMenu);
        click(practiceFormsMenu);
    }

public void clickFemaleRadioBtn() {
jse.scrollToElementJS(femaleRadioBtn);
//Delay(10000);
click(femaleRadioBtn);
jse.scrollToElementJS(sportsCheckBox);
}

//jse.scrollToElementJS(sportsCheckBox);

public boolean isFemaleSelected() {
    return find(femaleRadioBtn).isSelected();
}
public void clickSportsCheckBox() {
    jse.scrollToElementJS(sportsCheckBox);
    click(sportsCheckBox);
}
public void clickReadingCheckBox(){
 if(!find(readingCheckBox).isSelected()) {
        jse.scrollToElementJS(readingCheckBox);
        click(readingCheckBox);
 }
}
    public void clickMusicCheckBox(){
        if(!find(musicCheckBox).isSelected() ){
            jse.scrollToElementJS(musicCheckBox);
            click(musicCheckBox);
        }

         /*   public boolean musicCheckBoxSelected () {

                return find(sportsCheckBox).isSelected();
            }*/
        }}

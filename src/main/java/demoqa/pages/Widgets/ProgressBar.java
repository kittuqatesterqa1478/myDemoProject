package demoqa.pages.Widgets;

import Utilities.WaitUtilities;
import demoqa.pages.BasePages.BasePageDqa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProgressBar extends BasePageDqa {
    public ProgressBar(WebDriver driver) {
        super(driver);
    }
    private By progressBarMenu = By.xpath("//span[text()='Progress Bar']");
    private By startButton = By.xpath("//button[@id='startStopButton']");
    private By progressBarText= By.xpath("//div[@id='progressBar']//div[@aria-valuemax='100']");
    public void clickProgressBarMenu(){
        click(progressBarMenu);
    }
    public void clickStartButton(){
        click(startButton);
    }
    public String getProgressBarText(){
        WaitUtilities wtu=new WaitUtilities(driver);
        wtu.fluentWaitUtil(60,progressBarText);
    return find(progressBarText).getText();
    }
}
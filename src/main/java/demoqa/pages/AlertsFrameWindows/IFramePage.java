package demoqa.pages.AlertsFrameWindows;

import Utilities.JavaScriptExecutor;
import Utilities.SwitchToUtility;
import demoqa.pages.BasePages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IFramePage extends HomePage {
    public IFramePage(WebDriver driver) {
        super(driver);
    }

    //There are 3 ways to switch to iframes - Using String , Using Index , Using Webelement
    //To switch Using String , the DOM should have Id or Name attribute
    // If id and value are not present in the DOM for frame then we must use switching using Web Elements
    private By framesMenu = By.xpath("//span[text()='Frames']");
    private By textInFrame = By.id("sampleHeading");
    private String iFrameBigBox = "frame1";
    private int iFrameSamllBox= 4;
    private By headerFramesText = By.xpath("//div[@id='app']//h1[text()='Frames']");
    private By smallBoxElement = By.xpath("//div[@id='frame2Wrapper']");
    SwitchToUtility stu = new SwitchToUtility(driver);
    JavaScriptExecutor jse = new JavaScriptExecutor(driver);

    public void clickFramesMenu() {
        click(framesMenu);
    }

    private void switchToIFrameBig() {
        //driver.switchTo().frame(iFrameBigBox);
        stu.switchToIFrameString(iFrameBigBox);
    }

    private void switchToIFrameSmall() throws InterruptedException {
        //driver.switchTo().frame(iFrameSamllBox);
        Thread.sleep(5000);
        jse.scrollToElementJS(smallBoxElement);
       // stu.switchToIFrameIndex(iFrameSamllBox);
        stu.switchToFrameElement(find(smallBoxElement));
    }

    public String getHeaderFrameText() {
        return find(headerFramesText).getText();
    }

    public String getBigIFramesText() throws InterruptedException {
        switchToIFrameBig();
        Thread.sleep(3000);
        String bigBoxText = find(textInFrame).getText();
        // driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        return bigBoxText;

    }

    public String getSmallIFramesText() throws InterruptedException {
        switchToIFrameSmall();
        String smallBoxText = find(textInFrame).getText();
        // driver.switchTo().parentFrame();
    // driver.switchTo().defaultContent();
        return smallBoxText;
    }
}
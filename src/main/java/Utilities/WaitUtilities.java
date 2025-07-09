package Utilities;

import demoqa.pages.BasePages.BasePageDqa;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtilities extends BasePageDqa {
    public WaitUtilities(WebDriver driver) {
        super(driver);
    }
    public void explicitWait(int secs, By locator)
    {  // WebDriverWait is also a class and has many methods inside it
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(secs));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        // ExpectedConditions is also a class and has many methods inside it

    }
    public void fluentWaitUtil(int secs, By locator ){
        FluentWait fluentWait= new FluentWait(driver);
        fluentWait.withTimeout(Duration.ofSeconds(secs))
                .pollingEvery(Duration.ofMillis(10000)).ignoring(NoSuchElementException.class,
                        StaleElementReferenceException.class);
        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}

package demoqa.pages.BasePages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePageDqa {
public WebDriver driver ;
public BasePageDqa (WebDriver driver ) {
this.driver=driver;
}
protected WebElement find(By locator) { //it is kept protected becoz we want to resuse it only in Base class and page object classes
return driver.findElement(locator);
}
protected void set(By locator , String text) {
find(locator).clear();	
find(locator).sendKeys(text);
}
protected void click(By locator) {
find(locator).click();
}
public void Delay(int milliseconds) {
try {
Thread.sleep(milliseconds);
	
}catch(InterruptedException exc) {
exc.printStackTrace();
	
	
}
}
}



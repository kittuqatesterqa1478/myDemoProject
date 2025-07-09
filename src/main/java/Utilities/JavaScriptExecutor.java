package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor extends Utility {
public JavaScriptExecutor(WebDriver driver) {
super(driver);
}
public  void scrollToElementJS(By locator)	{
WebElement element = driver.findElement(locator);
String jsScript = "arguments[0].scrollIntoView();";
((JavascriptExecutor)driver).executeScript(jsScript, element);
}
public  void clickJS(By locator)	{
WebElement element = driver.findElement(locator);
JavascriptExecutor executor = (JavascriptExecutor)driver;
executor.executeScript("arguments[0].click;",element);
} 

}
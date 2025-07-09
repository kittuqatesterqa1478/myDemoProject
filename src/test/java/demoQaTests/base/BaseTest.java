package demoQaTests.base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.io.FileHandler;

import Utilities.JavaScriptExecutor;
import demoqa.pages.BasePages.BasePageDqa;
import demoqa.pages.BasePages.HomePage;

import java.io.File;
import java.io.IOException;
//import java.util.logging.FileHandler;

public class BaseTest {
public WebDriver driver;
protected BasePageDqa basepage;
protected HomePage homepage;
protected JavaScriptExecutor jsce;
private String qaurl = "https://demoqa.com/";

@BeforeClass
public void setUp () {
//WebDriverManager.chromedriver().setup();	
driver = new ChromeDriver();
driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    // Do not mix implicit wait with any other types of wait otherwise it will cause unpredictable wait timeouts
homepage = new HomePage(driver);
jsce = new JavaScriptExecutor(driver);
}

@BeforeMethod
public void loadApplication() {
driver.get(qaurl);
}

@AfterMethod
public void takeFailedResultScreenshot(ITestResult testResult){
if(ITestResult.FAILURE==testResult.getStatus()){
    TakesScreenshot screenshot = (TakesScreenshot) driver ;
 File source =  screenshot.getScreenshotAs(OutputType.FILE);
 File destination= new File(System.getProperty("user.dir")+ "/Resources/Screenshots/" + java.time.LocalDate.now()
         + testResult.getName() + ".png");
    try{
        FileHandler.copy(source,destination);
    } catch(IOException e )
    {
        throw new RuntimeException(e);
    }
System.out.println("screenshot located at" + destination);
}}

@AfterClass
public void tearDown() {
basepage = new BasePageDqa(driver);
basepage.Delay(3000);
driver.quit();
}
}

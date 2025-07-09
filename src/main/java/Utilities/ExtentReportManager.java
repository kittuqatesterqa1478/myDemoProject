package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;

public class ExtentReportManager extends Utility{
    public ExtentReportManager(WebDriver driver) {
        super(driver);
    }
    static ExtentReports extent = new ExtentReports() ;
    public static ExtentReports getReporter(){
        String reportPath = System.getProperty("user.dir")+"/test-output/ExtentReport.html";
        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
        extent.attachReporter(spark);
        extent.setSystemInfo("OS",System.getProperty("os.name"));
      //  extent.flush();
        return extent;
    }
}


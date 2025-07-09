package Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryUtilities extends Utility implements IRetryAnalyzer {


    private int count = 0;
    private int maxRetry = 2;

    public RetryUtilities(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean retry(ITestResult result){
        if (count<maxRetry){
            count++;
            return true;
        }
        return false;
    }
}

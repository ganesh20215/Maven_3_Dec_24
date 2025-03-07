package testng.listerners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryExample implements IRetryAnalyzer {

    private int retryCount = 0;
    private int maxCount = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (retryCount < maxCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}

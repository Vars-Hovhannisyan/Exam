package listener;

import org.apache.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener{

    private static final Logger LOGGER = Logger.getLogger(TestListener.class);

    @Override
    public void onTestStart(ITestResult result){
        LOGGER.info("PASSED ---->" + result.getMethod().getQualifiedName());
    }

    @Override
    public void onTestSuccess(ITestResult result){
        LOGGER.info("Started ---->" + result.getMethod().getQualifiedName());
    }

    @Override
    public void onTestFailure(ITestResult result){
        LOGGER.info("FAILED ---->" + result.getMethod().getQualifiedName());
    }

    @Override
    public void onTestSkipped(ITestResult result){
        LOGGER.info("SKIPPED ---->" + result.getMethod().getQualifiedName());
    }
}
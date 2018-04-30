package com.gett.automation.surefire;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * @author eladaz (eladaz@gett.com)
 * Created on 26/04/2018.
 */
public class TestNGListener extends JUnitListener implements ITestListener {

    public TestNGListener() {
        System.out.println("\n\n\nonTestStart .... ");
    }

    public void onTestStart(ITestResult result) {
        System.out.println("\n\n\nonTestStart .... " + result.getName());
    }

    private static String getName(ITestResult result) {
        if (result != null) {
            return result.getTestClass()
                    + " " + result.getMethod();
        } else {
            return "";
        }
    }


    public void onTestSuccess(ITestResult result) {
        testFinished(result);
    }

    private void testFinished(ITestResult result) {
        String execFileName = result.getTestClass() + "["
                + result.getMethod() + "]";

    }

    public void onTestFailure(ITestResult result) {
        testFinished(result);
    }


    public void onTestSkipped(ITestResult result) {
        testFinished(result);
    }


    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        testFinished(result);
    }


    public void onStart(ITestContext context) {
        System.out.println("\n\n\nonTestStart .... ");
    }


    public void onFinish(ITestContext context) {
        System.out.println("\n\n\nonTestStart .... ");
    }

}

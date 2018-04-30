package com.gett.automation.surefire;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;

/**
 * @author eladaz (eladaz@gett.com)
 * Created on 26/04/2018.
 */
public class JUnitListener extends RunListener {

    public JUnitListener() {

    }

    /**
     * Called when an atomic test is about to be started.
     */
    @Override
    public void testStarted(Description description) {
        System.out.println("\n\n\nStarting .... " + description.getMethodName());
    }

    /**
     * Called when test run is started
     *
     * @param description
     * @throws Exception
     */
    @Override
    public void testRunStarted(Description description) throws Exception {

    }

    /**
     * Called when test run is done
     *
     * @param result
     * @throws Exception
     */
    @Override
    public void testRunFinished(Result result) throws Exception {
        System.out.println("\n\n");
    }

    /**
     * Called when an atomic test has finished, whether the test succeeds or fails.
     */
    @Override
    public void testFinished(Description description) {
        System.out.println("Finished .... " + description.getMethodName());
    }
}

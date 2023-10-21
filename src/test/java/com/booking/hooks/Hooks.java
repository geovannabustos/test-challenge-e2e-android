package com.booking.hooks;

import com.booking.pages.GeneralPageObject;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    GeneralPageObject  generalPageObject;

    @Before
    public void startRecordVideo() {
    generalPageObject.onScenarioStart();
    }

    @After
    public void stopRecordVideo(){
        generalPageObject.onScenarioEnded();
    }
}

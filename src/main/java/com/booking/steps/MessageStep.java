package com.booking.steps;

import com.booking.pages.AlertPage;
import com.booking.pages.MessagePage;
import org.assertj.core.api.SoftAssertions;
import org.fluentlenium.core.annotation.Page;

public class MessageStep {
    private SoftAssertions softly = new SoftAssertions();

    @Page
    AlertPage alertPage;

    @Page
    MessagePage messagePage;

    public void verifyAlert(String messageValue){
        softly.assertThat(alertPage.verifyAlertValue(messageValue)).isTrue();
        softly.assertAll();
    }
    public void verifyMessage(String messageValue){
        softly.assertThat(messagePage.verifyTitleValue(messageValue)).isTrue();
        softly.assertAll();
    }
}

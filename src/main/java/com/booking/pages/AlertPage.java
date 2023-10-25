package com.booking.pages;

import net.serenitybdd.core.pages.WebElementFacade;

import io.appium.java_client.pagefactory.AndroidFindBy;


public class AlertPage extends GeneralPageObject{
    @AndroidFindBy (id= "com.booking:id/message")
    private WebElementFacade message;
    @AndroidFindBy (id = "com.booking:id/button_positive")
    private WebElementFacade btnOk;

    public Boolean verifyAlertValue(String messageValue){
        return message.getText().equals(messageValue);
    }
    public void tapBtnOk(){
        btnOk.click();
    }

}

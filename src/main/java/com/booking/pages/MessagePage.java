package com.booking.pages;

import net.serenitybdd.core.pages.WebElementFacade;

import io.appium.java_client.pagefactory.AndroidFindBy;


public class MessagePage extends GeneralPageObject{
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.booking:id/results_list_facet\"]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[@index=1]")
    private WebElementFacade title;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.booking:id/results_list_facet\"]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[@index=2]")
    private WebElementFacade message;

    public Boolean verifyTitleValue(String messageValue){
        return title.getText().contains(messageValue);
    }
    public Boolean verifyMessageValue(String messageValue){
        return message.getText().contains(messageValue);
    }

}

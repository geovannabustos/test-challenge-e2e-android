package com.booking.pages;

import net.serenitybdd.core.pages.WebElementFacade;

import io.appium.java_client.pagefactory.AndroidFindBy;


public class HomePage {
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Desplazarse hacia arriba\"]")
   // @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageButton\")");
    private WebElementFacade btnGoHome;

    public void tapBtnGoHome() {
        btnGoHome.waitUntilVisible().click();
    }
}

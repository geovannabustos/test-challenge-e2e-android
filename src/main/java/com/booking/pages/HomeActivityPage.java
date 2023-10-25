package com.booking.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeActivityPage extends GeneralPageObject {
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Desplazarse hacia arriba\"]")
    private WebElementFacade btnGoHome;

    public void tapBtnGoHome() {
        btnGoHome.waitUntilVisible().click();
    }
}

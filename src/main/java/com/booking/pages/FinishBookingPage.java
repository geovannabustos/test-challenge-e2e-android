package com.booking.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FinishBookingPage extends GeneralPageObject {
    @AndroidFindBy(id = "com.booking:id/new_credit_card_number_edit")
    private WebElementFacade txtCardNumber;
    @AndroidFindBy(id = "com.booking:id/new_credit_card_holder_edit")
    private WebElementFacade txtCardHolder;
    @AndroidFindBy(id = "com.booking:id/new_credit_card_expiry_date_edit")
    private WebElementFacade txtCardExpirationDate;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"com.booking:id/informative_cta_view_price_container\"]/android.widget.FrameLayout/android.widget.TextView[@resource-id=\"com.booking:id/title\"]")
    private WebElementFacade txtValueBooking;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"com.booking:id/informative_cta_view_price_container\"]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[@resource-id=\"com.booking:id/subtitle\"]")
    private WebElementFacade txtValueTaxes;
    @AndroidFindBy(id = "com.booking:id/action_button")
    private WebElementFacade btnBookNow;

    public void setTxtCardNumber(String cardNumberValue) {
        txtCardNumber.sendKeys(cardNumberValue);
    }

    public void setTxtCardHolder(String cardHolderValue) {
        txtCardHolder.sendKeys(cardHolderValue);
    }

    public void setTxtCardExpirationDate(String cardExpirationDateValue) {
        txtCardExpirationDate.sendKeys(cardExpirationDateValue);
    }

    public String getTxtValueBooking() {
        return txtValueBooking.getText();
    }

    public String getTxtValueTaxes() {
        return txtValueTaxes.getText();
    }

    public void tapBtnBookNow() {
        btnBookNow.click();
    }
}

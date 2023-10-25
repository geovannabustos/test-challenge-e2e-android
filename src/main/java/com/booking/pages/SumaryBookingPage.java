package com.booking.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SumaryBookingPage extends GeneralPageObject {
    @AndroidFindBy(id = "com.booking:id/bp_overview_hotelname")
    private WebElementFacade txtHotelName;
    @AndroidFindBy(id = "com.booking:id/checkin_date")
    private WebElementFacade txtCheckin;
    @AndroidFindBy(id = "com.booking:id/checkout_date")
    private WebElementFacade txtCheckout;
    @AndroidFindBy(id = "com.booking:id/subtitle")
    private WebElementFacade txtOption;
    @AndroidFindBy(id = "com.booking:id/bp_price_summary_total_price_value")
    private WebElementFacade txtValueBookingSummary;
    @AndroidFindBy(id = "com.booking:id/bp_price_summary_taxes_and_charges")
    private WebElementFacade txtValueTaxesSummary;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"com.booking:id/informative_cta_view_price_container\"]/android.widget.FrameLayout/android.widget.TextView[@resource-id=\"com.booking:id/title\"]")
    private WebElementFacade txtValueBooking;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"com.booking:id/informative_cta_view_price_container\"]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[@resource-id=\"com.booking:id/subtitle\"]")
    private WebElementFacade txtValueTaxes;
    @AndroidFindBy(id = "com.booking:id/action_button")
    private WebElementFacade btnFinalStep;

    public String getTxtCheckin() {
        return txtCheckin.getText();
    }

    public String getTxtCheckout() {
        return txtCheckout.getText();
    }

    public String getTxtOption() {
        return txtOption.getText();
    }

    public String getTxtValueBookingSummary() {
        return txtValueBookingSummary.getText();
    }

    public String getTxtValueTaxesSummary() {
        return txtValueTaxesSummary.getText();
    }

    public String getTxtValueBooking() {
        return txtValueBooking.getText();
    }

    public String getTxtValueTaxes() {
        return txtValueTaxes.getText();
    }

    public String getTxtHotelName() {
        return txtHotelName.getText();
    }

    public void tapBtnFinalStep() {
        btnFinalStep.click();
    }
}

package com.booking.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ConfirmationBookingPage extends GeneralPageObject {

    @AndroidFindBy(id = "com.booking:id/bookingStatusView")
    private WebElementFacade txtTitle;
    @AndroidFindBy(id = "com.booking:id/pb_reservation_header_title")
    private WebElementFacade txtHeaderTitle;
    @AndroidFindBy(id = "com.booking:id/pb_reservation_header_email")
    private WebElementFacade txtHeaderEmail;
    @AndroidFindBy(id = "com.booking:id/bui_bottom_sheet_close")
    private WebElementFacade btnClose;

    public void tapBtnClose() {
        btnClose.click();
    }

    public String getTxtTitle() {
        return txtTitle.getText();
    }

    public String getTxtHeaderTitle() {
        return txtHeaderTitle.getText();
    }

    public String getTxtHeaderEmail() {
        return txtHeaderEmail.getText();
    }
}

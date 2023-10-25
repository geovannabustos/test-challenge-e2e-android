package com.booking.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DetailHotelPage extends GeneralPageObject {
    @AndroidFindBy(id = "com.booking:id/property_name")
    private WebElementFacade hotelName;
    @AndroidFindBy(id = "com.booking:id/price_view_price")
    private WebElementFacade hotelValue;
    @AndroidFindBy(id = "com.booking:id/price_view_taxes_and_charges")
    private WebElementFacade hotelValueTaxes;

    @AndroidFindBy(id = "com.booking:id/rooms_guests_display")
    private WebElementFacade detailRoomAndGuest;
    @AndroidFindBy(id = "com.booking:id/select_room_cta")
    private WebElementFacade btnSelectRoom;

    public String getHotelName() {
        return hotelName.getText();
    }
    public String getHotelValue() {
        return hotelValue.getText();
    }
    public String getHotelValueTaxes(){
        return hotelValueTaxes.getText();
    }
    public String getDetailRoomAndGuest(){
        return detailRoomAndGuest.getText();
    }

    public void tapBtnSelectRoom() {
        btnSelectRoom.click();
    }


}

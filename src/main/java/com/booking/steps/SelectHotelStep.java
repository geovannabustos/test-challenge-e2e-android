package com.booking.steps;

import com.booking.pages.DetailHotelPage;
import com.booking.pages.ListHotelPage;
import com.booking.pages.RoomPage;
import org.fluentlenium.core.annotation.Page;

public class SelectHotelStep {
    @Page
    ListHotelPage listHotelPage;
    @Page
    DetailHotelPage detailHotelPage;
    @Page
    RoomPage roomPage;

    public void selectHotel(int itemHotelValue){
        listHotelPage.selectHotel(itemHotelValue);
    }

    public String getHotelName(){
        return detailHotelPage.getHotelName();
    }
    public String getHotelValue(){
        return detailHotelPage.getHotelValue();
    }
    public String getHotelValueTaxes(){
        return detailHotelPage.getHotelValueTaxes();
    }
    public String getDetailRoomAndGuest(){
        return detailHotelPage.getDetailRoomAndGuest();
    }
    public void selectRoom(){
        detailHotelPage.tapBtnSelectRoom();
        roomPage.tapBtnReserveOption();
    }
}

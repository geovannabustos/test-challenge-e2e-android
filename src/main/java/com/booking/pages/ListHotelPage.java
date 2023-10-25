package com.booking.pages;

import net.serenitybdd.core.annotations.findby.By;

public class ListHotelPage extends GeneralPageObject{

    public void selectHotel(int itemHotelValue) {
        String hotelValue = String.valueOf(itemHotelValue);
        getDriver().findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"com.booking:id/results_list_facet\"]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[@index="+hotelValue+"]/android.view.ViewGroup")).click();
    }
}

package com.booking.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RoomPage extends GeneralPageObject{

    @AndroidFindBy(id = "com.booking:id/recommended_block_reserve_button")
    private WebElementFacade btnReserveOption;

    public void tapBtnReserveOption(){
        btnReserveOption.click();
    }
}

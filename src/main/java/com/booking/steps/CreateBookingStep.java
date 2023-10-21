package com.booking.steps;

import com.booking.pages.HomePage;
import org.fluentlenium.core.annotation.Page;

public class CreateBookingStep {
    @Page
    HomePage homePage;

    public void tapBtnGoHome(){ homePage.tapBtnGoHome();}

}

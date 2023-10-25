package com.booking.steps;

import com.booking.pages.DatePickerCalendarPage;
import com.booking.pages.DestinationActivityPage;
import com.booking.pages.HomeActivityPage;
import com.booking.pages.ListHotelPage;
import com.booking.pages.OccupancyActivityPage;
import com.booking.pages.SearchActivityPage;

import org.fluentlenium.core.annotation.Page;

import java.util.List;

public class RegisterDetailBookingStep {
    @Page
    HomeActivityPage homeActivityPage;
    @Page
    SearchActivityPage searchActivityPage;
    @Page
    DestinationActivityPage destinationActivityPage;
    @Page
    DatePickerCalendarPage datePickerCalendarPage;
    @Page
    OccupancyActivityPage occupancyActivityPage;

    public void goHome(){
        homeActivityPage.tapBtnGoHome();
    }

    public void registerDataBooking(String destinationValue, String dateStartValue, String dateEndValue, int roomsCountValue, int adultsCountValue, int childrenCountValue, List<String> ageValues){
        searchActivityPage.tapItemDestination();
        destinationActivityPage.setDestination(destinationValue);
        destinationActivityPage.tapDestinationCity();
        datePickerCalendarPage.tapDateStart(dateStartValue);
        datePickerCalendarPage.tapDateEnd(dateEndValue);
        datePickerCalendarPage.tapSelectDates();
        searchActivityPage.tapItemOccupancy();
        occupancyActivityPage.setRoomsCount(roomsCountValue);
        occupancyActivityPage.setAdultsCount(adultsCountValue);
        occupancyActivityPage.setChildrenCount(childrenCountValue,ageValues);
        occupancyActivityPage.tapBtnApply();
        searchActivityPage.tapBtnSearch();
    }

}

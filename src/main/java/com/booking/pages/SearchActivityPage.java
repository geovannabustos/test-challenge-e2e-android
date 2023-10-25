package com.booking.pages;

import net.serenitybdd.core.pages.WebElementFacade;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class SearchActivityPage extends GeneralPageObject {
    @AndroidFindBy(id = "com.booking:id/facet_search_box_accommodation_destination")
    private WebElementFacade itemDestination;
    @AndroidFindBy(id = "com.booking:id/facet_search_box_accommodation_dates")
    private WebElementFacade itemDates;
    @AndroidFindBy(id = "com.booking:id/facet_search_box_accommodation_occupancy")
    private WebElementFacade itemOccupancy;
    @AndroidFindBy(id = "com.booking:id/facet_search_box_cta")
    private WebElementFacade btnSearch;

    public void tapItemDestination() {
        itemDestination.click();
    }

    public void tapItemOccupancy() {
        itemOccupancy.click();
    }

    public void tapItemDates() {
        itemDates.click();
    }

    public void tapBtnSearch() {
        btnSearch.click();
    }
}

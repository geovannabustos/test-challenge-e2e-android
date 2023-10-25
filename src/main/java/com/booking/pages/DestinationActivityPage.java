package com.booking.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DestinationActivityPage extends GeneralPageObject {
    @AndroidFindBy(id = "com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content")
    private WebElementFacade txtDestination;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").childSelector(new UiSelector().resourceId(\"com.booking:id/view_disambiguation_destination_title\").textMatches(\"(Cusco|Cuzco)\"))")
    private WebElementFacade itemDestinationCity;

    public void setDestination(String destinationValue) {
        txtDestination.sendKeys(destinationValue);
    }

    public void tapDestinationCity() {
        itemDestinationCity.click();
    }

}

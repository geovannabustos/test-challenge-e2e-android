package com.booking.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DatePickerCalendarPage extends GeneralPageObject {
    @AndroidFindBy(id = "com.booking:id/facet_date_picker_confirm")
    private WebElementFacade selectDates;

    public void tapDateStart(String dateStartValue) {
        getDriver().findElement(By.xpath("//android.view.View[@content-desc=\"" + dateStartValue + "\"]")).click();
    }

    public void tapDateEnd(String dateEndValue) {
        getDriver().findElement(By.xpath("//android.view.View[@content-desc=\"" + dateEndValue + "\"]")).click();
    }

    public void tapSelectDates() {
        selectDates.click();
    }
}

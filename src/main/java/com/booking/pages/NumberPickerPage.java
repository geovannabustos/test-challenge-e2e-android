package com.booking.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NumberPickerPage extends GeneralPageObject{
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.NumberPicker\")")
    private WebElementFacade numberPickerAge;
    @AndroidFindBy(id="android:id/button1")
    private WebElementFacade btnOk;

    public void setChildAge(String ageValue) {
        int maxScrollAttempts = 18;
        int scrollAttempts = 0;
        numberPickerAge.click();

        while (scrollAttempts < maxScrollAttempts) {
            String text = numberPickerAge.findElement(By.id("android:id/numberpicker_input")).getText();
            if (text.equals(ageValue)) {
                break;
            }
            //scroll
            getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceIdMatches(\"android:id/numberpicker_input\")).flingForward()"));
            scrollAttempts++;
        }
        btnOk.click();
    }

}

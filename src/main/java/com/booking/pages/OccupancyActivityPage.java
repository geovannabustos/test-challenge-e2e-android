package com.booking.pages;

import net.serenitybdd.core.pages.WebElementFacade;

import org.fluentlenium.core.annotation.Page;

import java.util.List;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class OccupancyActivityPage extends GeneralPageObject {
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").resourceId(\"com.booking:id/group_config_rooms_count\").childSelector(new UiSelector().resourceId(\"com.booking:id/bui_input_stepper_buttons_block\").childSelector(new UiSelector().resourceId(\"com.booking:id/bui_input_stepper_value\")))")
    private WebElementFacade roomsCount;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").resourceId(\"com.booking:id/group_config_rooms_count\").childSelector(new UiSelector().resourceId(\"com.booking:id/bui_input_stepper_buttons_block\").childSelector(new UiSelector().resourceId(\"com.booking:id/bui_input_stepper_remove_button\")))")
    private WebElementFacade roomsRemoveButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").resourceId(\"com.booking:id/group_config_rooms_count\").childSelector(new UiSelector().resourceId(\"com.booking:id/bui_input_stepper_buttons_block\").childSelector(new UiSelector().resourceId(\"com.booking:id/bui_input_stepper_add_button\")))")
    private WebElementFacade roomsAddButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").resourceId(\"com.booking:id/group_config_adults_count\").childSelector(new UiSelector().resourceId(\"com.booking:id/bui_input_stepper_buttons_block\").childSelector(new UiSelector().resourceId(\"com.booking:id/bui_input_stepper_value\")))")
    private WebElementFacade adultsCount;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").resourceId(\"com.booking:id/group_config_adults_count\").childSelector(new UiSelector().resourceId(\"com.booking:id/bui_input_stepper_buttons_block\").childSelector(new UiSelector().resourceId(\"com.booking:id/bui_input_stepper_remove_button\")))")
    private WebElementFacade adultsRemoveButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").resourceId(\"com.booking:id/group_config_adults_count\").childSelector(new UiSelector().resourceId(\"com.booking:id/bui_input_stepper_buttons_block\").childSelector(new UiSelector().resourceId(\"com.booking:id/bui_input_stepper_add_button\")))")
    private WebElementFacade adultsAddButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").resourceId(\"com.booking:id/group_config_children_count\").childSelector(new UiSelector().resourceId(\"com.booking:id/bui_input_stepper_buttons_block\").childSelector(new UiSelector().resourceId(\"com.booking:id/bui_input_stepper_value\")))")
    private WebElementFacade childrenCount;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").resourceId(\"com.booking:id/group_config_children_count\").childSelector(new UiSelector().resourceId(\"com.booking:id/bui_input_stepper_buttons_block\").childSelector(new UiSelector().resourceId(\"com.booking:id/bui_input_stepper_remove_button\")))")
    private WebElementFacade childrenRemoveButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").resourceId(\"com.booking:id/group_config_children_count\").childSelector(new UiSelector().resourceId(\"com.booking:id/bui_input_stepper_buttons_block\").childSelector(new UiSelector().resourceId(\"com.booking:id/bui_input_stepper_add_button\")))")
    private WebElementFacade childrenAddButton;
    @AndroidFindBy(id = "com.booking:id/group_config_apply_button")
    private WebElementFacade btnApply;

    @Page
    NumberPickerPage numberPickerPage;

    public void setRoomsCount(int roomsCountValue) {
        int roomsCountCurrent = Integer.parseInt(roomsCount.getText());
        if (roomsCountValue > roomsCountCurrent) {
            for (int i = roomsCountCurrent; i < roomsCountValue; i++) {
                roomsAddButton.click();
            }
        } else if (roomsCountValue < roomsCountCurrent) {
            for (int i = roomsCountCurrent; i > roomsCountValue; i--) {
                roomsRemoveButton.click();
            }
        }
    }

    public void setAdultsCount(int adultsCountValue) {
        int adultsCountCurrent = Integer.parseInt(adultsCount.getText());
        if (adultsCountValue > adultsCountCurrent) {
            for (int i = adultsCountCurrent; i < adultsCountValue; i++) {
                adultsAddButton.click();
            }
        } else if (adultsCountValue < adultsCountCurrent) {
            for (int i = adultsCountCurrent; i > adultsCountValue; i--) {
                adultsRemoveButton.click();
            }
        }
    }

    public void setChildrenCount(int childrenCountValue, List<String> ageValue) {
        int childrenCountCurrent = Integer.parseInt(childrenCount.getText());
        if (childrenCountValue > childrenCountCurrent) {
            for (int i = childrenCountCurrent; i < childrenCountValue; i++) {
                childrenAddButton.click();
                numberPickerPage.setChildAge(ageValue.get(i));
            }
        }
    }

    public void tapBtnApply() {
        btnApply.click();
    }

}

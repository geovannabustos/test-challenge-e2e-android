package com.booking.pages;

import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PersonPage extends GeneralPageObject {
    @AndroidFindBy(xpath = "//javaClass[@resource-id=\"com.booking:id/bstage1_contact_firstname_value\"]/android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"]")
    private WebElementFacade txtName;
    @AndroidFindBy(xpath = "//javaClass[@resource-id=\"com.booking:id/bstage1_contact_lastname_value\"]/android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"]")
    private WebElementFacade txtLastname;
    @AndroidFindBy(xpath = "//javaClass[@resource-id=\"com.booking:id/bstage1_contact_email_value\"]/android.widget.AutoCompleteTextView[@resource-id=\"com.booking:id/bui_input_container_content\"]")
    private WebElementFacade txtEmail;
    @AndroidFindBy(xpath = "//javaClass[@resource-id=\"com.booking:id/bstage1_contact_address_value\"]/android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"]")
    private WebElementFacade txtAddress;
    @AndroidFindBy(xpath = "//javaClass[@resource-id=\"com.booking:id/bstage1_contact_zipcode_value\"]/android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"]")
    private WebElementFacade txtZipCode;
    @AndroidFindBy(xpath = "//javaClass[@resource-id=\"com.booking:id/bstage1_contact_city_value\"]/android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"]")
    private WebElementFacade txtCity;
    @AndroidFindBy(xpath = "//javaClass[@resource-id=\"com.booking:id/bstage1_contact_country_value\"]/android.widget.AutoCompleteTextView[@resource-id=\"com.booking:id/bui_input_container_content\"]")
    private WebElementFacade txtCountry;
    @AndroidFindBy(xpath = "//javaClass[@resource-id=\"com.booking:id/bstage1_contact_telephone_value\"]/android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"]")
    private WebElementFacade txtMobile;
    @AndroidFindBy(id = "com.booking:id/business_purpose_leisure")
    private WebElementFacade radioButtonElementLeisure;
    @AndroidFindBy(id = "com.booking:id/action_button")
    private WebElementFacade btnAddData;


    public void setName(String nameValue) {
        txtName.sendKeys(nameValue);
    }

    public void setLastname(String lastnameValue) {
        txtLastname.sendKeys(lastnameValue);
    }

    public void setEmail(String emailValue) {
        txtEmail.sendKeys(emailValue);
    }

    public void setAddress(String addressValue) {
        if (txtAddress.isPresent()) {
            txtAddress.sendKeys(addressValue);
        }
    }

    public void setTxtZipCode(String zipCodeValue) {
        if (txtZipCode.isPresent()) {
            txtZipCode.sendKeys(zipCodeValue);
        }
    }

    public void setCity(String cityValue) {
        if (txtCity.isPresent()) {
            txtCity.sendKeys(cityValue);
        }
        //scroll
        getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceIdMatches(\"com.booking:id/content_recycler_view\")).flingForward()"));
    }

    public void setCountry(String countryValue) {
        txtCountry.clear();
        txtCountry.sendKeys(countryValue);
    }

    public void setMobile(String mobileValue) {
        txtMobile.sendKeys(mobileValue);
    }

    public void setPurpose() {
        if (radioButtonElementLeisure.isPresent() && !radioButtonElementLeisure.isSelected()) {
            radioButtonElementLeisure.click();
        }
    }

    public void tapBtnAddData() {
        btnAddData.click();
    }
}

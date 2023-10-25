package com.booking.steps;

import com.booking.pages.PersonPage;
import org.fluentlenium.core.annotation.Page;

public class RegisterDataPersonStep {
    @Page
    PersonPage personPage;

    public void registerDataPerson(String  nameValue, String lastnameValue, String emailValue, String addressValue, String postalCodeValue, String cityValue, String countryValue, String mobileValue){
        personPage.setName(nameValue);
        personPage.setLastname(lastnameValue);
        personPage.setEmail(emailValue);
        personPage.setAddress(addressValue);
        personPage.setTxtZipCode(postalCodeValue);
        personPage.setCity(cityValue);
        personPage.setCountry(countryValue);
        personPage.setMobile(mobileValue);
        personPage.setPurpose();
        personPage.tapBtnAddData();
    }

}

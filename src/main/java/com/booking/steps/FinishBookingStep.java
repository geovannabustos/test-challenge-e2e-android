package com.booking.steps;

import com.booking.pages.FinishBookingPage;
import org.assertj.core.api.SoftAssertions;
import org.fluentlenium.core.annotation.Page;

public class FinishBookingStep {


    private SoftAssertions softly = new SoftAssertions();
    @Page
    FinishBookingPage finishBookingPage;

    public void finishBooking(String cardNumberValue, String cardHolderValue, String cardExpirationDateValue){
        finishBookingPage.setTxtCardNumber(cardNumberValue);
        finishBookingPage.setTxtCardHolder(cardHolderValue);
        finishBookingPage.setTxtCardExpirationDate(cardExpirationDateValue);
    }
    public void verifyValueBooking(String hotelNameValue, String hotelValue, String hotelValueTaxes){
        //softly.assertThat(finishBookingPage.selectTxtValueBooking()).as("Verificar nombre del hotel").isEqualTo(nameHotel);

        softly.assertThat(finishBookingPage.getTxtValueBooking()).as("Valor hotel").isEqualTo(hotelValue);
        softly.assertThat(finishBookingPage.getTxtValueTaxes()).as("Valor cargos e impuesto").isEqualTo(hotelValueTaxes);
        softly.assertAll();
    }
    public void paymentBooking(){
        finishBookingPage.tapBtnBookNow();
    }
}

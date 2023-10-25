package com.booking.steps;

import com.booking.pages.SumaryBookingPage;
import org.assertj.core.api.SoftAssertions;
import org.fluentlenium.core.annotation.Page;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class VerifySummaryBookingStep {

    private SoftAssertions softly = new SoftAssertions();
    @Page
    SumaryBookingPage sumaryBookingPage;

    public void verifyDataSummaryBooking(String nameHotel,String hotelValue,String hotelValueTaxes, String dateStartValue, String dateEndValue, int roomsCountValue, int adultsCountValue, int childrenCountValue) throws ParseException {

        SimpleDateFormat formato1 = new SimpleDateFormat("EEE, dd MMM yyyy", new Locale("es", "ES"));
        SimpleDateFormat formato2 = new SimpleDateFormat("dd MMMM yyyy", new Locale("es", "ES"));

        try {
            softly.assertThat(sumaryBookingPage.getTxtHotelName()).as("Verificar nombre del hotel").isEqualTo(nameHotel);

            Date dateTxtCheckin = formato1.parse(sumaryBookingPage.getTxtCheckin());
            Date dateTxtCheckinValue = formato2.parse(dateStartValue);
            softly.assertThat(dateTxtCheckin).as("Verificar Checkin").isEqualTo(dateTxtCheckinValue);
            Date dateTxtCheckout = formato1.parse(sumaryBookingPage.getTxtCheckout());
            Date dateTxtCheckoutValue = formato2.parse(dateEndValue);
            softly.assertThat(dateTxtCheckout).as("Verificar Checkout").isEqualTo(dateTxtCheckoutValue);

            softly.assertThat(sumaryBookingPage.getTxtValueBookingSummary()).as("Valor hotel").isEqualTo(hotelValue);
            softly.assertThat(sumaryBookingPage.getTxtValueBookingSummary()).as("Valor hotel").isEqualTo(sumaryBookingPage.getTxtValueBooking());

            softly.assertThat(sumaryBookingPage.getTxtValueTaxesSummary()).as("Valor cargos e impuesto").isEqualTo(hotelValueTaxes);
            softly.assertThat(sumaryBookingPage.getTxtValueTaxesSummary()).as("Valor cargos e impuesto").isEqualTo(sumaryBookingPage.getTxtValueTaxes());

        } catch (ParseException e) {
            e.printStackTrace();
        }
        softly.assertAll();
    }
    public void finishBooking(){
        sumaryBookingPage.tapBtnFinalStep();
    }
}

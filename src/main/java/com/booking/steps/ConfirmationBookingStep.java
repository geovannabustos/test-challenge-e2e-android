package com.booking.steps;

import com.booking.pages.ConfirmationBookingPage;

import org.assertj.core.api.SoftAssertions;
import org.fluentlenium.core.annotation.Page;

public class ConfirmationBookingStep {
    private SoftAssertions softly = new SoftAssertions();
    @Page
    ConfirmationBookingPage confirmationBookingPage;

    public void confirmationBooking(String emailValue){
        confirmationBookingPage.tapBtnClose();
        softly.assertThat(confirmationBookingPage.getTxtTitle()).as("Valida el titulo").isEqualTo("Confirmada");
        softly.assertThat(confirmationBookingPage.getTxtHeaderTitle()).as("Valida el subtitulo").isEqualTo("Tu reserva está confirmada");
        softly.assertThat(confirmationBookingPage.getTxtHeaderEmail()).as("Valida el envio por correo").isEqualTo("Hemos enviado la confirmación a "+emailValue);
        softly.assertAll();
    }
}

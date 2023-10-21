package com.booking.definitions;

import com.booking.pages.HomePage;

import net.thucydides.core.annotations.Step;

import net.thucydides.core.annotations.Steps;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Y;
import io.cucumber.java.es.Entonces;

public class CreateBookingDefinition {

    @Steps
    HomePage homePage;

    @Dado("que abro la app Booking")
    public void openApp() {
        homePage.tapBtnGoHome();
    }
/*
    @Cuando("registro los datos de alojamiento")
    public void registerBooking() {
    }

    @Y("registro los datos de la persona que reserva")
    public void registerPersonBooking() {
    }

    @Y("completo el pago por tarjeta de credito del alojamiento")
    public void completePayment() {
    }

    @Entonces("se verifica el valor del pago por la reserva")
    public void verifyPaymentValue() {
    }
*/
}

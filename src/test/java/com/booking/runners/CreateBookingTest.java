package com.booking.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = "pretty",
        features = "src/test/resources/features/booking/CreateBooking.feature",
        glue = {"com.booking.definitions", "com.booking.hooks"})
public class CreateBookingTest {}


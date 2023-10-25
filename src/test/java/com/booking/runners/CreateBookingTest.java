package com.booking.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        //plugin = "pretty",
        plugin = {
                "pretty", "html:target/serenity-reports/serenity-html-report.html",
                "json:target/serenity-reports/cucumber_report.json",
                "rerun:target/serenity-reports/rerun.txt"
        },
        features = "src/test/resources/features/booking/CreateBooking.feature",
        tags = "@CreateBookingHappyPath",
        glue = {"com.booking.definitions", "com.booking.hooks"})
public class CreateBookingTest {}


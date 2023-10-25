package com.booking.definitions;

import com.booking.steps.ConfirmationBookingStep;
import com.booking.steps.FinishBookingStep;
import com.booking.steps.MessageStep;
import com.booking.steps.RegisterDataPersonStep;
import com.booking.steps.RegisterDetailBookingStep;
import com.booking.steps.SelectHotelStep;
import com.booking.steps.VerifySummaryBookingStep;
import net.thucydides.core.annotations.Steps;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.ParameterType;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

public class CreateBookingDefinition {

    private String dateCheckin;
    private String dateCheckout;
    private int roomsCount;
    private int adultsCount;
    private int childrenCount;
    private String email;
    private String totalBooking;
    private String hotelName;
    private String hotelValue;
    private String hotelValueTaxes;

    @Steps
    RegisterDetailBookingStep registerDetailBookingStep;
    @Steps
    SelectHotelStep selectHotelStep;
    @Steps
    RegisterDataPersonStep registerDataPersonStep;
    @Steps
    VerifySummaryBookingStep verifySummaryBookingStep;
    @Steps
    FinishBookingStep finishBookingStep;
    @Steps
    ConfirmationBookingStep confirmationBookingStep;
    @Steps
    MessageStep messageStep;

    @Dado("que abro la app Booking")
    public void openApp() {
        registerDetailBookingStep.goHome();
    }

    @ParameterType("\\[([^\\]]+)\\]")
    public List<String> Stringlist(String values) {
        String[] valueArray = values.split(",");
        List<String> stringList = new ArrayList<>();
        for (String value : valueArray) {
            stringList.add(value);
        }
        return stringList;
    }

    @Cuando("registro los datos de alojamiento, destino {string}, fecha inicio {string}, fecha fin {string}, habitaciones {int}, adultos {int}, ninos {int} edades {Stringlist}")
    public void registerBooking(String destinationValue, String dateCheckinValue, String dateCheckoutValue, int roomsCountValue, int adultsCountValue, int childrenCountValue, List<String> ageValues) {
        dateCheckin = dateCheckinValue;
        dateCheckout = dateCheckoutValue;
        roomsCount = roomsCountValue;
        adultsCount = adultsCountValue;
        childrenCount = childrenCountValue;
        registerDetailBookingStep.registerDataBooking(destinationValue,dateCheckinValue,dateCheckoutValue,roomsCountValue,adultsCountValue,childrenCountValue,ageValues);
        registerDetailBookingStep.searchBooking();
    }
    @Y("selecciono el hotel")
    public void selectHotel(){
        selectHotelStep.selectHotel(2);
        hotelValue = selectHotelStep.getHotelValue();
        hotelName = selectHotelStep.getHotelName();
        hotelValueTaxes = selectHotelStep.getHotelValueTaxes();
        selectHotelStep.selectRoom();
    }

    @Y("registro los datos de la persona que reserva, nombre {string}, apellido {string}, email {string}, direccion {string}, codigo postal {string}, ciudad {string}, pais {string}, celular {string}")
    public void registerPersonBooking(String nameValue, String lastnameValue, String emailValue, String addressValue, String postalCodeValue, String cityValue, String countryValue, String mobileValue) {
        email = emailValue;
        registerDataPersonStep.registerDataPerson(nameValue,lastnameValue,emailValue,addressValue,postalCodeValue,cityValue,countryValue,mobileValue);
    }
    @Y("verifico los datos de la reserva")
    public void verifySummaryBooking() throws ParseException {
        verifySummaryBookingStep.verifyDataSummaryBooking(hotelName,hotelValue,hotelValueTaxes,dateCheckin,dateCheckout,roomsCount,adultsCount,childrenCount);
        verifySummaryBookingStep.finishBooking();
    }
    @Y("completo el pago con tarjeta de credito, numero {string}, titular {string}, fecha caducidad {string}")
    public void finishBooking(String cardNumber, String cardHolder, String cardExpirationDate) {
        finishBookingStep.finishBooking(cardNumber,cardHolder,cardExpirationDate);
        finishBookingStep.verifyValueBooking(hotelName,hotelValue,hotelValueTaxes);
        finishBookingStep.paymentBooking();
    }
    @Entonces("se presentara la confirmacion de la reserva")
    public void confirmationBooking() {
        confirmationBookingStep.confirmationBooking(email);
    }

    @Cuando("busco alojamientos sin ingresar el destino")
    public void searchBooking(){
        registerDetailBookingStep.searchBooking();
    }
    @Entonces("se presentara una alerta {string}")
    public void showAlertError(String message){
        messageStep.verifyAlert(message);
    }
    @Entonces("se presentara un mensaje {string}")
    public void showMessageError(String message){
        messageStep.verifyMessage(message);
    }
}

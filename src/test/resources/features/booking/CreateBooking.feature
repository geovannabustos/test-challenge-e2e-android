#language: es
Característica: Como usuario quiero realizar una reserva de alojamiento en Booking.com

  Escenario: Realizar reserva de alojamiento
    Dado que abro la app Booking
    Cuando registro los datos de alojamiento, destino "<destino>", fecha inicio "<fechaInicio>", fecha fin "<fechafin>", habitaciones <habitaciones>, adultos <adultos>, ninos <ninos> edades [<edades>]
    Y selecciono el hotel
    Y registro los datos de la persona que reserva, nombre "<nombre>", apellido "<apellido>", email "<email>", direccion "<direccion>", codigo postal "<codigoPostal>", ciudad "<ciudad>", pais "<pais>", mobile "<mobile>"
    Y verifico los datos de la reserva
    Y completo el pago con tarjeta de credito, numero "<numeroTarjeta>", titular "<titularTarjeta>", fecha caducidad "<fechaCaducidad>"
    Entonces se presentara la confirmacion de la reserva
    Ejemplos:
      | destino | fechaInicio       | fechafin          | habitaciones | adultos | ninos | edades | nombre | apellido | email            | direccion   | codigoPostal | ciudad | pais    | mobile     |numeroTarjeta|titularTarjeta|fechaCaducidad|
      | Cusco   | 01 noviembre 2023 | 12 noviembre 2023 | 1            | 2       | 1     | 5 años | Paula  | Lozano   | correo@gmail.com | La Carolina | 0111         | Quito  | Ecuador | 0999999999 |5200000000001005|Geovanna|02/24|

# test-challenge-e2e-android
Proyecto de automatización de pruebas E3E con Serenity-Appium-Cucumber

### Herramientas:
- **Serenity**: https://serenity-bdd.github.io/docs/tutorials/first_test
- **Gradle**: https://docs.gradle.org/current/userguide/userguide.html
- **Cucumber**: https://cucumber.io/docs/cucumber/
- **Appium**: https://appium.io/docs/en/about-appium/api/

### Ejecución de pruebas

Para ejecutar localmente el script, se requiere:

#### Requisitos
- Instalar las herramientas:  IDE Android Studio - emulador, jdk 18.0.2.1, Gradle 7.4, Appium.
- Abrir el script de pruebas en el IDE y compilarlo como proyecto gradle
- Configurar un emulador en Android Studio
- Ejecutar Appium considerando el host: 0.0.0.0 y el port: 4723
- Actualizar los parámetros de Appium del script de pruebas en el archivo serenity.properties
```
appium.platformName = Android
appium.platformVersion = 13
appium.deviceName = emulator-5554
appium.udid = emulator-5554
```
#### Ejecutar todos los test
Ejecutar a nivel de terminal, ejecutando los comandos:
```
./gradlew clean assemble
./gradlew clean compile
./gradlew clean test
```
Ejecutar desde el IDE el Runner `src/test/java/com/booking/runners/CreateBookingTest.java`, comentar el tag `@CreateBookingHappyPath`

#### Ejecución de los test con un Tag asignado
Ejecutar a nivel de terminal, ejecutando el comando:
```
- ./gradlew clean test --tests "com.booking.runners.CreateBookingTest"
```

- Ejecutar desde el IDE el Runner `src/test/java/com/booking/runners/CreateBookingTest.java`, donde se encuentra definido el feature a considerarse y el tag `@CreateBookingHappyPath`
- Ejecutar desde el IDE el Runner `src/test/java/com/booking/runners/CreateBookingTest.java`, donde se encuentra definido el feature a considerarse y el tag `@CreateBookingEmptyBookingUnhappyPath`

### Resultados
Se generan los reportes:
- `target/site/serenity/index.html` reporte Serenity con detalle el resultado de la ejecución
- `target/serenity-reports/serenity-html-report.html` reporte Serenity con un reporte acotado de la ejecución
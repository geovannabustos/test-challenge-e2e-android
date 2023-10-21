package com.booking.pages;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidStartScreenRecordingOptions;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Base64;
import java.util.UUID;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementState;
import net.thucydides.core.steps.StepInterceptor;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.*;

public class GeneralPageObject extends PageObject {

  protected AndroidDriver androidDriver;
  protected AppiumDriver appiumDriver;
  protected TouchActions actions;
  protected static final Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

  public GeneralPageObject() {
    androidDriver = getProxiedDriver();
    appiumDriver = getProxiedDriver();
    actions = new TouchActions(getProxiedDriver());
  }

  public WebElement waitForElement(WebElement element, int seconds) {
    WebDriverWait wait = new WebDriverWait(getDriver(), seconds);
    wait.until(ExpectedConditions.visibilityOf(element));
    return element;
  }

  protected void executeCommandCmd(String command) {
    Runtime cmd = Runtime.getRuntime();
    try {
      cmd.exec(new String[]{"bash", "-l", "-c", command});
    } catch (Exception ex) {
      LOGGER.error("Error al enviar comando" + ex);
    }
  }

  public void closeApp() {
    androidDriver.pressKey(new KeyEvent(AndroidKey.HOME));
  }

  public void openApp(String appPackage, String activity) {
    try {
      androidDriver.startActivity(new Activity(appPackage, activity));
    } catch (Exception e) {
      LOGGER.error("Error al cargar la actividad");
    }
  }

  public void selectTextView(String text) {
    $("//*[@text='{0}']", text).waitUntilVisible().click();
  }

  public void openNotifications() {
    androidDriver.openNotifications();
  }

  protected void scrollContainsText(String text) {
    try {
      getDriver()
          .findElement(
              MobileBy.AndroidUIAutomator(
                  "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView("
                      + "new UiSelector().textContains(\""
                      + text
                      + "\"));"));
    } catch (Exception e) {
      LOGGER.error(String.format("Error scrolling text %s", text) + e);
    }
  }

  public void onScenarioStart() {
    androidDriver.startRecordingScreen(
        new AndroidStartScreenRecordingOptions().withTimeLimit(Duration.ofMinutes(10)));
  }

  public void onScenarioEnded() {
    String uuid = UUID.randomUUID().toString();
    try {
      String s = androidDriver.stopRecordingScreen();
      byte[] decode = Base64.getDecoder().decode(s);
      FileUtils.writeByteArrayToFile(new File("./Videos/" + uuid + ".mp4"), decode);
      Serenity.recordReportData()
          .asEvidence()
          .withTitle("video")
          .downloadable()
          .fromFile(Paths.get("./Videos/" + uuid + ".mp4"));
    } catch (IOException e) {
      LOGGER.error("No se grabó el video: " + e);
    }
  }

  public WebElementState validateText(String text){
    return $("//*[@text='{0}']", text);
  }
}

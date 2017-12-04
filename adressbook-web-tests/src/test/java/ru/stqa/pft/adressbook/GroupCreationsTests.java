package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GroupCreationsTests {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("https://rvision-uat.exadel.com/rms-web/login/login.jsf");
    driver.findElement(By.id("loginForm:password")).clear();
    driver.findElement(By.id("loginForm:password")).sendKeys("Fabregas4|");
    driver.findElement(By.id("loginForm:login")).clear();
    driver.findElement(By.id("loginForm:login")).sendKeys("ddubina");
    driver.findElement(By.name("loginForm:j_idt36")).click();
    driver.findElement(By.xpath("//div[@id='mainMenuForm:profileMI']/span[2]")).click();
    driver.findElement(By.xpath("//td[@id='formEdit:j_idt389:header:inactive']/span")).click();
    driver.findElement(By.xpath("//td[@id='formEdit:j_idt949:header:inactive']/span")).click();
    driver.findElement(By.xpath("//td[@id='formEdit:j_idt3725:header:inactive']/span")).click();
    driver.findElement(By.xpath("//td[@id='formEdit:j_idt3976:header:inactive']/span")).click();
    driver.findElement(By.xpath("//td[@id='formEdit:j_idt4121:header:inactive']/span")).click();
    driver.findElement(By.xpath("//td[@id='formEdit:j_idt4296:header:inactive']/span")).click();
    driver.findElement(By.xpath("//td[@id='formEdit:tabBadges:header:inactive']/span")).click();
    driver.findElement(By.xpath("//td[@id='formEdit:tabLdap:header:inactive']/span")).click();
    driver.findElement(By.id("formEdit:j_idt160")).click();
    driver.findElement(By.xpath("//body")).click();
    driver.findElement(By.id("mainMenuForm:profileMI")).click();
    driver.findElement(By.xpath("//td[@id='formEdit:j_idt3976:header:inactive']/span")).click();
    driver.findElement(By.xpath("//span[@id='mainMenuForm:j_idt20']/img")).click();
    driver.findElement(By.xpath("//span[@id='mainMenuForm:j_idt20']/img")).click();
    driver.findElement(By.id("formEdit:j_idt160")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

package ru.stqa.pft.adressbook;

import org.testng.annotations.*;
import org.openqa.selenium.*;

public class GroupCreationsTests extends TestBase{

  @Test
  public void testGroupCreationsTests() throws Exception {
    GoToGroupsPage();
    driver.findElement(By.name("new")).click();
    FillGroupForm(new GroupData("1", "3"));
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.linkText("group page")).click();
  }
}

package com.example.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.TestBase;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletionTests() throws Exception {
    GoToGroupsPage();
    selectGroup();
    deleteSelectedGroups();
    driver.findElement(By.linkText("group page")).click();
  }

}


package com.epam.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;


public class EpamHomePage {

    public EpamHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Point cursor to SOLUTIONS menu item

    private void pointCursor(WebDriver driver) {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("SOLUTIONS")));
        action.perform();
        this.sleep(2);
    }

    private void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {

        }
    }

    // Return page crumbs as a text

    @FindBy(className = "header-menu-crumb-item")
    private List<WebElement> crumbsList;

    private String crumbsText() {
        String s1 = "";
        for (WebElement we : crumbsList) {
            s1 = s1 + we.getText();
        }
        return s1;
    }

    // Verify that page crumbs are correct

    public void checkMenuItem(WebDriver driver, String menuText, String crumbsExpected) {
        pointCursor(driver);
        driver.findElement(By.linkText(menuText)).click();
        Assert.assertEquals(crumbsText(), crumbsExpected, "Wrong crumbs!");
    }

}

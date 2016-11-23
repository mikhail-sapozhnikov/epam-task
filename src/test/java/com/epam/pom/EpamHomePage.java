package com.epam.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;


public class EpamHomePage {

    public EpamHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "SOLUTIONS")
    private WebElement menuSolutions;

    public void pointCursor(WebDriver driver) {
        Actions action = new Actions(driver);
        action.moveToElement(menuSolutions);
        action.perform();
    }

    @FindBy(css = "a[href^='/solutions/']")
    private List<WebElement> menuItemList;

    public void clickMenuItem(String menuItemText) {
        for (WebElement we : menuItemList) {
            if (we.getText().equals(menuItemText)) {
                we.click();
                break;
            }
        }

    }


}

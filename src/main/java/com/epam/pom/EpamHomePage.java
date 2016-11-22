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
    public WebElement menuSolutions;

    public void pointCursor(WebDriver driver) {
        Actions action = new Actions(driver);
        action.moveToElement(menuSolutions);
        action.perform();
    }

    @FindBy(css = "a[href^='/solutions/']")
    public List<WebElement> menuItemList;

    public void returnMenuItemByText(String menuItemText) {
//        String s2 =

    }

    public void clickMenuItem() {


    }





}

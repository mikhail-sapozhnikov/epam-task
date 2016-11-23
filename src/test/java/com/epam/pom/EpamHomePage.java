package com.epam.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;


public class EpamHomePage {

    private final WebDriver driver;
    @FindBy(linkText = "SOLUTIONS")
    private WebElement menuSolutions;
    @FindBy(css = "a[href^='/solutions/']")
    private List<WebElement> menuItemList;

    public EpamHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void pointCursor() {
        Actions action = new Actions(this.driver);
        action.moveToElement(menuSolutions);
        action.perform();
    }

    public EpamOtherPage clickMenuItem(String menuItemText) {
        for (WebElement we : menuItemList) {
            if (we.getText().equals(menuItemText)) {
                we.click();
                break;
            }
        }
        return new EpamOtherPage(this.driver);

    }


}

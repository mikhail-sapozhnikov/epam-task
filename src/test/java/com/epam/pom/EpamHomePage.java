package com.epam.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;


public class EpamHomePage {

    private final WebDriver driver;
    @FindBy(css = "div[class='submenu-wrapper'] > ul")
    public WebElement crumbsListAll;
    @FindBy(linkText = "SOLUTIONS")
    private WebElement menuSolutions;
//    @FindBy(css = "a[href^='/solutions/']")
//    private List<WebElement> menuItemList;

    public EpamHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void pointCursor() {
        Actions action = new Actions(this.driver);
        action.moveToElement(menuSolutions);
        action.perform();
    }

    public EpamOtherPage clickMenuItem(final String menuItemText) {
        WebElement we = crumbsListAll.findElement(By.linkText(menuItemText));
        we.click();
        return new EpamOtherPage(this.driver);

    }


}

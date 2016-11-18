package com.epam.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EpamHomePage {

    public EpamHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void pointCursor(WebDriver driver) {

        Actions action = new Actions(driver);
        action.moveToElement(menuSolutions);
        action.perform();
        this.sleep(2);
    }

    public void sleep(int seconds)
    {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {

        }
    }

    @FindBy(linkText = "SOLUTIONS")
    public WebElement menuSolutions;

    @FindBy(linkText = "Core Engineering")
    public WebElement menuCoreEngineering;

    @FindBy(className = "header-menu-crumb-item")
    public WebElement breadCrumbs;

//    findBy("//ol[@class='breadcrumb']").getText().equals("First / Second / Third");Home Solutions Core Engineering

}

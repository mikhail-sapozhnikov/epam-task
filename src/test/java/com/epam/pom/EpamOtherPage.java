package com.epam.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class EpamOtherPage {

    private final WebDriver driver;
    @FindBy(className = "header-menu-crumbs")
    public WebElement crumbsListParent;
//    @FindBy(css = "li[class='header-menu-crumb-item'] > a")
//    private List<WebElement> crumbsList;

    public EpamOtherPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void assertCrumbs(String expectedText) {
        Assert.assertEquals(crumbsListParent.getText().replaceAll("\n", ""), expectedText, "Wrong crumbs!");
    }

}

package com.epam.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class EpamOtherPage {

    public EpamOtherPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div > div > header > div > div > div > ul  li > a")
    private List<WebElement> crumbsList;

    private String crumbsText() {
        String s1 = "";
        for (WebElement we : crumbsList) {
            s1 = s1 + we.getText();
        }
        return s1;
    }

    public void assertCrumbs(String expectedText) {
        Assert.assertEquals(crumbsText(), expectedText, "Wrong crumbs!");
    }

    @FindBy(linkText = "Home")
    private WebElement homeLink;

    public void goHome() {
        homeLink.click();

    }


}

package com.epam.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EpamOtherPage {

    public EpamOtherPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "header-menu-crumb-item")
    public List<WebElement> crumbsList;

    public String crumbsText() {
        String s1 = "";
        for (WebElement we : crumbsList) {
            s1 = s1 + we.getText();
        }
        return s1;
    }





}

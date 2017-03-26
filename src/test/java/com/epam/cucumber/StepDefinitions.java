package com.epam.cucumber;

import com.epam.pom.EpamHomePage;
import com.epam.pom.EpamOtherPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 26.03.2017.
 */
public class StepDefinitions {

    private WebDriver driver;
    private String baseUrl = "https://www.epam.com/";



    @Given("^epam main page is opened$")
    public void epam_main_page_is_opened() {
        // Write code here that turns the phrase above into concrete actions
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(baseUrl);

    }

    @When("^I hover over the ([^\"]*)$")
    public void i_hover_over_the_button(String menuItemText) {
        EpamHomePage page = new EpamHomePage(driver);
        page.pointCursor();
        page.clickMenuItem(menuItemText);

    }

    @Then("^I check ([^\"]*)$")
    public void i_check_crumbs (String expectedCrumbsText) {
        EpamOtherPage page1 = new EpamOtherPage(driver);
                page1.assertCrumbs(expectedCrumbsText);

    }


}

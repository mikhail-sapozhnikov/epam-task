package com.epam.firstproject;

import com.epam.pom.EpamHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EpamTest {
    private WebDriver driver;
    private String baseUrl;

    @BeforeSuite
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Autotests\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        baseUrl = "https://www.epam.com/";
        driver.manage().timeouts().implicitlyWait(360, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @DataProvider(name = "Test data")
    public Object[][] createData() {
        return new Object[][]{
                {"Core Engineering", "HomeSolutionsCore Engineering"},
                {"Product Development", "HomeSolutionsCore EngineeringProduct Development"},
                {"Engineering Excellence", "HomeSolutionsCore EngineeringEngineering Excellence"},
                {"Core Technologies", "HomeSolutionsCore EngineeringCore Technologies"},
                {"Assurance", "HomeSolutionsCore EngineeringAssurance"},
                {"Advanced Technology", "HomeSolutionsAdvanced Technology"},
                {"Next-Gen Architecture", "HomeSolutionsAdvanced TechnologyNext-Gen Architecture"},
                {"Agility", "HomeSolutionsAdvanced TechnologyAgility"},
                {"Internet of Things", "HomeSolutionsAdvanced TechnologyInternet of Things"},
                {"R&D", "HomeSolutionsAdvanced TechnologyR&D"},
                {"Intelligent Enterprise", "HomeSolutionsIntelligent Enterprise"},
                {"Enterprise Applications", "HomeSolutionsIntelligent EnterpriseEnterprise Applications"},
                {"Data & Analytics", "HomeSolutionsIntelligent EnterpriseData & Analytics"},
                {"Application & Cloud Management", "HomeSolutionsIntelligent EnterpriseApplication & Cloud Management"},
                {"Collaboration/BPM", "HomeSolutionsIntelligent EnterpriseCollaboration/BPM"},
                {"Digital Engagement", "HomeSolutionsDigital Engagement"},
                {"Strategy & Experience", "HomeSolutionsDigital EngagementStrategy & Experience"},
                {"Digital Marketing", "HomeSolutionsDigital EngagementDigital Marketing"},
                {"Commerce", "HomeSolutionsDigital EngagementCommerce"},
                {"Mobility", "HomeSolutionsDigital EngagementMobility"}
        };
    }


    @Test(dataProvider = "Test data")
    public void testCoreEngineeringLink(String menuText, String crumbsExpected) throws InterruptedException {
        EpamHomePage page = new EpamHomePage(driver);
        page.checkMenuItem(driver, menuText, crumbsExpected);

    }

}

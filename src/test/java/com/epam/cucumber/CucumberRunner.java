package com.epam.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by User on 26.03.2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/recources/",
//        format = { "pretty","html: cucumber-html-reports",
//        "json: cucumber-html-reports/cucumber.json" },
        glue = {"com.epam.cucumber"} )
public class CucumberRunner {
}

	package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:reports/cucumber-html-report",
                "json:reports/cucumber.json",
				"junit:reports/Cucumber.xml",
                "pretty"},

        features = {"src/test/resources/Features"},
        glue = {"Tests"}
)

public class MyRunner {

}
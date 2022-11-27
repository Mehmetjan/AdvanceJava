package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\elements.feature",
        glue = {"stepDefinitions"},
        		plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" })
public class ListTestRunner {

}

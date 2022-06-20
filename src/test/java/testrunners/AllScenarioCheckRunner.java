package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java/featurefiles/AllScenarioCheck.feature"},
                glue= {"stepdefinitions"},
		 tags="@smoke", 
                plugin= {"pretty",
               		 "json:target/MyReports/report.json", 
               		 "junit:target/MyReports/report.xml"}
		)
public class AllScenarioCheckRunner {

}

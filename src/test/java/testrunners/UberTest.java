package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/featurefiles/Uber.feature" }, 
          glue = { "stepdefinitions" ,"Hooks"},
		/* tags="@Regression or @smoke", */
		tags = "@All",
		plugin={"pretty",
				"json:target/MyReports/report.json",
				"junit:target/MyReports/report.xml"
		}

				
 /* plugin={"pretty", "json:target/MyReports/report.json" ,
  "junit:target/MyReports/report.xml" }
 */

)

public class UberTest {

}

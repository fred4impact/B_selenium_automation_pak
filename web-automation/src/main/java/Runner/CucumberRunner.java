/**
 * 
 */
package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author apple
 *here is my runner that runs my test script
 *important cucumber option to note in your project cucumberOptions,RunWith,Feature,glue,strict, dryRun, monochrome,
 */


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/apple/git/B_selenium_automation_pak/web-automation/Features",
		glue= {"com.webtest.tests"},
		monochrome = true, // this help to generate console readable format
		 dryRun = false // use to check scenerio mapping to stepdeination
		//strict = true // these make sure each and very steps is not define stepdefinition file 
		//tags = {@Smoketest, @RegressionTest}
		)

public class CucumberRunner {


}

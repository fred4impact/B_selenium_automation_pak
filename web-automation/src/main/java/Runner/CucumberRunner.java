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
 */

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features",
		glue= {"com.webtest.tests"}
		)

public class CucumberRunner {


}

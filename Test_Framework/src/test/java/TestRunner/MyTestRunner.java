package TestRunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions

	(
			features="src/test/resources/features/login_page.feature",
			glue={"stepdefinitions","AppHooks" },
			dryRun= false,
			monochrome=true,
			//tags= " @Examples ",
			plugin= {"pretty","html:target/test.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
				
			
			)




public class MyTestRunner {

}

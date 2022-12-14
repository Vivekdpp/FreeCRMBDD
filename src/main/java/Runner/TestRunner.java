package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"/Users/vivekdpatel/Desktop/Selenium/Selenium_Workspace/FreeCrmCucumber/src/main/java/Features/taggedhooks.feature"},//the path of the feature files
		glue={"stepDefinition"},//the path of the step definition files
		plugin= {"pretty" , "html:test-output"},
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false //to check the mapping is proper between feature file and step def file
		
		//tags = {"@SmokeTest"}
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"} ~ is for ignore the test cases.
		//format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		)
        //ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	    //ANDed : tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest


public class TestRunner {
	
	
}

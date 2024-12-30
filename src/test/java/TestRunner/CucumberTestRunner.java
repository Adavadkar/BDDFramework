package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags=" ", features = {"src/test/resources/TaggedFeatures"}, glue = {"StepDefination"}, plugin = {"pretty", "html:target/htmlreport.html", "json:target/jsonreport.json"}
, monochrome = true)

public class CucumberTestRunner extends AbstractTestNGCucumberTests {

}

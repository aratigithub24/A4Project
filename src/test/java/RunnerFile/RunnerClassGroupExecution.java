package RunnerFile;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@Test
//@CucumberOptions(features=".\\src\\test\\java\\FeatureFiles\\Home.feature",
//glue="StepDefinationFile",tags="@Smoke", dryRun=false)
//public class RunnerClassGroupExecution extends AbstractTestNGCucumberTests
//{
//
//}

@Test
@CucumberOptions(features=".\\src\\test\\java\\FeatureFiles\\Home.feature",
glue="StepDefinationFile", dryRun=false)
public class RunnerClassGroupExecution extends AbstractTestNGCucumberTests
{

}

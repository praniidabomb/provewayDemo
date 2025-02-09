package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/main/resources/Features",
        glue={"StepDefination"},
        monochrome = true,
        plugin = {"pretty", "html:target/Reports/report.html",
                            "json:target/JSONReports/jsonreport.json",
                            "junit:target/JUnitReports/report.xml"},
        tags="@smoketest"
)
public class TestRunner {
}

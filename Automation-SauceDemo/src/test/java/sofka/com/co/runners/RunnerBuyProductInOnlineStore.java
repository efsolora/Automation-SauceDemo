package sofka.com.co.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"sofka.com.co.stepDefinitions",
                "sofka.com.co.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@FeatureName:BuyProductInOnlineStore"
)
public class RunnerBuyProductInOnlineStore {
}

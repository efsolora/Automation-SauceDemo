package sofka.com.co.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;
import sofka.com.co.interactions.interactionsManager.SauceFormPage;
import sofka.com.co.tasks.productsPage.logout.ClickInLogout;
import sofka.com.co.userInterfaces.productsPage.logout.Logout;
import sofka.com.co.utils.KeyToRemember;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UserInterfaceHook {

    private final EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();

    private final String urlSauce = EnvironmentSpecificConfiguration.from(environmentVariables)
            .getProperty("sauce.url");

    @Before("@FeatureName:BuyProductInOnlineStore")
    public void setupEnvironmentVariables() {
        String user = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty("sauce.user");

        String password = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty("sauce.password");

        theActorInTheSpotlight().remember(KeyToRemember.SAUCE_USER.name(), user);
        theActorInTheSpotlight().remember(KeyToRemember.SAUCE_PASSWORD_USER.name(), password);
        theActorInTheSpotlight().remember(KeyToRemember.URL_SAUCE.name(), urlSauce);
    }

    @After("@SauceLogout")
    public void tearDownLogout() {
        theActorInTheSpotlight().attemptsTo(
                SauceFormPage.clickInButtonBackLLobby(),
                ClickInLogout.logout()
                );

    }

}
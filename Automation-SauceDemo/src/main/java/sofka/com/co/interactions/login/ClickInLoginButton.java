package sofka.com.co.interactions.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import sofka.com.co.userInterfaces.login.LoginPage;

import java.time.Duration;

public class ClickInLoginButton implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(LoginPage.LOGINBUTTON.waitingForNoMoreThan(Duration.ofSeconds(30)))
                .performAs(actor);
    }
}

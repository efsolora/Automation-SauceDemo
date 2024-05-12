package sofka.com.co.interactions.login;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import sofka.com.co.userInterfaces.login.LoginPage;

import java.time.Duration;

public class FillUser implements Interaction {
    private final String username;

    public FillUser(String user) {
        this.username = user;
    }

    @Step("{0} fill hibot user field with #username")
    @Override
    public <T extends Actor> void performAs(T actor) {
        Enter.theValue(username).into(LoginPage.INPUTUSER.waitingForNoMoreThan(Duration.ofSeconds(30)))
                .performAs(actor);
    }
}
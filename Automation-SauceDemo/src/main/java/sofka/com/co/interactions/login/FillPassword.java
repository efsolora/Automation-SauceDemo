package sofka.com.co.interactions.login;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import sofka.com.co.userInterfaces.login.LoginPage;

import java.time.Duration;

public class FillPassword implements Interaction {
    private final String password;

    public FillPassword(String password) {
        this.password = password;
    }

    @Step("{0} fill hibot password field with #password")
    @Override
    public <T extends Actor> void performAs(T actor) {
        Enter.theValue(password).into(LoginPage.INPUTPASSWORD.waitingForNoMoreThan(Duration.ofSeconds(30)))
                .performAs(actor);
    }
}
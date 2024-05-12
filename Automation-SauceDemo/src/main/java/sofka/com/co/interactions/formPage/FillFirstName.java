package sofka.com.co.interactions.formPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import sofka.com.co.models.User;
import sofka.com.co.userInterfaces.formPage.FormPage;

import java.time.Duration;

public class FillFirstName implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Enter.theValue(User.userInfpormation().getFirstName()).into(FormPage.INPUTFIRSTNAME.waitingForNoMoreThan(Duration.ofSeconds(30)))
                .performAs(actor);
    }
}

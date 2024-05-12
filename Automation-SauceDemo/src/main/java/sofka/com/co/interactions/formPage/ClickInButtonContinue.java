package sofka.com.co.interactions.formPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import sofka.com.co.userInterfaces.formPage.FormPage;

import java.time.Duration;

public class ClickInButtonContinue implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(FormPage.BUTTONCONTINUE.waitingForNoMoreThan(Duration.ofSeconds(30)))
                .performAs(actor);
    }
}

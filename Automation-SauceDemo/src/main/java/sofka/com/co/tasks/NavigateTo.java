package sofka.com.co.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import sofka.com.co.utils.KeyToRemember;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NavigateTo implements Task {
    private final String siteUrl;

    public NavigateTo(String keyCalledByActor) {
        this.siteUrl = keyCalledByActor;
    }

    public static NavigateTo sauce() {
        return new NavigateTo(KeyToRemember.URL_SAUCE.name());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.url(actor.recall(siteUrl))
        );

    }
}

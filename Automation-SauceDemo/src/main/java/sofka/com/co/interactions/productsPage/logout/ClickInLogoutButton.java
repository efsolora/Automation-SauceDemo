package sofka.com.co.interactions.productsPage.logout;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import sofka.com.co.userInterfaces.productsPage.logout.Logout;

import java.time.Duration;

public class ClickInLogoutButton implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(Logout.LOGOUTBUTTON.waitingForNoMoreThan(Duration.ofSeconds(30)))
                .performAs(actor);
    }
}

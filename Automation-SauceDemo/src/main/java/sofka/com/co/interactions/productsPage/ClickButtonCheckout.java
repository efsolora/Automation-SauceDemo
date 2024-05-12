package sofka.com.co.interactions.productsPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import sofka.com.co.userInterfaces.productsPage.ProductsPage;

import java.time.Duration;

public class ClickButtonCheckout implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(ProductsPage.BUTTONCHECKOUT.waitingForNoMoreThan(Duration.ofSeconds(30)))
                .performAs(actor);
    }
}

package sofka.com.co.interactions.productsPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import sofka.com.co.userInterfaces.productsPage.ProductsPage;

import java.lang.annotation.Target;
import java.time.Duration;

public class ClickButtonShoppingCar implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(ProductsPage.BUTTONSHOPPINGCAR.waitingForNoMoreThan(Duration.ofSeconds(30)))
                    .performAs(actor);
    }
}

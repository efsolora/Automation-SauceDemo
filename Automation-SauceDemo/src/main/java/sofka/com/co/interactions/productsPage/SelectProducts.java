package sofka.com.co.interactions.productsPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import sofka.com.co.Questions.TheTextReadButtonAdd;
import sofka.com.co.userInterfaces.productsPage.ProductsPage;

import java.time.Duration;

public class SelectProducts implements Interaction {

    private final Target target;

    public SelectProducts(Target target) {
        this.target = target;
    }

    public static SelectProducts clickIntheProduct(Target target){return new SelectProducts(target);}

    @Override
    public <T extends Actor> void performAs(T actor) {

        Click.on(target.waitingForNoMoreThan(Duration.ofSeconds(30)))
                .performAs(actor);

        if (TheTextReadButtonAdd.isTheMainText().equals("Remove")){
            Click.on(target.waitingForNoMoreThan(Duration.ofSeconds(30)))
                    .performAs(actor);
        }


        }
    }



package sofka.com.co.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import sofka.com.co.Questions.AssertionText;
import sofka.com.co.exceptions.TestFailure;
import sofka.com.co.interactions.Close;
import sofka.com.co.tasks.NavigateTo;
import sofka.com.co.tasks.formPage.FillInformation;
import sofka.com.co.tasks.login.LoginInSauce;
import sofka.com.co.tasks.productsPage.SelectProduct;
import sofka.com.co.utils.KeyToRemember;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class StepDefinitionBuyProductInOnlineStore {

    @Dado("que {actor} inicia sesion")
    public void queEfrainIniciaSesion(Actor efrain) {
        efrain.attemptsTo(
                NavigateTo.sauce(),
                LoginInSauce.withCredentials(
                        efrain.recall(KeyToRemember.SAUCE_USER.name()),
                        efrain.recall(KeyToRemember.SAUCE_PASSWORD_USER.name())
                )
        );

    }

    @Cuando("agrega dos productos al carrito de compras")
    public void agregaDosProductosAlCarritoDeCompras() {

        theActorInTheSpotlight().attemptsTo(
                SelectProduct.productsPage(),
                FillInformation.InForm()
        );
    }

    @Entonces("hace la compra exitosamente")
    public void haceLaCompraExitosamente() {

        theActorInTheSpotlight().should(
                seeThat("El mensaje es igual a el de la finalizacion de la orden", AssertionText.finishMessage(),
                        equalTo("Thank you for your order!"))
                        .orComplainWith(TestFailure.class, "El mensaje es diferente a el de la finalizacion de la orden")
        );
        Close.browser();
    }
}

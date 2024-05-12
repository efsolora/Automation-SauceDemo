package sofka.com.co.interactions.interactionsManager;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import sofka.com.co.interactions.productsPage.ClickInButtonMenu;
import sofka.com.co.interactions.productsPage.ClickButtonCheckout;
import sofka.com.co.interactions.productsPage.ClickButtonShoppingCar;
import sofka.com.co.interactions.productsPage.SelectProducts;
import sofka.com.co.interactions.productsPage.logout.ClickInLogoutButton;

public class SauceProductsPage {

    public static Interaction selectProduct(Target target) {
        return Tasks.instrumented(SelectProducts.class, target);
    }

    public static Interaction clickButtonShoppingCar() {
        return Tasks.instrumented(ClickButtonShoppingCar.class);
    }

    public static Interaction clickButtonChaetckout() {
        return Tasks.instrumented(ClickButtonCheckout.class);
    }

    public static Interaction clickInButtonMenu() {
        return Tasks.instrumented(ClickInButtonMenu.class);}

    public static Interaction clickInLogout() {
        return Tasks.instrumented(ClickInLogoutButton.class);}
}

package sofka.com.co.tasks.productsPage.logout;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import sofka.com.co.interactions.interactionsManager.SauceProductsPage;
import sofka.com.co.interactions.productsPage.OnElementUsingScroll;
import sofka.com.co.userInterfaces.productsPage.ProductsPage;
import sofka.com.co.userInterfaces.productsPage.logout.Logout;

public class ClickInLogout implements Task {

    public static ClickInLogout logout() {
        return new ClickInLogout();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                OnElementUsingScroll.OnElementUsingScroll(ProductsPage.MENUBUTTON),
                SauceProductsPage.clickInButtonMenu(),
                SauceProductsPage.clickInLogout()
        );
    }
}

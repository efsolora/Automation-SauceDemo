package sofka.com.co.tasks.productsPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import sofka.com.co.interactions.interactionsManager.SauceProductsPage;
import sofka.com.co.interactions.productsPage.OnElementUsingScroll;
import sofka.com.co.userInterfaces.productsPage.ProductsPage;

public class SelectProduct implements Task {

    public static SelectProduct productsPage(){
        return new SelectProduct();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                OnElementUsingScroll.OnElementUsingScroll(ProductsPage.RANDONPRODUCTS1),
                SauceProductsPage.selectProduct(ProductsPage.RANDONPRODUCTS1),
                OnElementUsingScroll.OnElementUsingScroll(ProductsPage.RANDONPRODUCTS2),
                SauceProductsPage.selectProduct(ProductsPage.RANDONPRODUCTS2),
                OnElementUsingScroll.OnElementUsingScroll(ProductsPage.BUTTONSHOPPINGCAR),
                SauceProductsPage.clickButtonShoppingCar(),
                OnElementUsingScroll.OnElementUsingScroll(ProductsPage.BUTTONCHECKOUT),
                SauceProductsPage.clickButtonChaetckout()
        );
    }
}

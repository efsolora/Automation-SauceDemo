package sofka.com.co.userInterfaces.productsPage;

import net.serenitybdd.screenplay.targets.Target;

import java.util.Random;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;

public class ProductsPage {
    static Random random = new Random();
    static int numeroAleatorio1 = random.nextInt(6) + 1;

    static int numeroAleatorio2 = random.nextInt(6) + 1;

    public static final Target RANDONPRODUCTS1 = Target
            .the("Escoger productos randon")
            .located(cssSelector(".inventory_list > :nth-child("+numeroAleatorio1+") button[class*='btn btn_primary btn_small btn_inventory']"));

    public static final Target RANDONPRODUCTS2 = Target
            .the("Escoger productos randon")
            .located(cssSelector(".inventory_list > :nth-child("+numeroAleatorio2+") button[class*='btn btn_primary btn_small btn_inventory']"));

    public static final Target BUTTONSHOPPINGCAR = Target
            .the("Botón para ingresar al carrito")
            .located(cssSelector(".shopping_cart_link"));

    public static final Target BUTTONCHECKOUT = Target
            .the("Botón para confirmar os productos")
            .located(cssSelector("#checkout"));

    public static final Target MENUBUTTON = Target
            .the("Botón para ingresar a el menú")
            .located(id("react-burger-menu-btn"));
}


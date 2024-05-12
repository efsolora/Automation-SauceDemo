package sofka.com.co.userInterfaces.productsPage.logout;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;

public class Logout {

    public static final Target LOGOUTBUTTON = Target
            .the("Botón para logout")
            .located(id("logout_sidebar_link"));
}

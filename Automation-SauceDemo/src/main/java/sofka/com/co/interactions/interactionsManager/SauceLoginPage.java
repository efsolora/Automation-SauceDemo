package sofka.com.co.interactions.interactionsManager;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import sofka.com.co.interactions.login.ClickInLoginButton;
import sofka.com.co.interactions.login.FillPassword;
import sofka.com.co.interactions.login.FillUser;

public class SauceLoginPage {

    public static Interaction fillUser(String user) {
        return Tasks.instrumented(FillUser.class, user);
    }

    public static Interaction fillPassword(String user) {return Tasks.instrumented(FillPassword.class, user);}

    public static Interaction clickLoginButton() {return Tasks.instrumented(ClickInLoginButton.class);}


}

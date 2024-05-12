package sofka.com.co.tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import sofka.com.co.interactions.interactionsManager.SauceLoginPage;


public class LoginInSauce implements Task {
    private final String email;
    private final String password;

    public LoginInSauce(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static LoginInSauce withCredentials(String email, String password) {
        return new LoginInSauce(email, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SauceLoginPage.fillUser(email),
                SauceLoginPage.fillPassword(password),
                SauceLoginPage.clickLoginButton()
                );
    }
}
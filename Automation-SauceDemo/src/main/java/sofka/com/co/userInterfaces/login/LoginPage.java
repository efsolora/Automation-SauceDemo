package sofka.com.co.userInterfaces.login;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;

public class LoginPage {

    public static final Target INPUTUSER = Target
            .the("Campo para ingresar el UserName")
            .located(id("user-name"));

    public static final Target INPUTPASSWORD = Target
            .the("Campo para ingresar la Password")
            .located(id("password"));

    public static final Target LOGINBUTTON = Target
            .the("Botón para iniciar sesión")
            .located(id("login-button"));


}

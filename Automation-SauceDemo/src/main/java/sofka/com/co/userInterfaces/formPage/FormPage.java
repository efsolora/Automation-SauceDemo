package sofka.com.co.userInterfaces.formPage;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;

public class FormPage {

    public static final Target INPUTFIRSTNAME = Target
            .the("Campo para nombre")
            .located(id("first-name"));

    public static final Target INPUTLASTNAME = Target
            .the("Campo ´para apellido")
            .located(id("last-name"));

    public static final Target INPUTPOSTALCODE = Target
            .the("Campo ´para codigo postal")
            .located(id("postal-code"));

    public static final Target BUTTONCONTINUE = Target
            .the("Botón continuar")
            .located(id("continue"));

    public static final Target FINISHBUTTON = Target
            .the("Botón PARA FINALIZAR LA COMPRA")
            .located(id("finish"));

    public static final Target ASSERTMESSAGE = Target
            .the("Botón continuar")
            .located(cssSelector(".complete-header"));

    public static final Target BUTTONBACKLOBBBY = Target
            .the("Botón para regresar a el lbby")
            .located(cssSelector("#back-to-products"));
}

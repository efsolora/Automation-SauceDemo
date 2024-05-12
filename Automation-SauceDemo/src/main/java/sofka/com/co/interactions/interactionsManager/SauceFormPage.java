package sofka.com.co.interactions.interactionsManager;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import sofka.com.co.interactions.formPage.*;

public class SauceFormPage {

    public static Interaction fillFisrtName() {return Tasks.instrumented(FillFirstName.class);}

    public static Interaction fillLastName() {return Tasks.instrumented(FillLastName.class);}

    public static Interaction fillPostalCode() {return Tasks.instrumented(FillPostalCode.class);}

    public static Interaction ClickInButtonContnue() {return Tasks.instrumented(ClickInButtonContinue.class);}

    public static Interaction clickInButtonFinish() {return Tasks.instrumented(ClickInFinishButton.class);}

    public static Interaction clickInButtonBackLLobby() {return Tasks.instrumented(ClickButtonBackLobby.class);}
}

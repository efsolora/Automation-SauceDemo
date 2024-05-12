package sofka.com.co.tasks.formPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import sofka.com.co.interactions.interactionsManager.SauceFormPage;


public class FillInformation implements Task {

    public static FillInformation InForm(){
        return new FillInformation();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SauceFormPage.fillFisrtName(),
                SauceFormPage.fillLastName(),
                SauceFormPage.fillPostalCode(),
                SauceFormPage.ClickInButtonContnue(),
                SauceFormPage.clickInButtonFinish()
        );
    }
}

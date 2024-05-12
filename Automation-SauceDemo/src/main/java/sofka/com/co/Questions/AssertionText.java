package sofka.com.co.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import sofka.com.co.userInterfaces.formPage.FormPage;

import java.time.Duration;

public class AssertionText implements Question<String> {

    public static AssertionText finishMessage(){return new AssertionText();}

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(FormPage.ASSERTMESSAGE.waitingForNoMoreThan(Duration.ofSeconds(30)))
                .answeredBy(actor);
    }
}

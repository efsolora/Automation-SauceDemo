package sofka.com.co.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import sofka.com.co.userInterfaces.productsPage.ProductsPage;

import java.time.Duration;

public class TheTextReadButtonAdd implements Question<String> {

    public static TheTextReadButtonAdd isTheMainText() {
        return new TheTextReadButtonAdd();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ProductsPage.RANDONPRODUCTS1.waitingForNoMoreThan(Duration.ofSeconds(30)))
                .answeredBy(actor);
    }
}

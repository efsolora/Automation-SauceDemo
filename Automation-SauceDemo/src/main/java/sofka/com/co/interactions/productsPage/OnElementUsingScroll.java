package sofka.com.co.interactions.productsPage;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;

public class OnElementUsingScroll implements Interaction {

    private final Target target;
    private final int timeOut;

    public OnElementUsingScroll(Target target) {
        this.target = target;
        this.timeOut = 30;
    }

    public OnElementUsingScroll(Target target, int timeOut) {
        this.target = target;
        this.timeOut = timeOut;
    }

    public static OnElementUsingScroll OnElementUsingScroll(Target target){return new OnElementUsingScroll(target);}

    @Step("{0} moves to element #target using scroll")
    @Override
    public <T extends Actor> void performAs(T actor) {
        Scroll.to(this.target.waitingForNoMoreThan(Duration.ofSeconds(this.timeOut))).performAs(actor);
    }
}

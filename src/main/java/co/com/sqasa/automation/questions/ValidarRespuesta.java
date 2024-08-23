package co.com.sqasa.automation.questions;

import co.com.sqasa.automation.userinterfaces.CompraPag;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebElement;

public class ValidarRespuesta implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WebElement mensajeElement = CompraPag.MENSAJE.resolveFor(actor);
        return mensajeElement.isDisplayed();
    }

    public static ValidarRespuesta message() {
        return new ValidarRespuesta();
    }
}

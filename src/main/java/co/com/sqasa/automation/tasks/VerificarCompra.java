package co.com.sqasa.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sqasa.automation.userinterfaces.CompraPag.*;
import static co.com.sqasa.automation.userinterfaces.CompraPag.BTN_PRODUCTO2;

public class VerificarCompra implements Task {


    public VerificarCompra() {
    }

    public static VerificarCompra compra (){
       return new VerificarCompra();
    }

    @Override
    public <T extends Actor> void performAs (T actor){


        actor.attemptsTo(

                Click.on(BTN_CAT_AMOR),
                Click.on(BTN_PRODUCTO1),
                Click.on(BTN_AÑADIR),
                WaitUntil.the(BTN_INICIO, WebElementStateMatchers.isVisible()).forNoMoreThan(2).seconds(),
                Click.on(BTN_INICIO),
                Click.on(BTN_PRODUCTO2),
                Click.on(BTN_AÑADIR)

        );
    }
}

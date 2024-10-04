package co.com.choucair.certification.reto_autom.tasks;

import co.com.choucair.certification.reto_autom.userinterfaces.ObjetosCompra;
import co.com.choucair.certification.reto_autom.userinterfaces.ObjetosProductos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Comprar implements Task {
    public static Comprar compra() {
        return new Comprar();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ObjetosCompra.BTN_CHECKOUT));

    }
}

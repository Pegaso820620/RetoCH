package co.com.choucair.certification.reto_autom.tasks;

import co.com.choucair.certification.reto_autom.userinterfaces.ObjetosLogin;
import co.com.choucair.certification.reto_autom.userinterfaces.ObjetosProductos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarCarrito implements Task {
    public static IngresarCarrito carrito() {
        return Tasks.instrumented(IngresarCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ObjetosProductos.BTN_CARRITO));
    }
}

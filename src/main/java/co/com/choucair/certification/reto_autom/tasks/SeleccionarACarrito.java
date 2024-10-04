package co.com.choucair.certification.reto_autom.tasks;

import co.com.choucair.certification.reto_autom.userinterfaces.ObjetosProductos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarACarrito implements Task {
    public static SeleccionarACarrito productos() {
        return new SeleccionarACarrito();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ObjetosProductos.PRODUCTO_A),
                Click.on(ObjetosProductos.PRODUCTO_B),
                Click.on(ObjetosProductos.PRODUCTO_C));

    }
}

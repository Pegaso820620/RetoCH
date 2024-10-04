package co.com.choucair.certification.reto_autom.tasks;

import co.com.choucair.certification.reto_autom.models.TablaUsuarios;
import co.com.choucair.certification.reto_autom.userinterfaces.ObjetosLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Ingresar implements Task {
    public TablaUsuarios tablaUsuarios;
    public Ingresar(TablaUsuarios tablaUsuarios){
        this.tablaUsuarios = tablaUsuarios;
    }
    public static Ingresar credenciales(TablaUsuarios tablaUsuarios) {
        return Tasks.instrumented(Ingresar.class, tablaUsuarios);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(tablaUsuarios.getUsuario()).into(ObjetosLogin.USER),
                Enter.theValue(tablaUsuarios.getContrasenna()).into(ObjetosLogin.PASSWORD),
                Click.on(ObjetosLogin.BTN_LOGIN));
    }
}

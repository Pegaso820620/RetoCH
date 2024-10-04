package co.com.choucair.certification.reto_autom.questions;

import co.com.choucair.certification.reto_autom.userinterfaces.ObjetosCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Alertar implements Question {
    public static Alertar vacio() {
        return new Alertar();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ObjetosCompra.CONF_ALERTA).answeredBy(actor);
    }
}

package co.com.choucair.certification.reto_autom.questions;

import co.com.choucair.certification.reto_autom.userinterfaces.ObjetosProductos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Totalizar implements Question {
    public static Totalizar articulos() {
        return new Totalizar();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ObjetosProductos.TOTAL_PRODUCTOS).answeredBy(actor);
    }
}

package co.com.choucair.certification.reto_autom.questions;

import co.com.choucair.certification.reto_autom.userinterfaces.ObjetosLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Comprobar implements Question {
    public static Comprobar Mensaje() {
        return new Comprobar();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ObjetosLogin.MSJ).answeredBy(actor);
    }
}

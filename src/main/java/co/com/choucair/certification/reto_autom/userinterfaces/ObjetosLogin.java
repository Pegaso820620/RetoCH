package co.com.choucair.certification.reto_autom.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ObjetosLogin {

    public static final Target USER = Target.the("usuario").located(By.id("user-name"));
    public static final Target PASSWORD = Target.the("contrasenna").located(By.id("password"));
    public static final Target BTN_LOGIN = Target.the("Boton inicio de sesion").located(By.xpath("//input[@value='Login']"));
    public static final Target MSJ = Target.the("Mensaje de confirmacion").located(By.xpath("//span[contains(text(),'Products')]"));
    public static final Target ERROR = Target.the("Mensaje de error").located(By.xpath("//h3[contains(text(),'Epic sadface')]"));

}

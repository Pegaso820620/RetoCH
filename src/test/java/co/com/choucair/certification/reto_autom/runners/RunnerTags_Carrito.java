package co.com.choucair.certification.reto_autom.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/añadir_producto.feature",
        tags = "@Hu2",
        glue = "co.com.choucair.certification.reto_autom.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class RunnerTags_Carrito {

}

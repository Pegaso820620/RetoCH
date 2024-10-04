package co.com.choucair.certification.reto_autom.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/compra.feature",
        tags = "@Hu3",
        glue = "co.com.choucair.certification.reto_autom.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class RunnerTags_Compra {

}
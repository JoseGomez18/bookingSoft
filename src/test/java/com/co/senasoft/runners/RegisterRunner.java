package com.co.senasoft.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/register.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "com.co.senasoft.stepsdefinitions"
)
public class RegisterRunner {
}

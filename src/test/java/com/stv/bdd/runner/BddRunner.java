package com.stv.bdd.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-html-report",
                "json:target/cucumber-report.json"},
        features = "src/test/java/com/stv/bdd/feature/",
        glue = "com.stv.bdd.steps")
public class BddRunner extends AbstractTestNGCucumberTests {
}

package com.ajio.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features =".\\src\\test\\resources",
		glue = "com.ajio",
		tags = "@Mens and @Clothing or @Kids", 
		plugin = {"html:target/index.html","json:target/report.json"}
		)

public class TestRunner {

}

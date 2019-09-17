package com.cucumber.demo;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/", glue = "com.cucumber.demo.steps", monochrome = true, dryRun = false)
public class CucumberDemoTest {

}

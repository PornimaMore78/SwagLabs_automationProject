package bDD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resources\\Feature\\addToCart.feature",
		glue= {"bDD"}	
		)
public class AddToCart_Runner {

}

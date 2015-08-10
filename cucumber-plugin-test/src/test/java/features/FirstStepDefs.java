package features;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import cucumber.api.java8.En;

public class FirstStepDefs implements En {
	
	Belly belly;
	
	public FirstStepDefs() {
	
		Given("^I have (\\d+) cukes$", (Integer cukes) -> {
		    belly = new Belly();
		    belly.feed(cukes);
		});
		
		When("^I subtract (\\d+)$", (Integer cukes) -> {
		    belly.subtract(cukes);
		});
		
		Then("^I remain with (\\d+) cukes$", (Integer remainingCukes) -> {
		    assertThat(remainingCukes, is(belly.getCukes()));
		});
		
	}
}


package features;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import cucumber.api.java8.En;

public class CheckoutStepDefs implements En {
	
	private Integer priceOfABanana;
	private Integer priceOfAnApple;
	private Integer priceOfAnOrange;
	
	private CheckoutImpl checkout = new CheckoutImpl();

	public CheckoutStepDefs() {
		
		
		Given("^the price of a banana is (\\d+)c$", (Integer priceOfABanana) -> {
		    this.priceOfABanana = priceOfABanana;
		});

		Given("^the price of an apple is (\\d+)c$", (Integer priceOfAnApple) -> {
		    this.priceOfAnApple = priceOfAnApple;
		});

		Given("^the price of an orange is (\\d+)c$", (Integer priceOfAnOrange) -> {
		    this.priceOfAnOrange = priceOfAnOrange;
		});

		When("^I checkout (\\d+) banana$", (Integer numberOfBananas) -> {
		    checkout.checkout(numberOfBananas, priceOfABanana);
		});

		When("^I checkout (\\d+) apple$", (Integer numberOfApples) -> {
		    checkout.checkout(numberOfApples, priceOfAnApple);
		});

		When("^I checkout (\\d+) orange$", (Integer numberOfOranges) -> {
		    checkout.checkout(numberOfOranges, priceOfAnOrange);
		});

		Then("^the total price should be (\\d+)c$", (Integer total) -> {
		    assertThat(checkout.getTotal(), is(total));
		});

	}

}

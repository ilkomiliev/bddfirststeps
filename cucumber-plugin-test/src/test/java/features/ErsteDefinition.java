package features;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import cucumber.api.java8.De;

public class ErsteDefinition implements De {
	
	Year year;
	boolean isLeapYear;
	
	public ErsteDefinition() {
		Angenommen("^wir haben (\\d+) ausgewählt$", (Integer jahr) -> {
		    year = new Year(jahr);
		});

		Wenn("^das Jahr ein Schaltjahr ist$", () -> {
		    isLeapYear = year.isLeapYear();
		});

		Dann("^muss es in true angezeigt werden\\.$", () -> {
		    assertThat(isLeapYear, is(true));
		});

		Dann("^muss es in false angezeigt werden\\.$", () -> {
			assertThat(isLeapYear, is(false));
		});
	}

}

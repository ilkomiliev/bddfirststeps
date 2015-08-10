package features;

public class Year {
	
	private int year;

	public Year(int year) {
		super();
		this.year = year;
	}

	public boolean isLeapYear() {
		return divisibleBy(4) && !(divisibleBy(100) && notDivisibleBy(400));
	}

	private boolean notDivisibleBy(int number) {
		return year % number != 0;
	}

	private boolean divisibleBy(int number) {
		return year % number == 0;
	}
	
	

}

package features;

public class CheckoutImpl {
	
	private int total;

	public void checkout(Integer count, Integer price) {
		total += count * price;
	}

	public Integer getTotal() {
		return total;
	}

}

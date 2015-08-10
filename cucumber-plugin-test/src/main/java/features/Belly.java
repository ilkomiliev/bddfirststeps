package features;

public class Belly {

	private Integer cukes;

	public void feed(Integer cukes) {
		this.cukes = cukes;
	}

	public void subtract(Integer cukes2) {
		cukes -= cukes2;
	}

	public Integer getCukes() {
		return cukes;
	}

}

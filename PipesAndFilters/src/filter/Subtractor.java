package filter;

public class Subtractor extends NumberFilter {

	public Subtractor(double term) {
		super(term);
	}

	@Override
	public Double compute(Double input) {
		return input - super.term;
	}

}

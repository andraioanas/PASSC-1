package filter;

public class Adder extends NumberFilter {

	public Adder(double term) {
		super(term);
	}

	@Override
	public Double compute(Double input) {
		return input + super.term;
	}

}

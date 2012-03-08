package filter;

class Multiplier extends NumberFilter {

	public Multiplier(double term) {
		super(term);
	}

	public Double compute(Double input) {
		return input * super.term;
	}

}

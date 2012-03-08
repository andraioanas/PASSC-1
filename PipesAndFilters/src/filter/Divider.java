package filter;

public class Divider extends NumberFilter {

	public Divider(double term) {
		super(term);
	}

	public Double compute(Double input) {
		return input / super.term;
	}

}

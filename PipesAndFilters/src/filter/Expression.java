package filter;

public class Expression {

	public double calculate(double input) {
		NumberFilter filter = new Adder(2);
		Double result = filter.compute(input);
		result = new Multiplier(3).compute(result);
		return result;
	}
}

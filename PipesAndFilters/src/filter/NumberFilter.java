package filter;

abstract class NumberFilter implements Filter<Double, Double> {
	
	protected final double term;

	public NumberFilter(double term) {
		this.term = term;
	}
	
	@Override
	public abstract Double compute(Double input);
}

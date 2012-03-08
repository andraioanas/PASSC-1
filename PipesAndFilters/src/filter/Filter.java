package filter;

public interface Filter<Input,Output> {
	Output compute(Input input);
}

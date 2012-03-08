package main;

import filter.Expression;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Expression expression = new Expression();
		for (int i 	= 0; i < 10; i++) {
			System.out.println(expression.calculate(Math.random()));
		}
	}

}

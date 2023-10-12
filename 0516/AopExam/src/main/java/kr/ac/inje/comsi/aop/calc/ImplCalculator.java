package kr.ac.inje.comsi.aop.calc;

public class ImplCalculator implements Calculator {

	public long factorial(long num) {
		long result = 1;
		for (long i = 1 ; i <= num ; i++) {
			result *= i;
		}
		return result;
	}

}

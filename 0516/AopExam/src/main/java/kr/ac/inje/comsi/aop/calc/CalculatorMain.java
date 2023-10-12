package kr.ac.inje.comsi.aop.calc;

public class CalculatorMain {

	public static void main(String[] args) {
		// for statement
		DelegateCalculator implDelegate = new DelegateCalculator(new ImplCalculator());
		System.out.printf("ImplCalculator's Result = %d\n", implDelegate.factorial(10));
		// gks
		DelegateCalculator recDelegate = new DelegateCalculator(new RecCalculator());
		System.out.printf("RecCalculator's Result = %d\n", recDelegate.factorial(10));		
	}

}


package kr.ac.inje.comsi.aop.calc;

public class DelegateCalculator implements Calculator{
	private Calculator delegate;

	public DelegateCalculator(Calculator delegate) {
		this.delegate = delegate;
	}
	
	@Override
	public long factorial(long num) {
		long start = System.nanoTime();
		long result = delegate.factorial(num);
		long end = System.nanoTime();
		System.out.printf("%s.factorial(10) 실행시간 = %d\n", delegate.getClass().getSimpleName(), (end-start));
		return result;
	}
	
}

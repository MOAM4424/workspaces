package inheritance;

public class basicCalc implements calc {

	@Override
	public int sum(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

}

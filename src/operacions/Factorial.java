package operacions;

public class Factorial {

	public double factorialIteratiu(int n) {
		if (n < 0) {
			throw new IllegalArgumentException();
		}
		if (n == 1 || n == 0) {
			return 1;
		}

		int aux = 1;
		for (int i = 2; i <= n; i++) {
			aux *= i;
		}
		return aux;
	}

	public double factorialRecursiu(int i) {
		return 0;
	}
}
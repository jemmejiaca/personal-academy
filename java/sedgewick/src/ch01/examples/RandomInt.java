package ch01.examples;

public class RandomInt {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		double r = Math.random();	// uniform in [0, 1)
		int n = (int) (r * N);		// uniform between 0 and N-1
		System.out.println(n);
	}

}

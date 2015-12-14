package ch01.sec2;

// Problem 1.2.20
public class RandIntRange {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);;
		double r = Math.random();	// uniform in [0, 1)
		int n = b + (int) (r * b);		// uniform between 0 and N-1
		System.out.println(n);
	}

}

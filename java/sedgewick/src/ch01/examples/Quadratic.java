package ch01.examples;

/**
 * This program prints out the roots of the equation x*x + b*x + c
 * @author mauricio
 *
 */
public class Quadratic {

	public static void main(String[] args) {
		double b = Double.parseDouble(args[0]);
		double c = Double.parseDouble(args[1]);
		double discriminant = b*b - 4.0*c;
		double d = Math.sqrt(discriminant);
		double x1 = (-b + d) / 2.0;
		double x2 = (-b - d) / 2.0;
		System.out.println(x1 + "\n" + x2);
	}

}

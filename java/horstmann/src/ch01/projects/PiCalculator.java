package ch01.projects;

import java.util.Scanner;

public class PiCalculator {

	public static void main(String[] args) {
		int n;
		double sign;
		double p = 0.0;
		double pi;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter an integer number > ");
		n = keyboard.nextInt();
		
		for (int i = 0; i < n; i++) {
			sign = i % 2 == 0 ? 1.0 : -1.0;
			p += sign*(1.0 / (2.0 * i + 1));
			System.out.println(i + "     " + sign + "     " + (2.0 * i + 1) + "   " + p);
		}
		
		System.out.println(4.0*p);
	}

}

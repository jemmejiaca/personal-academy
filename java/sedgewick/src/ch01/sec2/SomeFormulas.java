package ch01.sec2;

import java.util.Scanner;

public class SomeFormulas {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double y1, t1;
		System.out.print("Enter a value real value t >> ");
		t1 = keyboard.nextDouble();
		y1 = Math.sin(2*t1) + Math.sin(3*t1);
		System.out.printf("sin(2*%f) + sin(3*%f) = %f", t1, t1, y1);
	}

}

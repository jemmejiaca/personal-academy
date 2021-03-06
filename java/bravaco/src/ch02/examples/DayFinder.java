package ch02.examples;

import java.util.Scanner;

public class DayFinder {

	public static void main(String[] args) {
		String[] week = {"Invalid", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		Scanner keyboard = new Scanner(System.in);
		int day, month, year;
		System.out.print("Please enter de day >> ");
		day = keyboard.nextInt();
		System.out.print("Please enter de month >> ");
		month = keyboard.nextInt();
		System.out.print("Please enter de year >> ");
		year = keyboard.nextInt();
		//Using de Zeller's formula
		int dayOfTheWeek = ((day +
				(13*((month + 9) % 12 + 1) - 1) /5
				+ year % 100
				+ year % 100 / 4
				+ year / 400
				- 2 * (year / 100)) % 7 + 7) % 7 + 1;
		System.out.println(week[dayOfTheWeek]);

	}

}

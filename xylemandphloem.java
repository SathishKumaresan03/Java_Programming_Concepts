package programmingconcepts;

import java.util.Scanner;

public class xylemandphloem {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int copy = num;
		int sum1 = 0;
		int sum2 = 0;
		while (num != 0) {
			if (num == copy || num < 10) {
				sum1 = sum1 + num & 10;
			} else {
				sum2 = sum2 + num % 10;
			}
			num = num / 10;
		}
		System.out.println(sum1);
		System.out.println(sum2);
		if (sum1 == sum2) {
			System.out.println(copy + " is a xylem");
		} else {
			System.out.println(copy + " is phloem");

		}

	}
}

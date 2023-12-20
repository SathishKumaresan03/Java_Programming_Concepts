package programmingconcepts;

import java.util.Scanner;

public class strongnumber {
	static int fact(int d) {
		int fact = 1;
		for (int i = d; i >= 1; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 145;
		int copy = num;
		int sum = 0;
		sc.close();
		while (num != 0) {
			int d = num % 10;
			sum = sum + fact(d);
			num = num / 10;
		}
		if (sum == copy)
			System.out.println(sum + " is a Strong numbers");
		else
			System.out.println(sum + " is not a Strong number");
	}
}

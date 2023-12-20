package programmingconcepts;

import java.util.Scanner;

public class arraysumofprime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size of the elements");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter " + size + " elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			sc.close();
		}
		System.out.println(primesum(arr));
	}

	static int primesum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 1 && prime(arr[i])) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}

	static boolean prime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}

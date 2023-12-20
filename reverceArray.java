package programmingconcepts;

import java.util.Arrays;
import java.util.Scanner;

public class reverceArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int s = sc.nextInt();
		System.out.println("enter " + s + " elemnts");
		int[] arr = new int[s];
		sc.close();

		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
	}
}

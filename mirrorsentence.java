package programmingconcepts;

import java.util.Scanner;

public class mirrorsentence {
	public static void main(String[] ags) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();
		System.out.println("input is--->" + str);
		String ans = "";
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1)
				ans = ans + rev(arr[i]) + " ";
			else
				ans = ans + rev(arr[i]);

		}
		System.out.println(ans);
	}

	static String rev(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >=0 ; i--) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}
}

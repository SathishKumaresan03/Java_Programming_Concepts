package programmingconcepts;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string--->");
		String str1 = sc.next().toLowerCase();
		System.out.println("Enter the second String--->");
		String str2 = sc.next().toLowerCase();
		if (str1.length() == str2.length()) {
			char ch[] = str1.toCharArray();
			char ah[] = str2.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ah);
			System.out.println("ch[]--->" + Arrays.toString(ch));
			System.out.println("ah[}--->" + Arrays.toString(ah));
			boolean flag = true;
			for (int i = 0; i < ah.length; i++) {
				if (ch[i] != ah[i]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println("its a Anagram");
			} else {
				System.out.println("not a Anagram");
			}

		}else
		System.out.println("not a Anagram");
	}
}

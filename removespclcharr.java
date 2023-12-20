package programmingconcepts;

import java.util.Scanner;

public class removespclcharr {
public static void main(String[] args) {
	System.out.println("Enter the string");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String ans="";
	for (int i = 0; i < str.length(); i++) {
		char ch=str.charAt(i);
		if ((ch>='A'&& ch<='Z' || ch>='a'&& ch<='z' || ch>='0'&& ch<=9|| ch==' ')) {
			ans=ans+ch;
		}
	}System.out.println(ans);
}
}

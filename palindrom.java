package programmingconcepts;

import java.util.Scanner;

public class palindrom {
public static void main(String[] args) {
	System.out.println("Enter the String");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String copy=str;
	String rev="";
	for (int i = str.length()-1; i >=0; i--) {
		rev=rev+str.charAt(i);
	}
	if(copy.equals(rev)){
		System.out.println("its a palindrom");
	}
	else{
		System.out.println("its not a palindrom");
	}
}
}

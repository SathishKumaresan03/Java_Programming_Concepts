package programmingconcepts;
import java.util.Scanner;
public class password {
	public static void main(String[] args) {
		System.out.println("Enter the password");
		Scanner sc = new Scanner(System.in);
		String pwd = sc.next();
		int Ucount = 0;
		int Lcount = 0;
		int Ncount = 0;
		int Scount = 0;
		if (pwd.length() >= 8) {
			for (int i = 0; i < pwd.length(); i++) {
				char ch = pwd.charAt(i);
				if (ch >= 'A' && ch <= 'Z') 
					Ucount++;
				 else if (ch >= 'a' && ch <= 'z') 
					Lcount++;
				 else if (ch >= '0' && ch <= '9') 
					Ncount++;
				
				 else 
					Scount++;
				}

				if (Ucount >= 1 && Lcount >= 2 && Ncount >= 1 && Scount >= 2 && pwd.charAt(0) == ('@')) {
					System.out.println("Valid password");}
				else {
					System.out.println("invalid password");}
			}
		else {
				System.out.println("atleast 8 character");
		}
}
}
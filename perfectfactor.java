package programmingconcepts;

import java.util.Scanner;

public class perfectfactor {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int no=sc.nextInt();
	int sum=0;
	for (int i = 0; i <=no/2; i++) {
		if(no%i==0) {
			sum=sum+i;
		}
		if(sum==no){
		System.out.println("perfect number");
		}else{
			System.out.println("not a perfect number");
		}
	}
}
}

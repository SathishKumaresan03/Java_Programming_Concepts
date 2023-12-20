package programmingconcepts;

import java.util.Scanner;

public class happynumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int sum;
	while(num>9){
		sum=0;
		int d=num%10;
		sum=sum+d*d;
		num=num/10;
	}sc.close();
//num=sum;

if(num==1 || num==7){
	System.out.println("is a happy number");}
else{
	System.out.println("is not a happy number");}
}

}
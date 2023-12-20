package programmingconcepts;

import java.util.Scanner;

public class armstrongnumber {
	static int count(int x){
		int count=0;
		while(x!=0)
		{
			x=x/10;
			count++;
		}return count;
	}
	static int power(int base,int exp){
		int ans=1;
		while(exp!=0){
			ans=ans*base;
			exp--;
		}
		return ans;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int copy=num;
	int sum=0;
	while (num!=0) {
		int d=num%10;
		sum=sum+power(d,count(copy));
		num=num/10;
	}sc.close();
}
}

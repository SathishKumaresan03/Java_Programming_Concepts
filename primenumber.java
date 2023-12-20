package programmingconcepts;

public class primenumber {
public static void main(String[] args) {
	int num=12;
	for (int i = 2; i <=100; i++) {
		boolean flag=true;
		for (int j = 2; j <=i/2; j++) {
			if (num%j==0) {
				flag=false;
				break;
			}
		}
		if (flag==true) {
			System.out.println(i+" is prime number");
		}
		
	}
}
}

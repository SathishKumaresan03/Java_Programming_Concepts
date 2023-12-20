package programmingconcepts;

public class uppertolower {
public static void main(String[] args) {
	String str="SATHISH";
	String ans="";
	for (int i = 0; i < str.length(); i++) {
		char ch=str.charAt(i);
		int x=(int) ch;
		 ch=(char)(x+32);
		ans=ans+ch;
	}
	System.out.println(ans);
	
}
}

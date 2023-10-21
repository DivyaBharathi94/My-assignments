package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int num=1441, revnum=0,a;
		a=num;
		for (; a!=0; a/=10) {
			int digit = a%10;
			revnum=revnum*10 + digit;
			
			
		}
		System.out.println("Given number is" +num+"and the reverse number is " +revnum);
		 if(num==revnum) {
			 System.out.println("Palindrome");
			 
		 }
		 else {
			 System.out.println("Not a Palindrome");
		 }
	}
}

package week1.day1;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int range=21;
		int num1=0;
		int num2=1;
		
		System.out.println("num1");
		System.out.println("num2");
		
		for (int sum = 1; sum< range; sum ++) {
			int sum = num1 + num2 ;// sum of two variables
			num1 = num2; //first num
			num2 = sum; //second num
			System.out.println(sum);	
		}
		
	}
}

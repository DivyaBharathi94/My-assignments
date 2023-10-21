package week1.day1;



public class FibonacciSeries {

	public static void main(String[] args) {
		
		int range=8, firstNum=0, secNum=1;
		 
		
		
		System.out.println(firstNum);
		System.out.println(secNum);
		
		for (int i = 1; i< range; i ++) {
			int sum = firstNum + secNum ;// sum of two variables
			firstNum = secNum; //first num
			secNum = sum; //second num
			System.out.println(sum);	
		}
		
	}
}

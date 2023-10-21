package week1.day2;

import java.util.Arrays;

public class FirstMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,4,7,6};
		Arrays.sort(arr);
		for (int i = arr[0]; i < arr.length-1; i++) {
			if(i!=arr[i]) {
				System.out.println(i);
				break;
				

			}
			
		}
	}

}

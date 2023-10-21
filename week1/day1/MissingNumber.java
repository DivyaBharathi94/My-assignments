package week1.day1;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {2,3,4,1,6,7,8};
Arrays.sort(arr);
for (int i = arr[0]; i < arr.length-1; i++) {
	if(i!=arr[i]) {
		System.out.println(i);
		break;
		
	}
	
}

	}

}

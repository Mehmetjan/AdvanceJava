package arrays;

import java.util.Arrays;

public class MiddleArr {

	public static void main(String[] args) {
	 int[] myArr= {5,6,87,4,3,5,99};
      int middleArr[] = middleArr(myArr);
      System.out.println(Arrays.toString(middleArr));
	}
	
	public static int[] middleArr(int[] arr) {
		return Arrays.copyOfRange(arr, 1, arr.length-1);
		}
	
	
	
   // use copy of range method
	


}

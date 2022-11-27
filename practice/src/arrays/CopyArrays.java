package arrays;

import java.util.Arrays;

public class CopyArrays {

	public static void main(String[] args) {
		int[] num = {23,345,454,4564,65,7,57,5,76,7,68,6,8,68};
	    Arrays.sort(num);
	    int[] newArray = newArr(num);
	    System.out.println(array(newArray));

	}
	
	public static int[] newArr(int[] arr) {
		
		return Arrays.copyOfRange(arr, arr.length-2, arr.length);
	}
	
	public static String array(int[] arr) {
		return Arrays.toString(arr);
	}
	
	


}

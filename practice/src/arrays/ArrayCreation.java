package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreation {
	
	//  methods of creating array: declaring,  instantiating, initializing
     // declaring
	public static void main(String[] args) {
		
//		declareArray();
//		initializingArray() ;
		
		int[] myArr =  {3,4,6,7,8,9};
		
		int[] newArr = middleArr(myArr);
      System.out.println(Arrays.toString(newArr));
	}
	
	public static void declareArray() {

		int[] nu ;// declaring
		nu= new int[4];   // instantiating
		nu[0] = 2; nu[1] = 4; nu[2] = 7; nu[3] = 9;
		
		System.out.println(Arrays.toString(nu));
	}
	
	
	public static void initializingArray() {
	  int[] num = {3,4,6,7,9};
	  System.out.println(Arrays.toString(num));
	  
	}
	
	
	/// Middle array
	// myArr = [3,4,6,7,8,9];  middleArr = [3,4,6,7,8];
	
	
	static int[] middleArr(int[] arr) {
		
		return Arrays.copyOfRange(arr, 1, arr.length-1);
	}
	
	
}


public class Recursion {
	
	//Recursion is the technique of making a function call itself.

	public static void main(String[] args) {
		//  recursiveMethod(4);
	  	int n = factorial(5);
		 
		System.out.println(n);
	}
	
	public static void recursiveMethod(int n) {
		if(n<1) {
			System.out.println("n is less than 1");
		}else
		recursiveMethod(n-1);
		System.out.println(n);
	}
   
	//  factorial----------------------
	public static int factorial(int n) {
		if (n <0) {
			return -1;
		}if (n==0 || n== 1) {
			return 1;
		}

		return n*factorial(n-1);
	}
	
	// Fibonacci numbers--------
	

	
	
	
	
	
	
	
	
	
	
	
	
}

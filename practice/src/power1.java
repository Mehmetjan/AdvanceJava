public class power1 {
	public static void main(String[] args) {
		
	  int p = power(4,2);
	  System.err.println(p );
	
	
	}
	
	
	
	
	
	
	
	public static  int power(int a, int b) {
		
		if(b==0) {
			return 1;
		}
		if(0>b) {
			return -1;
		}
		  return a*power(a,b-1);   
	}
	
}
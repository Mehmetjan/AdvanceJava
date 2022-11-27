import java.util.ArrayList;
import java.util.List;

public class Questions {

	public static void main(String[] args) {
		Questions q = new Questions();
		System.out.println(q.fizzBuzz(31)); 
	}
	
	//  int n%3==0--> fizz;  n%5==0 -->fuzz,    if  n%3==0 && n%5==0 -->FizzBuzz
	
	public List<String> fizzBuzz(int n){
		List<String> list = new ArrayList<>();
		for (int i = 1; i<n; i++) {
			if(i % 3 ==0 && i % 5 ==0) {
				list.add("FizzBuzz");
			}else if(i%3==0) {
				list.add("Fizz");
			}else if(i % 5 ==0) {
				list.add("Buzz");
			} else {
				list.add(Integer.toString(i));
			}
		}
		return list;
		
		
	}
	
	// implemet pow(x,n), calculate x raised to power n ;
	
   public static int power(int x, int n) {
	   
	   return x;
   }
}

package practice;

public class PowerCalculation {


   public static void main(String[] args) {
	
   }
   
  public int power(int base, int exp) {
	  if(exp==0) {
		 return 1;
	  }
	  
	  if(exp <0) {
		  return -1;
	  }
	  return base*power(base,exp-1);
  }

}

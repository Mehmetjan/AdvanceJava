
public class Test {

	public static void main(String[] args) {
		int n = cal(77);
		System.out.println(n);
	}
    public static int cal(int a) {
    
    	if(a<4) {
    	  return 0;
    	} else   {
    		return 1 + cal(a-1);
    	}
     
    }

    }
    
    
 

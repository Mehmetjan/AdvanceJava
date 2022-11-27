package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

	public static void main(String[] args) {
		arrayList();
		System.out.println();
		arrays();

	}
	
	public static void arrayList() {
		ArrayList<String> names = new ArrayList(Arrays.asList("mehmet", "Arzigul", "Kasim","yalkun"));
		ArrayList<String> lastName = new ArrayList<String>();
		  lastName.add("Bugra");
		  lastName.add("kadir");
		  lastName.add("Alim");
		  lastName.add("Kerem");
		  
		  System.out.println("this is initialized arraList: "+names);
		  System.out.println("this is istantiated arraylist: "+lastName);
		  
		
	}
	
	public static void arrays() {
		int[] age  = {33,45,23,43};
		 System.out.println("this is initialized arra: "+Arrays.toString(age));
		
		 int[] ages = new int[4];
		 ages[0] = 44;
		 ages[1] = 55;
		 ages[2] = 66;
		 ages[3] = 33;
		
		 
		 System.out.println("this is inistantiated arrays: "+Arrays.toString(ages));
		 
		 
	}

}

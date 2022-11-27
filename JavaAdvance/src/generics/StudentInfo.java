package generics;

public class StudentInfo <info> {
	
  info info;
  public StudentInfo(info info) {
	  this.info=info;
  }
  
  public void printInfo() {
	  System.out.println(info);
  }
}


public class Test5 {
	
	 public void sum(int x, int y)
	 {
		 System.out.println("integer sum is : " +(x+y));
		 
	 }
	 
	 //overload the method
	 
	 public void sum(float x, float y)
	 {
		 System.out.println("float sum is: " + (x+y));
	 }
	 
	 //main method
	 
	 public static void main(String[] args) {
		
		 
		 Test5 obj;//object declaration available at compile time
		 obj= new Test5();//object created at runtime
		 
		 
		 obj.sum(1, 2);//this method binding happend at compile time
		 obj.sum(3.3f,3.3f);//this method binding happend at compile time
		 
	}

}

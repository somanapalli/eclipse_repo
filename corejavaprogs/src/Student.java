
public class Student {
	
	//variables
	
	int stid = 100;
	String stname="rama";
	
	
	//our own method
	public void getStudentInfo()
	{
		System.out.println("student id is : " + stid);
		System.out.println("student name is : " + stname);
	}
	
	public static void main(String[] args) {
		//static area
		//object creation
		
		Student obj = new Student();
		
		//call the method using object name
		
		obj.getStudentInfo();
		
	}

}

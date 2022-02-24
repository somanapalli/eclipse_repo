
public class Test2 {
	//static property
	static int x=100;
	
	//instance method
	public void display()
	{
	//instance area or non-static area
		System.out.println(x);
		System.out.println(Test2.x);
		System.out.println(new Test2().x);
		
		
	}
	
	
	public static void main(String[] args)
	{
		//static area
		//accessing directly
		System.out.println(x);
		
		//accessing using class name
		
		System.out.println(Test2.x);
		
		//accessing using object - not recommended
		
		System.out.println(new Test2().x);
		
		new Test2().display();
		
	}

}

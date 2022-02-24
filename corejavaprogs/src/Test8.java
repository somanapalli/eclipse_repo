
public class Test8 {

	public static void main(String[] args) {
		
		
		Bank obj = new Icici();
		System.out.println("icici rate of interest is: " + obj.getRateOfInterest());
	    Bank obj1 = new CityBank();
	    System.out.println("city bank rate of interest is: " + obj1.getRateOfInterest());
	}
}

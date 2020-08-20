package automation;


import java.util.ArrayList;
import java.util.List;

public class Check {
	public Check() {
		
	}
	String[] strArrvalues = {"Heloo","Hi"};
	List<String> strLisCheck = new ArrayList<>();
	//strLisCheck.add("Heloo");
	public static void main(String[] args) {
		Check objA = new Check();
		objA.add(5, 6);

	}

	public void sample() {

		System.out.println("First validation method");
	}
	public int add(int a , int b) {
		int c = a + b;
		return(c);
		
		
	}
}

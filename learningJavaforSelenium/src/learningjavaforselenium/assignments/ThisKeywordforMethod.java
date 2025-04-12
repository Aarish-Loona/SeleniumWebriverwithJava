package learningjavaforselenium.assignments;

/*
 * assignment1-------------------

Assignment2--------------------->
Output should be in the below sequence using this keyword
three parameterized method
default method
two parameterized method
one parameterized method
four parameterized method
just create one object only.
 */

public class ThisKeywordforMethod {
	
	public void DefaultMethod() {
		System.out.println("Default Method");
	}

	public void OneParameterMethod(int a) {
		System.out.println("One Parameter Method");
	}
	
	public void TwoParameterMethod(int a, int b) {
		System.out.println("Two Parameters Method");
	}
	
	public void ThreeParameterMethod(int a, int b, int c) {
		System.out.println("Three Parameters Method");
		this.DefaultMethod();
		this.TwoParameterMethod(1, 2);
		this.OneParameterMethod(1);
		this.FourParameterMethod(1, 2, 3, 4);
	}
	
	public void FourParameterMethod(int a, int b, int c, int d) {
		System.out.println("Four Parameters Method");
	}


	public static void main(String[] args) {
		ThisKeywordforMethod object1 = new ThisKeywordforMethod();
		object1.ThreeParameterMethod(1, 2,3); 
		

	}

}

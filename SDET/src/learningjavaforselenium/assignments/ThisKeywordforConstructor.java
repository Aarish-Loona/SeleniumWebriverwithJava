package learningjavaforselenium.assignments;

/*
 * assignment1-------------------

Output should be in the below sequence(using this keyword)
three parameterized constructor
default constructor
one parameterized constructor
two parameterized constructor
four parameterized constructor
just create one object only.
 */

public class ThisKeywordforConstructor {
	
	public ThisKeywordforConstructor() {
		this(1,2,3);
		System.out.println("default constructor");
	}
	
	public ThisKeywordforConstructor(int a) {
		this();
		System.out.println("one parameterized constructor");
	}
	
	public ThisKeywordforConstructor(int a, int b) {
		this(1);
		System.out.println("two parameterized constructor");
	}
	
	public ThisKeywordforConstructor(int a, int b, int c) {
		System.out.println("three parameterized constructor");
	}
	
	public ThisKeywordforConstructor(int a, int b, int c, int d) {
		this(1,2);
		System.out.println("four parameterized constructor");
	}

	public static void main(String[] args) {
		ThisKeywordforConstructor object1 = new ThisKeywordforConstructor(1,2,3,4);

	}

}

package learningjavaforselenium.lectureContent;

public class ConstructorExplained {
	int a, b,c,d,e,f;
	
	
	//Creating method for approach 2
	public void method1(int a1, int a2, int a3, int a4, int a5) {
		a=a1;
		b=a2;
		c=a3;
		d=a4;
		e=a5;
	}
	
	
	//Creating Constructor for approach 3
		public ConstructorExplained(int a1, int a2, int a3, int a4, int a5) {
			a=a1;
			b=a2;
			c=a3;
			d=a4;
			e=a5;
		}
	


	public static void main(String[] args) {
		//we have 5 variables, we want to give the values to those variables and we want to print the values of those variables.
		System.out.println("---------------Approach1---------------");
		//approach1----------------------directly
		
		ConstructorExplained Approach1 = new ConstructorExplained();
		Approach1.a = 10; //Call 1
		Approach1.b = 20; //Call 2
		Approach1.c = 30; //Call 3
		Approach1.d = 40; //Call 4
		Approach1.e = 50; //Call 5
		System.out.println("Value of a is " +Approach1.a);  //Call 6
		System.out.println("Value of b is " +Approach1.b); //Call 7
		System.out.println("Value of c is " +Approach1.c); //Call 8
		System.out.println("Value of d is " +Approach1.d); //Call 9
		System.out.println("Value of e is " +Approach1.e); //Call 10
		
		//Here we have made calls 10 times, for assigning & printing 5 values.
		
		
		System.out.println("---------------Approach2---------------");
		//approach2------------------------using method
		ConstructorExplained Approach2 = new ConstructorExplained();
		Approach2.method1(10, 20, 30, 40, 50); //Call 1
		System.out.println("Value of a is " +Approach2.a);  //Call 2
		System.out.println("Value of b is " +Approach2.b); //Call 3
		System.out.println("Value of c is " +Approach2.c); //Call 4
		System.out.println("Value of d is " +Approach2.d); //Call 5
		System.out.println("Value of e is " +Approach2.e); //Call 6
		
		//Here we have made calls 6 times, for assigning & printing 5 values.
		
		
		System.out.println("---------------Approach3---------------");
		//approach3------------------------using Constructor
		ConstructorExplained Approach3 = new ConstructorExplained(10,20,30,40,50);
		System.out.println("Value of a is " +Approach3.a);  //Call 1
		System.out.println("Value of b is " +Approach3.b); //Call 2
		System.out.println("Value of c is " +Approach3.c); //Call 3
		System.out.println("Value of d is " +Approach3.d); //Call 4
		System.out.println("Value of e is " +Approach3.e); //Call 5
		
		//Here we have made calls 5 times, for assigning & printing 5 values.
		
	}

}

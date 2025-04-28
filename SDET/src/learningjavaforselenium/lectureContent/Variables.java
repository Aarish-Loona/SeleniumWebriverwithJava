package learningjavaforselenium.lectureContent;

public class Variables {
	
	int a,x=10, y = 20; // Global variable, declared in class & can be used anywhere in program.
	
	public void method1(int b) { // Here b is local variable which is declared inside a method.
		a=b;
		
	}
	
	public void method2(int x) { // Here both local & global variables are same & compiler will not be able to know the difference between variables & will point to global variable always.
		x=x;
	}
	
	public void method3(int y) { 
		this.y=y; //Here both local & global variables are same, but we have used 'this' keyword to let compiler know that variable with this keyword is referring to global variable & value of local variable will be assigned to global variable.
	}

	public static void main(String[] args) {
		Variables object1 = new Variables();
		object1.method1(5);
		System.out.println("Value of Global variable a = " + object1.a);	
		
		
		Variables object2 = new Variables();
		object2.method2(7);
		System.out.println("Value of Global variable x = " + object2.x); //	Here both local & global variables are same & compiler will not be able to know the difference between variables & will point to global variable always.
		
		
		Variables object3 = new Variables();
		object3.method3(50);
		System.out.println("Value of Global variable y = " + object3.y); //	Here both local & global variables are same but this keyword will let compiler know that variable with this keyword is referring to global variable & value

	}	
}
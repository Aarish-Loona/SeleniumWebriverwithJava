package learningjavaforselenium.lectureContent;


//'this': It is used for calling one method from other. This came come anywhere in method & we can use more than 1 this statement in a method.

public class ThisKeywordforMethod {
	
	public void DefaultMethod() {
		System.out.println("Default Method");
	}

	public void OneParameterMethod(int a) {
		System.out.println("One Parameter Method");
	}
	
	public void TwoParameterMethod(int a, int b) {
		this.DefaultMethod();
		this.OneParameterMethod(1);
		System.out.println("Two Parameters Method");
		this.ThreeParameterMethod(1, 2, 3); /*
		Output: Default Method
		One Parameter Method
		Two Parameters Method
		Three Parameters Method
		Because we called multiple methods using this keyword inside of TwoParameterMethod
		*/
	}
	
	public void ThreeParameterMethod(int a, int b, int c) {
		System.out.println("Three Parameters Method");
	}

	public static void main(String[] args) {
		ThisKeywordforMethod object1 = new ThisKeywordforMethod();
		object1.TwoParameterMethod(1, 2); 
		

	}

}

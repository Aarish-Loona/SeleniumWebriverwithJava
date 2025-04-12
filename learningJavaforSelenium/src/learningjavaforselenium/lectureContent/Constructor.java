package learningjavaforselenium.lectureContent;

public class Constructor {
	
	public Constructor() {
		System.out.println("Default Constructor");
	}

	public Constructor(int a) {
		System.out.println("One Parameter Constructor");
	}
	
	public Constructor(int a, int b) {
		System.out.println("Two Parameters Constructor");
	}
	
	public Constructor(int a, int b, int c) {
		System.out.println("Three Parameters Constructor");
	}
	public static void main(String[] args) {

		Constructor zero = new Constructor();
		Constructor one = new Constructor(1);
		Constructor two = new Constructor(1,2);
		Constructor three = new Constructor(1,2,3);
		


		
	}

}

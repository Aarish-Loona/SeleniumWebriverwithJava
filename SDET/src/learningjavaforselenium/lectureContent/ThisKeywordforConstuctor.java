package learningjavaforselenium.lectureContent;


//'this': It is used for calling one constructor from other. This should be first statement inside a constructor & we can't use more than 1 this statement in a constructor.

public class ThisKeywordforConstuctor {
	
	public ThisKeywordforConstuctor() {
		this(1,2); //Output will be Two Parameters Constructor Default Constructor, because we have called Two Parameters Constructor first from default Constructor.
		System.out.println("Default Constructor");
	}

	public ThisKeywordforConstuctor(int a) {
		System.out.println("One Parameter Constructor");
	}
	
	public ThisKeywordforConstuctor(int a, int b) {
		System.out.println("Two Parameters Constructor");
	}
	
	public ThisKeywordforConstuctor(int a, int b, int c) {
		System.out.println("Three Parameters Constructor");
	}

	public static void main(String[] args) {
		ThisKeywordforConstuctor object1 = new ThisKeywordforConstuctor();
		

	}

}

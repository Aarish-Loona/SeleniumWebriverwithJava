package learningjavaforselenium.assignments;

public class ConstrcutorRealLifeBrowserExample {
	
	public ConstrcutorRealLifeBrowserExample() {
		System.out.println("Opening the browser");
		System.out.println("Hitting the URL");
	}

	public static void main(String[] args) {
		ConstrcutorRealLifeBrowserExample b1 = new ConstrcutorRealLifeBrowserExample();
		ConstrcutorRealLifeBrowserExample b2 = new ConstrcutorRealLifeBrowserExample();
		ConstrcutorRealLifeBrowserExample b3 = new ConstrcutorRealLifeBrowserExample();
		
		//Here we have just created the object & Constrcutor was called automatically to save time.
		

	}

}

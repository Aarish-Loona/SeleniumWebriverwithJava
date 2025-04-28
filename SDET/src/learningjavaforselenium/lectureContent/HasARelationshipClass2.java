package learningjavaforselenium.lectureContent;

public class HasARelationshipClass2 {
	
	public void method2() {
		System.out.println("This is method 2 from HasARelationshipClass2");
	}
	
	
	public static void main(String[] args) {
		HasARelationshipClass1 object1 = new HasARelationshipClass1();
		object1.method1();
		
		HasARelationshipClass2 object2 = new HasARelationshipClass2();
		object2.method2();
		
	}

}

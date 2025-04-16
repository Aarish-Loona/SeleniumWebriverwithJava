package learningjavaforselenium.assignments;

import learningjavaforselenium.lectureContent.GrandParentForInheritence;

public class ParentForInheritence extends GrandParentForInheritence {
	
	public void methodFromParent() 
	{
		System.out.println("This method is from Parent Class");
	}
	public static void main(String[] args) {
		ParentForInheritence object1 = new ParentForInheritence();
		
		//Single level Inheritance
		object1.methodFromParent();
		object1.methodfromGrandParent();
		
	}

}

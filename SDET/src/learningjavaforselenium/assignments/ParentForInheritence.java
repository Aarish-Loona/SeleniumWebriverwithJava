package learningjavaforselenium.assignments;

import learningjavaforselenium.lectureContent.GrandParentForInheritence;

public class ParentForInheritence extends GrandParentForInheritence {
	public int VariablefromParent = 40;
	
	public void methodFromParent() 
	{
		System.out.println("This method is from Parent Class");
	}
	public static void main(String[] args) {
		ParentForInheritence object1 = new ParentForInheritence();
		
		System.out.println("Value of GrandParent Variable is = " +object1.VariablefromGrandParent);
		
		//Single level Inheritance
		object1.methodFromParent();
		object1.methodfromGrandParent();
		
	}

}

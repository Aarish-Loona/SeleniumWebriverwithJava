package learningjavaforselenium.selfAssignments.ClassesObjects;

import learningjavaforselenium.assignments.ParentForInheritence;

public class ChildForInheritence extends ParentForInheritence {
	
	public void methodFromChild() 
	{
		System.out.println("This method is from Child Class");
	}
	
	public static void main(String[] args) {
		ChildForInheritence object2 = new ChildForInheritence();
		
		//Multilevel Inheritence
		object2.methodFromChild();
		object2.methodFromParent();
		object2.methodfromGrandParent();
	}

}

package learningjavaforselenium.selfAssignments.ClassesObjects;

import learningjavaforselenium.assignments.ParentForInheritence;

public class Child2ForInheritence extends ParentForInheritence {
	
	public void methodFromChild2() 
	{
		System.out.println("This method is from Child2 Class");
	}
	
	public static void main(String[] args) {
		Child2ForInheritence object3 = new Child2ForInheritence();
		
		//Hierarchical Inheritence
		object3.methodfromGrandParent();
		object3.methodFromParent();
		object3.methodFromChild2();
		//object3.methodFromChild(); // It is giving error because child & child 1 are not linked. 
	}

}

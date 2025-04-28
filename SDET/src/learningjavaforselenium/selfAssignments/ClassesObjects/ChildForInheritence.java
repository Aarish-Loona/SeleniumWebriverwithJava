package learningjavaforselenium.selfAssignments.ClassesObjects;

import learningjavaforselenium.assignments.ParentForInheritence;

public class ChildForInheritence extends ParentForInheritence {
	int VariablefromChild = 10;
	
	public void methodFromChild() 
	{
		System.out.println("This method is from Child Class");
	}
	
	public static void main(String[] args) {
		ChildForInheritence object2 = new ChildForInheritence();
		
		System.out.println("Value of GrandParent Variable is = " +object2.VariablefromGrandParent);
		System.out.println("Value of Parent Variable is = " +object2.VariablefromParent);
		System.out.println("Value of Child Variable is = " +object2.VariablefromChild);
		
		//Multilevel Inheritence
		object2.methodFromChild();
		object2.methodFromParent();
		object2.methodfromGrandParent();
	}

}

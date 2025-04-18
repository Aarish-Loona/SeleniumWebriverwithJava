package learningjavaforselenium.lectureContent;

public class ChildClassForInheritancewithConstructor extends  ParentClassForInheritancewithConstructor{
	
	public ChildClassForInheritancewithConstructor()
	{
		System.out.println("Child Class default Constructor");
	}
	
	public ChildClassForInheritancewithConstructor(int a)
	{
		System.out.println("Child Class one Parameter Constructor");
	}
	
	public ChildClassForInheritancewithConstructor(int a, int b)
	{
		System.out.println("Child Class one Parameter Constructor");
	}
	
	public ChildClassForInheritancewithConstructor(int a, int b, int c)
	{
		System.out.println("Child Class three Parameter Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("-------------Object1---------------");
		ChildClassForInheritancewithConstructor object1 = new ChildClassForInheritancewithConstructor();
		System.out.println("-------------Object2---------------");
		ChildClassForInheritancewithConstructor object2 = new ChildClassForInheritancewithConstructor(1);
		System.out.println("-------------Object3---------------");
		ChildClassForInheritancewithConstructor object3 = new ChildClassForInheritancewithConstructor(1,2);
		System.out.println("-------------Object4---------------");
		ChildClassForInheritancewithConstructor object4 = new ChildClassForInheritancewithConstructor(1,2,3);
		
		/*
		 * Here in every case, Parent class default constructor is being called, because
		 * by default 'super()' keyword is written in constructor, which calls default
		 * Parent constructor everytime.
		 */
		
	}

}

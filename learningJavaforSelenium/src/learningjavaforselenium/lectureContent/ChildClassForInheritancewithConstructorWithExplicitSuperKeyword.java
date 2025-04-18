package learningjavaforselenium.lectureContent;

public class ChildClassForInheritancewithConstructorWithExplicitSuperKeyword extends  ParentClassForInheritancewithConstructor{
	
	public ChildClassForInheritancewithConstructorWithExplicitSuperKeyword()
	{
		System.out.println("Child Class default Constructor");
	}
	
	public ChildClassForInheritancewithConstructorWithExplicitSuperKeyword(int a)
	{
		super(1);
		System.out.println("Child Class one Parameter Constructor");
	}
	
	public ChildClassForInheritancewithConstructorWithExplicitSuperKeyword(int a, int b)
	{
		super(1,2,3);
		System.out.println("Child Class two Parameter Constructor");
	}
	
	public ChildClassForInheritancewithConstructorWithExplicitSuperKeyword(int a, int b, int c)
	{
		super(1,2);
		System.out.println("Child Class three Parameter Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("-------------Object1---------------");
		ChildClassForInheritancewithConstructorWithExplicitSuperKeyword object1 = new ChildClassForInheritancewithConstructorWithExplicitSuperKeyword();
		System.out.println("-------------Object2---------------");
		ChildClassForInheritancewithConstructorWithExplicitSuperKeyword object2 = new ChildClassForInheritancewithConstructorWithExplicitSuperKeyword(1);
		System.out.println("-------------Object3---------------");
		ChildClassForInheritancewithConstructorWithExplicitSuperKeyword object3 = new ChildClassForInheritancewithConstructorWithExplicitSuperKeyword(1,2);
		System.out.println("-------------Object4---------------");
		ChildClassForInheritancewithConstructorWithExplicitSuperKeyword object4 = new ChildClassForInheritancewithConstructorWithExplicitSuperKeyword(1,2,3);
		
		/*
		 * Here in every case, Parent class default constructor is being called, because
		 * by default 'super()' keyword is written in constructor, which calls default
		 * Parent constructor everytime.
		 */
		
	}

}

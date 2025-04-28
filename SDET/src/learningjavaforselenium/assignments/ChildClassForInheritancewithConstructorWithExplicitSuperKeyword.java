package learningjavaforselenium.assignments;

public class ChildClassForInheritancewithConstructorWithExplicitSuperKeyword extends  ParentClassForInheritancewithConstructor{
	
	public ChildClassForInheritancewithConstructorWithExplicitSuperKeyword()
	{
		this(1,2,3);
		System.out.println("Child Class default Constructor");
	}
	
	public ChildClassForInheritancewithConstructorWithExplicitSuperKeyword(int a)
	{
		this();
		System.out.println("Child Class one Parameter Constructor");
	}
	
	public ChildClassForInheritancewithConstructorWithExplicitSuperKeyword(int a, int b)
	{
		this(1);
		System.out.println("Child Class two Parameter Constructor");
	}
	
	public ChildClassForInheritancewithConstructorWithExplicitSuperKeyword(int a, int b, int c)
	{
		super(1);
		System.out.println("Child Class three Parameter Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("-------------Object1---------------");
		ChildClassForInheritancewithConstructorWithExplicitSuperKeyword object1 = new ChildClassForInheritancewithConstructorWithExplicitSuperKeyword(1,2);
		
	}

}

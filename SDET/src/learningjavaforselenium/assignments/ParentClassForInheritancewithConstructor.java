package learningjavaforselenium.assignments;

public class ParentClassForInheritancewithConstructor {
	
	public ParentClassForInheritancewithConstructor()
	{
		this(1,2);
		System.out.println("Parent Class default Constructor");
	}
	
	public ParentClassForInheritancewithConstructor(int a)
	{
		this(1,2,3);
		System.out.println("Parent Class one Parameter Constructor");
	}
	
	public ParentClassForInheritancewithConstructor(int a, int b)
	{
		System.out.println("Parent Class two Parameter Constructor");
	}
	
	public ParentClassForInheritancewithConstructor(int a, int b, int c)
	{
		this();
		System.out.println("Parent Class three Parameter Constructor");
	}

}

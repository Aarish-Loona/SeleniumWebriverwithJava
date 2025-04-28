package learningjavaforselenium.assignments;

public class student {
	
	int age;
	int rollNo;
	
	public void displayage()
	{
		System.out.println("Age is = " +age);
	}
	
	public void displayrollNo()
	{
		System.out.println("Roll Number is = " +rollNo);
	}

	public static void main(String[] args) {
		student s1 = new student();
		s1.age = 30;
		s1.rollNo = 110020005;
		s1.displayage();
		s1.displayrollNo();
		
		
		student s2 = new student();
		s2.age = 29;
		s2.rollNo = 120012000;
		s2.displayage();
		s2.displayrollNo();
		

	}

}

package learningjavaforselenium.lectureContent;


//{}---> this is boundary of class, in between which all the class code will be written
public class Student {
	public void StudentDetails() // "()" indicate that it is a method
	{
	int age =30;  //Variable declaration= datatype variablename
	int rollNo = 110020005; //Variable declaration= datatype variablename
	System.out.println("Age is " + age); //Used for printing on console
	System.out.println("Roll Number is " + rollNo); //Used for printing on console
	}
	
	public void marks() // "()" indicate that it is a method
	{
	int mathMarks= 99; //Variable declaration= datatype variablename
	int englishMarks= 98; //Variable declaration= datatype variablename
	int hindiMarks=95; //Variable declaration= datatype variablename
	int sstMarks=95; //Variable declaration= datatype variablename
	int scienceMarks=98; //Variable declaration= datatype variablename
	int total; //Variable declaration= datatype variablename
	total= mathMarks+englishMarks+hindiMarks+sstMarks+scienceMarks;
	System.out.println("Total Marks are "+total);
}

	
	public static void main(String[] args) {
		Student aarish = new Student(); //object creation = classname refrence_variable = new classname
		aarish.StudentDetails(); //calling the method from class
		aarish.marks();
		
		
	}
}

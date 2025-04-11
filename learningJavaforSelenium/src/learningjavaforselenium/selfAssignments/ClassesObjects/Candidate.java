package learningjavaforselenium.selfAssignments.ClassesObjects;

import java.util.Scanner;

/*
 * Define a class Candidate with the following description
Members are : RNo of int type, Name of type String, Score of type float, Remarks of type String.
Member functions :
AssignRem() to assign Remarks as per the Score obtained by a candidate. Score range are given below:
Score	Remarks
>=50	Selected
<50	Not Selected
A function ENTER() to allow user to enter values for RNo, Name, Score and call function AssignRem() to assign the remarks.
A function DISPLAY() to allow user to view the content of all the data members.
 */

public class Candidate {
	 int RNo;
	 String Name;
	 float Score;
	 String Remarks;
	 //test
	 public void AssignRem() {
		 if(Score<50)
			 Remarks = "Not Selected";
		 if(Score>=50)
			 Remarks = "Selected";
	 }
	 
	 public void Enter() {
			Scanner sc = new Scanner(System.in);
		    System.out.println("Enter Roll Number : ");
		    RNo=sc.nextInt();
		    System.out.println("Enter Student Name : ");
		    Name=sc.next();
		    System.out.println("Enter Score : ");
		    Score=sc.nextInt();
		    AssignRem();
	 }
	 
	 public void Display() {
		 System.out.println("Roll Number is = " +RNo);
		 System.out.println("Name is = " +Name);
		 System.out.println("Score is = " +Score);
		 System.out.println("Reamrks are = " +Remarks);
	 }
	 

	public static void main(String[] args) {
		Candidate Candidate1 =new Candidate();
		Candidate1.Enter();
		Candidate1.AssignRem();
		Candidate1.Display();
		
		Candidate Candidate2 =new Candidate();
		Candidate2.Enter();
		Candidate2.AssignRem();
		Candidate2.Display();

	}

}

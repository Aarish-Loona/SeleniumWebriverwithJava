package learningjavaforselenium.selfAssignments.ClassesObjects;

import java.util.Scanner;

public class Resort {
	int RNo;
	String Name;
	float Charges;
	int Days;
	
	public float Compute() {
		double Amount = Days*Charges;
		if(Amount>11000)
			Amount = 1.02*Amount;
		return (float) Amount;
	}
	
	public void Getinfo() {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Room Number : ");
	    RNo=sc.nextInt();
	    System.out.println("Enter Name : ");
	    Name=sc.next();
	    System.out.println("Enter Charges per day : ");
	    Charges=sc.nextInt();
	    System.out.println("Enter number of days of stay : ");
	    Days=sc.nextInt();
	}
	public void DispInfo() {
		System.out.println("Room number is " +RNo);
		System.out.println("Customer Name os " +Name);
		System.out.println("Charges per day are " +Charges);
		System.out.println("Total number of days of stay is " +Days);
		System.out.println("Room number is " +Compute());
	}
	

	public static void main(String[] args) {
		Resort Customer1=new Resort();
		Customer1.Getinfo();
		Customer1.DispInfo();

	}

}

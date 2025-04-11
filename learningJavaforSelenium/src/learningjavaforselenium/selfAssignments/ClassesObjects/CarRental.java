package learningjavaforselenium.selfAssignments.ClassesObjects;

import java.util.Scanner;

import learningjavaforselenium.assignments.student;

/*
 * Question : 1 Define a class CARRENTAL with the following details :
Class Members are : CarId of int type, CarType of string type and Rent of float type.
Define GetCar() method which accepts CarId and CarType.
GetRent() method which return rent of the car on the basis of car type, i.e. Small Car = 1000, Van = 800, SUV = 2500
ShowCar() method which allow user to view the contents of cars i.e. id, type and rent.
 */

public class CarRental {
	int CarId;
	String CarType;
	int Rent;

public void GetCar() {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter Car Id : ");
    CarId=sc.nextInt();
    System.out.println("Enter Car Type : ");
    CarType=sc.next();
}
public int GetRent() {
	if(CarType.equals("Small"))
		Rent = 1000;
	if(CarType.equals("Van"))
		Rent = 800;
	if(CarType.equals("SUV"))
		Rent = 2500;
	return Rent;
	
}
public void ShowCar() {
	System.out.println("Car Id = " +CarId);
	System.out.println("Car Type = "+CarType);
	System.out.println("Rent = "+GetRent());
}

public static void main(String[] args) {
	CarRental Car1=new CarRental();
	Car1.GetCar();
	Car1.GetRent();
	Car1.ShowCar();
}
}


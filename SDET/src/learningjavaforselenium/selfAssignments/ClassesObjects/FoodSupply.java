package learningjavaforselenium.selfAssignments.ClassesObjects;
import java.util.Scanner;


/*
 * Define a class SUPPLY in Java with the following descriptions :
Data Members are : Code of int type, FoodName of type String, Sticker of type String, FoodType of type String.
Memeber Functions :
A member function GetType() to assign the following values for FoodType as per the given sticker
Sticker	FoodType
Green	Vegetarian
Yellow	Contains Egg
Red	Non Vegetarian
A function FoodIn() to allow user to enter values for Code, FoodName, Sticker and call function GetType() to assign respective FoodType.
A function FoodOut() to allow user to view the content of all the data members.
 */

public class FoodSupply {
	int Code;
	String FoodName;
	String Sticker;
	String FoodType;
	
	public String GetType() {
		if(Sticker.equals("Green"))
			FoodType="Vegetarian";
		if(Sticker.equals("Yellow"))
			FoodType="Contains Egg";
		if(Sticker.equals("Red"))
			FoodType="Non Vegetarian";
		return FoodType;
	}
	public void FoodIn() {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Code : ");
	    Code=sc.nextInt();
	    System.out.println("Enter FoodName : ");
	    FoodName=sc.next();
	    System.out.println("Enter Sticker : ");
	    Sticker=sc.next();
	    GetType();
	}
	
	public void FoodOut() {
        System.out.println("You Entered ");
        System.out.println("Food Code     : "+Code);
        System.out.println("Food Name     : "+FoodName);
        System.out.println("Sticker Color : "+Sticker);
        System.out.println("Food Type     : "+FoodType);
	}

	public static void main(String[] args) {
		FoodSupply food1 =new FoodSupply();
		food1.FoodIn();
		food1.FoodOut();

	}

}

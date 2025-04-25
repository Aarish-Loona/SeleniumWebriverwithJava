package learningjavaforselenium.assignments;

import java.util.Scanner;

public class SwappingOfTwoNumberWithoutUsingThirdVariable {

	public void Swapping() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Value of 1st Variable");
		int a = sc.nextInt();  // a = 1
		
		System.out.println("Enter Value of 2nd Variable");
		int b = sc.nextInt(); // b = 2

		b = a+b; // b= 1+2 = 3
		a = b-a; // a =3-1 = 2
		b = b-a; // b =3-2 = 1
		
		
		System.out.println("Swapped Value of 1st variable is " + a);
		System.out.println("Swapped value of 2nd varibale is " + b);
		
	}
	public static void main(String[] args) {
		
		SwappingOfTwoNumberWithoutUsingThirdVariable swap1 = new SwappingOfTwoNumberWithoutUsingThirdVariable();
		swap1.Swapping();
	}

}

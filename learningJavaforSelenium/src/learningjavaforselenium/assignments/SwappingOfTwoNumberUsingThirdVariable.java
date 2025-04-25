package learningjavaforselenium.assignments;

import java.util.Scanner;

public class SwappingOfTwoNumberUsingThirdVariable {

	public void Swapping() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Value of 1st Variable");
		int a = sc.nextInt();
		
		System.out.println("Enter Value of 2nd Variable");
		int b = sc.nextInt();
		
		int c = 0;
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("Swapped Value of 1st variable is " + a);
		System.out.println("Swapped value of 2nd varibale is " + b);
		
	}
	public static void main(String[] args) {
		
		SwappingOfTwoNumberUsingThirdVariable swap1 = new SwappingOfTwoNumberUsingThirdVariable();
		swap1.Swapping();
	}

}

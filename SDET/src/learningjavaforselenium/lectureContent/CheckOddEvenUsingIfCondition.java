package learningjavaforselenium.lectureContent;

import java.util.Scanner;

public class CheckOddEvenUsingIfCondition {
	
	public void EvenorOdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked for Odd or Even");
		int a = sc.nextInt();
		sc.close();
		
		if(a%2==0)
		{
			System.out.println("Entered number '" + a + "' is Even");
		}
		else
		System.out.println("Entered number '" + a + "' is Odd");
	}
	
		public static void main(String[] args) {
		CheckOddEvenUsingIfCondition numberchecker = new CheckOddEvenUsingIfCondition();
		numberchecker.EvenorOdd();
		
	}

}

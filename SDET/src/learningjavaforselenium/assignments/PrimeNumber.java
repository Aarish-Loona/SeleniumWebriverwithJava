package learningjavaforselenium.assignments;

import java.util.Scanner;

public class PrimeNumber {
	
	public void PrimeChecker() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked if Prime or Not");
		int a = sc.nextInt();
		
		if(a/1 == a) {
			if(a/a == 1) {
				System.out.println("Prime Number");
			}
		}
		else
			System.out.println("Non Prime Number");
	}
	
	public static void main(String[] args) {
		PrimeNumber num1 = new PrimeNumber();
		num1.PrimeChecker();
	}

}

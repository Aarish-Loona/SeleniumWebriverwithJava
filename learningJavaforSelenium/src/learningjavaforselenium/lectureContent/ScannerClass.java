package learningjavaforselenium.lectureContent;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the Integer Value: ");
		int a = sc.nextInt();
		
		
		System.out.println("Please Enter the Float Value: ");
		float f = sc.nextFloat();
		
		
		System.out.println("Please Enter the Byte Value: ");
		byte b = sc.nextByte();
		
		
		System.out.println("Please Enter the Double Value: ");
		double d = sc.nextDouble();
		
		
		System.out.println("Please Enter the String Value: ");
		String st = sc.next();
		
		
		System.out.println("Entered value of Integer is "+a);
		System.out.println("Entered value of Float is "+f);
		System.out.println("Entered value of Byte is "+b);
		System.out.println("Entered value of Double is "+d);
		System.out.println("Entered value of String is "+st);
		
		sc.close();
	}

}

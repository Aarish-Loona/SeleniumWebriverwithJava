import java.util.Scanner;

public class Test {
	
	   private static String readString()
	   {
	       Scanner scan = new Scanner(System.in);
	       return scan.nextLine();
	   } 

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
     
        String s;
		try {
			s = readString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //scan.close();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

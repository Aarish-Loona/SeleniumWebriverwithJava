package learningjavaforselenium.assignments;

public class Methods {
	int a;
	int b;
	int c;
	
	public int sum(int a,int b) {
		c =a+b;
		return c;
	}

	public int subtract(int a,int b) {
		c = a-b;
		return c;
	}
	
	public int multiply(int a,int b) {
		c=a*b;
		return c;
	}
	
	public int divide(int a,int b) {
		c=a/b;
		return c;
	}
	
	public static void main(String[] args) {
		
		Methods cal = new Methods();
		/*
		 * Assignment1-------------------------

((((((10+2)+2)-2)*2)/2)
		 */
		System.out.println(cal.divide((cal.multiply((cal.subtract((cal.sum((cal.sum(10, 2)),2)),2)),2)),2));
		
		/*
		 * Assignment2--------------------

((((10-2)+2)*2)-2)/2)
		 */
		System.out.println(cal.divide((cal.subtract((cal.multiply((cal.sum((cal.subtract(10, 2)),2)),2)),2)),2));
	}

}
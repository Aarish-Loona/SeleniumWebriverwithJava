package learningjavaforselenium.assignments;

public class DoubleLoops {

	public static void main(String[] args) {
		/* WAP to print 
		*
		**
		***
		****
		*****
		*/

		for(int i =1; i<=5; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------");
		
		/*WAP to print 
		*****
		****
		***
		**
		*
		*/
		for(int k =1; k<=5; k++) {
			for(int l=k; l<=5; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
System.out.println("---------------------------");
		
		/*WAP to print 
		1
		12
		123
		1234
		12345
		*/
		
		for(int m= 1; m<=5; m++) {
			for(int n= 1; n<=m; n++) {
				System.out.print(n);
			}
			System.out.println();
		}
		
System.out.println("---------------------------");
		
		/*WAP to print 
		1
		23
		456
		78910
		*/


int q=1;
for(int o=1; o<=4; o++) {
	for(int p=1; p<=o; p++) {
		System.out.print(q);
		q++;
	}
	System.out.println();
}
System.out.println("---------------------------");

for(int r=1; r<=5; r++) {
	for(int s=4; s<=0; s--) {
		System.out.print(" ");
	}
	System.out.println("*");
}
	}

}

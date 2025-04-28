package learningjavaforselenium.assignments;

public class ConstructorMarksCalculator {
	int mathmarks;
	int scimarks;
	int hindimarks;
	int sstmarks;
	int engmarks;
	
	public ConstructorMarksCalculator(int a, int b, int c, int d, int e) {
		int total;
		mathmarks = a;
		scimarks = b;
		hindimarks = c;
		sstmarks= d;
		engmarks = e;
		total = mathmarks+scimarks+hindimarks+sstmarks+engmarks;
		System.out.println("Total = " + total);
	}

	public static void main(String[] args) {
		ConstructorMarksCalculator Student1 = new ConstructorMarksCalculator(100, 99, 98, 95, 92);

	}

}

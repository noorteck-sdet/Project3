package demo4;

public class TestDemo4 {

	double a;
	double b;

	public static void main(String[] args) {
		System.out.println("Friday");
		System.out.println("CALCULATOR FUN TIME"); 
		
		// add method by Alex
		System.out.print("ADD method: ");
		add(6, 7);

		// Divide method by zain
		System.out.println();
		TestDemo4 obj = new TestDemo4();
		System.out.println("Divide Methods /:/");
		double r1 = obj.divide(88, 20);
		System.out.println("Result: "+ obj.a + " / "+ obj.b+ " = " + r1);

			      
	       // subtraction method by --> Hadeel
		double a = 20;
		double b = 10;
		System.out.println(a + " - " + b + " = " + (a - b));
		
	}


}
	
	public static void add(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
	}


	// subtraction method by --> Hadeel
        public static void sub(double a, double b) {
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(b + " - " + a + " = " + (b - a));
	}

		
	public double divide(double a, double b) {

		this.a = a;
		this.b = b;

		double result = a / b;

		return result;
	}
	
	
}

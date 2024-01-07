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
		System.out.println();
		System.out.print("Sub method: ");
		sub(40, 22);

		
		 
		// Multiply method by Yahiya
		System.out.println();
		 System.out.println("Multiplication Method (x)");
		 multiply(20, 6);
		 
			
			
			//modulus method by Simaa
			
			System.out.println();
			System.out.println("modulus Method (%)");
			int num=11%3;
			System.out.println("Result: " + num); //modulus 
			
			/**
			 * fixing all the errors , be careful some of you delete the add method & sub method
			 */
	}
		 
	public static void add(int a, int b) {
		System.out.println("Result: " + a + " * " + b + " = " + (a + b));
	}
	
	public static void sub(int a, int b) {
		System.out.println("Result: " + a + " * " + b + " = " + (a - b));
	}



		
	public double divide(double a, double b) {

		this.a = a;
		this.b = b;

		double result = a / b;

		return result;
	}
	
	public static void multiply(int a, int b) {
		System.out.println("Result: " + a + " * " + b + " = " + (a * b));
	}
}

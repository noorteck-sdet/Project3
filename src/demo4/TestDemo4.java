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


		// Subtraction --> Hadeel  
		System.out.println(" Subtraction Method :");
		 Sub(40, 22);    
	   
	}



	public static void add(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
	}


		
	public double divide(double a, double b) {

		this.a = a;
		this.b = b;

		double result = a / b;

		return result;
	}
	
	
}

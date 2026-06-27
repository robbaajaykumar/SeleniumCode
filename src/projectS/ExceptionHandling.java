package projectS;

public class ExceptionHandling {
	
	
	
	public static void main(String[] args) {
	
	int a=10;
	
	int b=0;
	
	try {
		
		int res = a/b;
	}
	
	catch(ArithmeticException e) {
		
		System.out.println( " error cant divide by 0");
		System.out.println("exception details "+e.getMessage());
	}
	
	
	finally {
		
		System.out.println("The Program continues");
	}
		
		

	}
}

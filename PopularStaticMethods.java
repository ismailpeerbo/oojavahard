public class PopularStaticMethods {
	public static void main( String[] args ) {
		System.out.println( "println() is a static method!" );

		System.out.println( "You don't need to instantiate a math object. " );
		System.out.println( "to call the random() method; it's static!" );

		double a = Math.random();
		double b = Math.random();

		// Math class
		System.out.println( Math.PI );
		System.out.println(Math.abs(-9) ); // absolute value
		System.out.println(Math.sqrt(2)); 
		System.out.println(Math.min(a, b) + " is smaller.") ; 
		System.out.println(Math.max(a, b) + " is larger.") ; 
		System.out.println(Math.pow(a, b) ) ; // a raised to the power of b
		double x = Math.PI * 0.5;
		System.out.println( Math.sin(x) );
		System.out.println( Math.cos(x) );
		System.out.println( Math.tan(x) );

		// String class
		String digits = String.valueOf( Math.E );
		int num = Math.min(17, digits.length());
		String mitchell = digits.substring(0, num);
		System.out.println("Mr. Mitchell has " + mitchell + " memorizedi.");

		// Integer class
		System.out.println("ints take up " + Integer.SIZE + " bits");
		System.out.println("\tSmallest possible int: " + Integer.MIN_VALUE );
		System.out.println("\tLargest possible int: " + Integer.MAX_VALUE );

		int model = Integer.parseInt("1070");
		model += 10;
		System.out.println( String.valueOf(model) );
		System.out.println( ""+model );
	}
}

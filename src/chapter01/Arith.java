package chapter01;

public class Arith {

	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		
		System.out.println( a + b );
		System.out.println( a - b );
		System.out.println( a * b );
		System.out.println( a / b );
		System.out.println( a % b );
		System.out.println( -a ); // int c = -a; System.out.println( c )

		System.out.println( ++a );
		// a = a + 1; 
		// System.out.println( a );
		System.out.println( a++ );
		// System.out.println( a );
		// a = a + 1; 
		System.out.println( a );
		
		System.out.println( --b );
		System.out.println( b-- );
		System.out.println( b );
		
		
		System.out.println( 10 / 3 );
		System.out.println( 10.0 / 3 );
		System.out.println( 10 / (double)3 );
		System.out.println( (double)(10 / 3) );
		
		
		System.out.println( -7 % 3 );
		System.out.println( 7 % -3 );
		
	}

}

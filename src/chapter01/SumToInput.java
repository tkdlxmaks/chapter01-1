package chapter01;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		System.out.print( "입력>" );
		int number = scanner.nextInt();
		
		int sum = 0;
		for( int i = 1; i <= number; i++ ) {
			sum += i;
		}
		
		System.out.println( sum );
		scanner.close();
	}
}

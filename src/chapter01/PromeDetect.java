package chapter01;

import java.util.Scanner;

public class PromeDetect {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		// 입력
		System.out.print( "소수인지 판단할 숫자:" );
		int number = scanner.nextInt();
		
		// 변수 초기화
		boolean isPrime = true;
		int divisor = 2;
		
		// 판단
		while( divisor < number ) {
			
			if( number % divisor == 0 ) {
				/* 소수가 아님 */
				isPrime = false;
				break;
			}
			divisor++;
		}
		
		// 출력
		if( isPrime == true ) {
			System.out.println( number + "는(은) 소수 입니다.");
		} else {
			System.out.println( number + "는(은) 소수가 아닙니다.");
		}
		
		scanner.close();
	}
}

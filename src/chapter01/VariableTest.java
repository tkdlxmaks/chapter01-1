package chapter01;

public class VariableTest {

	public static void main(String[] args) {
		boolean b = true;
		int num1 = 10;
		int num2;
		num2 = 20;
		
		System.out.println( num1 + "x" + num2 + "=" + num1*num2 + b);
		
		float f = 3.14f;
		double d  = 3.14;
		String s = "Hello World";

		//b = 1;
		num1 = 20;
		
		// 상수
		final double PI = 3.14;
		double area = 3 * 3 * PI;
	}

}

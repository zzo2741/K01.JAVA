package ex05method;

import java.util.Scanner;

public class QuCircleCalculator
{
	final static double PI = 3.14;
	
	static double circleArea(double radius) {
		return PI * radius * radius;
	}

	static double circleRound(double radius)
	{
		return 2 * PI * radius; 
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름을 입력하시오 : ");

		double radius = sc.nextDouble();
		
		System.out.println("원의 둘레(" + radius + ") : " + circleRound(radius));
		System.out.println("원의 넓이(" + radius + ") : " + circleArea(radius));

	}
}


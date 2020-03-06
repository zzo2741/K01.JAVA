package ex05method;

import java.util.Scanner;

public class QuSimpleOperation
{
	static void arithmetic(int a, int b)
	{
		System.out.println("덧셈결과 -> " + (a + b));
		System.out.println("뺄셈결과 -> " + (a - b));
		System.out.println("곱셈결과 -> " + (a * b));
		System.out.println("나눗셈 몫 -> " + (a / b));
		System.out.println("나눗셈 나머지 -> " + (a % b));
	}

	public static void main(String[] args)
	{
		while (true)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("첫번째 숫자 : ");
			int num1 = scanner.nextInt();
			System.out.print("두번째 숫자 : ");
			int num2 = scanner.nextInt();
			if (num1 <= 0 || num2 <= 0)
			{
				System.out.println("음수는 입력할 수 없습니다.");
			} else
			{
				arithmetic(num1, num2);
			}
		}
	}
}


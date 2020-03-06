package ex04controlstatement;

import java.util.Scanner;

class Qu_04_04
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력 : ");
		int num = sc.nextInt();
		if (num > 0 && (num % 2) == 0)
		{
			System.out.println("양수이면서 짝수");
			System.out.println("출력완료");
		}
	}
}

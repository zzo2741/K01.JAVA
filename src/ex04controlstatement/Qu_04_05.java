package ex04controlstatement;

import java.util.Scanner;

public class Qu_04_05
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("nun1를 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("nun2를 입력 : ");
		int num2 = sc.nextInt();
		int big, diff;

		if (num1 > num2)
		{
			big = num1;
			diff = num1 - num2;
			System.out.println(big);
			System.out.println(diff);
		} else
		{
			big = num2;
			diff = num2 - num1;
			System.out.println(big);
			System.out.println(diff);
		}
	}
}


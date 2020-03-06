package ex04controlstatement;

import java.util.Scanner;

public class Qu_04_03
{

	public static void main(String[] args)
	{
		int kor, eng, math, avg;
		Scanner sc = new Scanner(System.in);

		System.out.print("국어점수를 입력 : ");
		kor = sc.nextInt();
		System.out.print("영어점수를 입력 : ");
		eng = sc.nextInt();
		System.out.print("수학점수를 입력 : ");
		math = sc.nextInt();

		avg = (kor + eng + math) / (3 * 10);

		switch (avg)
		{
		case 10:
		case 9:
			System.out.println("A학점 입니다.");
			break;
		case 8:
			System.out.println("B학점 입니다.");
			break;
		case 7:
			System.out.println("C학점 입니다.");
			break;
		case 6:
			System.out.println("D학점 입니다.");
			break;
		default:
			System.out.println("F학점 입니다.");
			break;
		}
	}
}


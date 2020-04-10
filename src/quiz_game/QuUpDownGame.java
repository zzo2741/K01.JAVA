package quiz_game;

import java.util.Scanner;

public class QuUpDownGame
{
	public static Scanner sc = new Scanner(System.in);
	public static int randomNum, userNum;

	// 난수 생성 메소드
	public static void createRandomNum()
	{
		randomNum = (int) (Math.random() * 100 + 1);
	}

	// 숫자 입력 메소드
	public static void enterUserNum()
	{
		System.out.print("번호를 입력하세요 : ");
		userNum = sc.nextInt();
	}

	// 업다운 숫자 체크
	public static void upDownCheck()
	{
		System.out.println("업다운 게임을 시작합니다.(범위 : 1~100)");
		createRandomNum();
		// System.out.println(randomNum);
		for (int life = 7; life >= 1; life--)
		{
			System.out.println("목숨이 " + life + "개 남았습니다.");
			enterUserNum();
			if (userNum < randomNum) // 업다운 판별
			{
				System.out.print("*업*  ");
			} else if (userNum > randomNum)
			{
				System.out.print("*다운* ");
			} else if (userNum == randomNum)
			{
				System.out.println("*USER WIN!!!!* 정답은 " + randomNum + "입니다.");
				return;
			}
		}
		System.out.println("\n*바보* 정답은 " + randomNum + "입니다.");
	}

	// 게임 메소드
	public static void upDownGame()
	{
		upDownCheck();
		while (true)
		{
			System.out.println("재시작 하시겠습니까? 1 : 재시작 / 0 : 게임 종료");
			enterUserNum();
			switch (userNum)
			{
			case 1:
				upDownCheck();
				continue;
			case 0:
				break;
			default:
				System.out.println("다시 입력해주세요");
				continue;
			}
			System.out.println("게임을 종료합니다.");
			break;
		}
	}

	public static void main(String[] args)
	{
		upDownGame();
	}
}

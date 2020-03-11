package quiz_game;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class WrongNumberException extends Exception
{
	public WrongNumberException()
	{
		super("게임과 관련없는 숫자입니다.");
	}
}

public class QuRockPaperScissorsGame
{

	public static int inputNum() throws WrongNumberException
	{
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		System.out.println(inputNum);

		// 1~3 외의 수가 입력된 경우 예외발생
		if (inputNum < 1 || inputNum > 3)
		{
			throw new WrongNumberException();
		}
		return inputNum;
	}

	public static int inputNum2() throws WrongNumberException
	{
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();

		// 0~1 외의 수가 입력된 경우 예외발생
		if (inputNum < 0 || inputNum > 1)
		{
			throw new WrongNumberException();
		}
		return inputNum;
	}

	public static void rpsGameStart()
	{

		Random random = new Random();
		int gameCount = 0;// 게임의 횟수를 카운트하기 위한 변수

		while (true)
		{

			// 1.난수생성 - 컴퓨터입장의 가위/바위/보
			int com = random.nextInt(10000) % 3 + 1;// 1~3사이의난수생성
			System.out.println("컴퓨터:" + com);

			// 2.사용자 입력
			int user = 0;
			System.out.println("가위바위보를 입력하세요");
			System.out.print("가위(1),바위(2),보(3)=>");
			try
			{
				user = inputNum();
			} catch (WrongNumberException e)
			{
				System.out.println("[예외발생] " + e.getMessage());
			} catch (InputMismatchException e)
			{
				System.out.println("[예외발생] 문자를 입력했습니다. 숫자를 입력하세요");
			}

			// 3.승부판단 및 결과출력
			if (!(user < 1 || user > 3))
			{
				// 정확하게 입력했을때 승부를 판단
				System.out.printf("사용자:%s, 컴퓨터:%s ", displayRPS(user), displayRPS(com));

				// 승부판단로직
				switch (user - com)
				{
				case 0:
					System.out.println("비겼습니다");
					break;
				case 1:
				case -2:
					System.out.println("이겼습니다");
					break;
				case -1:
				case 2:
					System.out.println("졌습니다");
					break;
				}

				// 게임카운트 증가
				gameCount++;
			}

			// 6.5번의 게임이 되었는지 판단후 재시작/종료 확인
			if (gameCount >= 5)
			{

				int restart = 0;
				while (true)
				{
					Scanner scanner = new Scanner(System.in);
					System.out.print("게임재시작(1), 종료(0):");
					try
					{
						restart = inputNum2();

					} catch (WrongNumberException e)
					{
						restart = 2;

						System.out.println("[예외발생] " + e.getMessage());
					} catch (InputMismatchException e)
					{
						restart = 2;
						System.out.println("[예외발생] 문자를 입력했습니다. 숫자를 입력하세요");
					}
					if (restart == 0 || restart == 1)
					{
						// 정상입력이면 루프탈출
						break;
					} else
					{
						System.out.println("잘못입력해씸ㅜㅜ\n");
					}
				}
				if (restart == 0)
				{
					// 게임종료를 위해 while루프 탈출
					break;
				} else
				{
					System.out.println("게임 재시작^^");
					gameCount = 0;
				}
			}
		}

	}

	// 가위 바위 보를 출력하는 메소드
	public static String displayRPS(int n)
	{
		String str = "";
		switch (n)
		{
		case 1:
			str = "가위";
			break;
		case 2:
			str = "바위";
			break;
		case 3:
			str = "보";
			break;
		}
		return str;
	}

	public static void main(String[] args)
	{
		// 가위바위보 게임 메소드 호출
		rpsGameStart();
	}
}

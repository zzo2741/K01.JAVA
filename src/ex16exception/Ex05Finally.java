package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * finally절
 * 		: 예외발생 여부와 상관없이 try문으로 진입했을 때 반드시 실행해야 하는 코드가 있는경우
 * 		기울하는 블럭이다. 즉, try문으로 진입되지 않는 다면 finally절은 실행되지 않는다.
 * 		1) try~catch : 예외를 직접 처리할 때
 * 		2) try~catch_finally : 예외를 직접 처리 후 실행할 문장이 있을때 
 * 		3) try~finally : 예외는 외부로 던지고 예외발생과 상관없이 실행할 문장이 있을 때...
 */
public class Ex05Finally
{

	static void runtume() throws NumberFormatException
	{
		Integer.parseInt("백");
	}

	static void tryCatchFinally()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = Integer.MAX_VALUE;
		try
		{
			age = sc.nextInt(); // <- 30 살
			System.out.println("당신은 5년 후 " + (age + 5) + "살 입니다.");
			// try구문에서 return을 만나도 finally구문은 실행된다.
			return;
		} catch (InputMismatchException e)
		{
			// 예외가 발생되더라도 finally구문은 실행된다.
			System.out.println("나이는 숫자만 쓰세요");
		} finally
		{
			System.out.println("항상 실행되는 finally절 입니다.");

			// 프로그램 자체가 종료된다.
			/*
			 * try문안에서 exit(0)를 실행하게 되면 프로그램 자체가 종료되므로 finally 구문은 실행되지 않는다.
			 */
			System.exit(0);
		}
	}

	public static void main(String[] args)
	{
		try
		{
			runtume();
		} catch (NumberFormatException e)
		{
			e.printStackTrace();
		}
		tryCatchFinally();
		System.out.println("메인 메소드 끝");
	}
}

package ex04controlstatement;

public class E05For_2
{
	public static void main(String[] args) {

		/*
		 * 시나리오] 다음의 출력결과를 보이는 for문을 작성하시오
		 * 
		 * 출력결과 0 0 0 1 0 0 1 0 0 1 0 0 1 0 0 0 해법 : x와 y를 더해서 5개 될때 1을 출력한다.
		 */

		System.out.println("-=-=-=-=-=증감연산자 사용으로 구현=-=-=-=-=-");
		int garo, sero;
		for (garo = 1; garo <= 4; garo++)
		{
			for (sero = 1; sero <= 4; sero++)
			{
				if ((garo + sero) == 5)
				{
					System.out.print("1 ");
				} else
				{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}

		System.out.println("-=-=-=-=-=감소연산자 사용으로 구현=-=-=-=-=-");
		int garo2, sero2;
		for (garo2 = 1; garo2 <= 4; garo2++)
		{
			for (sero2 = 4; sero2 >= 1; sero2--)
			{
				if (garo2 == sero2)
				{
					System.out.print("1 ");
				} else
				{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}

		/*
		 * 욘습문제] 구구단을 출력하는 프로그램을 for문으로 작성하시오
		 */

		int dan, su;

		for (dan = 2; dan <= 9; dan++)
		{
			System.out.printf("--------%d단은--------\n", dan);
			for (su = 1; su <= 9; su++)
			{
				System.out.printf("%-2d X %-2d = %2d\n", dan, su, (dan * su));
			}
		}

	}
}

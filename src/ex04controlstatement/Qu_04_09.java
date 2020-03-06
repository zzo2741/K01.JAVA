package ex04controlstatement;

public class Qu_04_09
{
	public static void main(String[] args)

	// su가 고정된 상태에서 dan이 증가하는 형태로 구성된다.
	{
		for (int su = 1; su <= 9; su++)
		{
			for (int dan = 2; dan <= 9; dan++)
			{
				System.out.printf("%-2d X %-2d = %3d ", dan, su, dan * su);
			}
			System.out.println();
		}
	}
}

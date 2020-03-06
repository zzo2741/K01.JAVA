package ex04controlstatement;

public class QuUpgradeGuGu
{
	public static void main(String[] args)
	{
		int total = 1;
		for (int dan = 2; dan <= 9; dan++)
		{
			for (int su = 1; su <= 9; su++)
			{
				if (su == 1)
				{
					total = dan * su;
					System.out.println(dan + " X " + su + " = " + total);
				} else
				{
					System.out.print(dan);
					for (int su2 = 2; su2 <= su; su2++)
					{
						System.out.print(" X " + dan);
					}
					total *= dan;
					System.out.println(" = " + total);
				}
			}
		}
	}
}

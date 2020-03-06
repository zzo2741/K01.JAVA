package ex05method;

public class QuUpgradeGuGu
{

	public static void main(String[] args)
	{
		int total = 1;
		for (int dan = 2; dan <= 9; dan++)
		{
			for (int su = 1; su <= 9; su++)
			{
				if (dan == su)
				{
					if (su == 1)
					{
						total = dan * su;

					} else
					{
						for (int su2 = 2; su2 <= 10; su2++)
						{
							total *= su;
							System.out.println(total);
						}
					}
					total = 1;
				}
			}
		}
	}
}
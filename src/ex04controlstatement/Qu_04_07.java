package ex04controlstatement;

public class Qu_04_07
{
	public static void main(String[] args) {
		int total = 0;
		System.out.print("3");
		for (int i = 6; i <= 100; i++)
		{
			if ((i % 3) == 0 || (i % 7) == 0)
			{

				if (i % (3 * 7) != 0)
				{
					System.out.print("+");
					System.out.print(i);
					total += i;
				}

			}
		}
		System.out.print("=" + (total + 3));
	}
}

//if ((i % 3) == 0 && (i % 7) == 0)
//{
//	total -= i;
//} else
//{
//	System.out.print("+");
//	System.out.print(i);
//}

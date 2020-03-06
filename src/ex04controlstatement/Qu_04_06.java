package ex04controlstatement;

public class Qu_04_06
{
	public static void main(String[] args) {
		int x = 1, y = 1;
		while (x <= 5)
		{
			while (y <= x)
			{
				System.out.print("* ");
				y++;
			}
			System.out.println();
			y = 1;
			x++;
		}
	}
}

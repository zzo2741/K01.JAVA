package quiz_game;

public class test
{
	public static void main(String[] args)
	{
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = i;
		}
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		arr[1] = 3;
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		arr[1] = arr[9];
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}

package ex06array;

public class QuArray1To10
{

	public static void main(String[] args)
	{
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = i + 1;
		}
		
		int sum = 0;

		for (int j = 0; j < arr.length; j++)
		{
			System.out.print(arr[j] + " ");
		}
		for (int k = 0; k <arr.length; k++ ) {
			sum += arr[k];
		}
		
		System.out.println("합계 = " + sum);
	}

}

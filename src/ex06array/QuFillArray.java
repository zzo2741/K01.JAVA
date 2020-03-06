package ex06array;

import java.util.Scanner;

public class QuFillArray
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		int[] arr2 = new int[10];
		int f = 0, l = arr.length -1;

		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = scanner.nextInt();
		}
		System.out.print("입력한 정수 = ");
		for (int j = 0; j < arr.length; j++)
		{
			System.out.print(arr[j] + " ");
		}

		for (int k = 0; k < arr.length; k++)
		{
			if (arr[k] % 2 == 0)
			{
				arr2[l] = arr[k];
				l--;
			} else
			{
				arr2[f] = arr[k];
				f++;
			}
		}
		System.out.println();
		for (int j = 0; j < arr2.length; j++)
		{
			System.out.print(arr2[j] + " ");
		}

	}
}

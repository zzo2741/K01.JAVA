package quiz_game;

import java.util.Scanner;

class SelectionSort
{
	public int[] arrInit()
	{
		int[] arrNum = new int[10];
		for (int i = 0; i < arrNum.length; i++)
		{
			int randomNum = (int) (Math.random() * 100 + 1);
			arrNum[i] = randomNum;
			for (int j = 0; j < i; j++)
			{
				if (arrNum[j] == randomNum)
				{
					i--;
					break;
				}
			}

		}
		return arrNum;
	}

	public void ShowArr(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

	public void asc(int[] arr)
	{
		int smallNum, num = 0, i = 0, j = 0;

		for (i = 0; i < 9; i++)
		{
			smallNum = 101;
			for (j = i; j < arr.length; j++)
			{
				if (smallNum > arr[j])
				{
					smallNum = arr[j];
					num = j;
				}
			}
			arr[num] = arr[i];
			arr[i] = smallNum;
			System.out.print("sort" + (i + 1) + "번진행 : ");
			ShowArr(arr);
			System.out.println();
		}
		System.out.println();

	}

	public void desc(int[] arr)
	{

		int bigNum, num = 0, i = 0, j = 0;

		for (i = 0; i < 9; i++)
		{
			bigNum = 0;
			for (j = i; j < arr.length; j++)
			{
				if (bigNum < arr[j])
				{
					bigNum = arr[j];
					num = j;
				}
			}
			arr[num] = arr[i];
			arr[i] = bigNum;
			System.out.print("sort" + (i + 1) + "번진행 : ");
			ShowArr(arr);
			System.out.println();
		}
		System.out.println();
	}

	public void showMenu()
	{
		System.out.println("\n정렬방식을 선택하세요.");
		System.out.println("1. 오름차순");
		System.out.println("2. 내림차순");
		System.out.print("선택 : ");
	}
}

public class QuSelectionSort
{
	static final int ASC = 1, DESC = 2;

	public static void main(String[] args)
	{
		SelectionSort ss = new SelectionSort();
		while (true)
		{
			int[] arr = ss.arrInit();
			System.out.print("배열보기 : ");
			ss.ShowArr(arr);
			Scanner scanner = new Scanner(System.in);
			ss.showMenu();
			int answer = scanner.nextInt();
			switch (answer)
			{
			case ASC:
				ss.asc(arr);
				break;

			case DESC:
				ss.desc(arr);
				break;
			}
		}
	}

}

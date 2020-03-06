package ex06array;

public class QuNumberCounter
{

	public static void main(String[] args)
	{
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];

		// 배열의 크기만큼 반복하면서 각 요소를 읽어온다.....

		for (int i = 0; i < answer.length; i++)
		{
//			switch (answer[i])
//			{
//			case 1:
//				counter[0]++;
//				break;
//			case 2:
//				counter[1]++;
//				break;
//			case 3:
//				counter[2]++;
//				break;
//			case 4:
//				counter[3]++;
//				break;
//			}
			/*
			 * 위 조건문을 한줄로 수정하면 다음과 같다.
			 * 검색한 숫자가 만약 1이라면 counter배열의 0번 인덱스를 +1 증가시키므로 아래와 같이 표현할 수 있다.
			 */
			counter[answer[i] - 1]++;

		}

		for (

				int j = 0; j < counter.length; j++)
		{
			System.out.println("counter[" + j + "] -> " + counter[j]);
		}

	}

}

package ex04controlstatement;

import java.util.Scanner;

/*
 * while문
 * : 반복의 횟수가 정해져 있지 않을때 주로 사용하는 반복문이다.
 * 반복의 횟수가 명확할때는 주로 for문을 사용한다.
 * 형식]
 * 		반복을 위한 변수의 초기값 선언:
 * 		while(반복의 조건) {
 * 			실행문;
 * 			변수의 증감식; <- 반복문 탈출을 위한
 * 							++,--와 같은 연산이 필요함.
 * 		}
 * 반복의 조건이 false일때 while문을 탈출한다.
 */
public class E03While
{
	public static void main(String[] args) {

		// 누적합을 저장하기 위한 변수선언, 증가하는 i를 누적해서 더함
		int sum = 0;

		// 반복을 위한 변수선언 및 초기화
		int i = 1;

		while (i < 10)// 반복의 조건 설정
		{

			// 증가되는 i를 sum에 누적해서 더함(1+2+3+4....)
			sum += i;

			// while문을 탈출하기 위한 조건을 위해 증가 연산
			i++;
		}
		System.out.println("1~10 합 : " + sum);

		/*
		 * 시나리오] 1부터 100까지의 정수 중 3의 배수이거나 5의배수인 수의 합을 구하여 출력하는 프로그램을 while을 사용해서 작성하시오.
		 */

		int sum2 = 0, j = 1;

		while (j <= 100)
		{
			if (j % 3 == 0 || j % 5 == 0)
			{
				sum2 += j;
			}
			j++;
		}
		System.out.println("합 : " + sum2);

		/*
		 * 시나리오] 구구단을 출력하는 프로그램을 while문으로 작성하시오
		 */
		int gop = 1, gugudan;
		Scanner scanner = new Scanner(System.in);
		System.out.print("구구단할 숫자 입력 : ");
		int num = scanner.nextInt();

		while (gop <= 9)
		{
			gugudan = num * gop;
			System.out.printf("%-2d * %-2d = %-2d%n", num, gop, gugudan);

			gop++;
		}

		System.out.println("------------단 전체 출력-----------");
		System.out.println("단 전체 출력");
		int dan = 2; // 단
		while (dan <= 9) //단은 2~9까지 증가함
		{
			int su = 1;//수(하나의 단을 출력한 후 단이 증가하면 수는 1로 초기화
			while (su <= 9)//수 1~9까지 증가함
			{
				//서식에 맞춰 출력할 때는 printf문이 훨씬 더 유리함
				System.out.printf("%d * %d = %d%n", dan, su, (dan * su));
				su++;
			}
			dan++;

		}
		
		/*
		시나리오] 아래와같은 모양을 출력하는 while문을 작성하시오.
			출력결과
				1 0 0 0
				0 1 0 0
				0 0 1 0
				0 0 0 1
		 */
		
		System.out.println("-----------------------------------");
		int garo = 1;
		while(garo <= 4) {
			int sero = 1;
			while(sero <= 4) {
				if(garo == sero) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
				sero++;
			}
			System.out.println("");
			garo++;
		}
	}
}

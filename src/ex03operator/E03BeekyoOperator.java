package ex03operator;

public class E03BeekyoOperator {
	public static void main(String[] args) {
		
		/*
		 * 비교연산자 : 좌우측항의 값이 크거나, 같거나 한지 비교하는 연산자
		 */

		int num1 = 10, num2 = 20;
		
		/*
		 * num1이 클때 참을 반환하므로, 아래 조건은 거짓이 된다. else문이 실행한다.
		 */

		if (num1 > num2) {
			System.out.println("num1이 큼");
		} else {
			System.out.println("num2이 큼");
		}
		
		/*
		 *num1과 num2가 다를때 참을 반환하므로, 아래조건은 참이 된다. if구문이 실행된다. 
		 */
		
		if (num1 != num2) {
			System.out.println("num1과 num2가 다름");
		} else {
			System.out.println("num1과 num2가 같음");
		}
	}
}

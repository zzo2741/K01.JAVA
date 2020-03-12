package ex18lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/*
 * Function
 * 		- 매개변수와 리턴값을 둘다 가지고 있는 applyXXX()계열의 추상메소드를 가지고 있음
 * 		- 위 메소드는 매개값과 리턴값으로 타입변환(메핑)하는 역할을 함.
 */
public class Ex06Define4Function
{

	public static void main(String[] args)
	{
		/*
		 * Interface Function<T, E> { E apply(T t); }
		 */

		// 문자열을 매개변수로 받아 길이를 반환하는 람다식
		// String형의 인자를 받아서 Interger형의 반환값을 가짐
		Function<String, Integer> func = (String s) ->
		{
			return s.length();
		};

		System.out.println("Lambda 문자열 길이 = " + func.apply("Lambda"));
		System.out.println("LambdaExpresstion 문자열길이 = " + func.apply("LambdaExpresstion"));

		System.out.println("===============================");

		Human p1 = new Human("이정연", "여", 90);
		Human p2 = new Human("이준승", "남", 100);
		Human p3 = new Human("이준모", "남", 95);
		Human p4 = new Human("이주연", "여", 80);
		List<Human> list = Arrays.asList(p1, p2, p3, p4);

		//Human객체를 매개값으로 받아서 점수를 반환하는 람다식
		Function<Human, Integer> getFunction = (Human h) ->
		{
			return h.getScore();// Human객체의 score값 반환
		};

		int score = getFunction.apply(p1);
		System.out.println("p1의 정수 : " + score);

		System.out.println("#### List에 저장된 객체의 점수 출력");
		for (Human human : list)
		{
			System.out.println(human.getName() + "의 점수 : " + getFunction.apply(human));
		}

	}

}

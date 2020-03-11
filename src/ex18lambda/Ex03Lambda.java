package ex18lambda;

/*
 * 일반적인 인터페이스와 클래스를 활용한 오버라이딩 
 */
interface Ikosmo3
{
	/*
	 * 인터페이스에 정의된 메소드는 public abstract로 선언한다.
	 */
	void studyLambda(String str);
}

public class Ex03Lambda
{

	Ikosmo3 kosmo = str ->
	{
		System.out.println("람다식");
	};
}

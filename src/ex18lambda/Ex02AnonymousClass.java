package ex18lambda;

/*
 * 일반적인 인터페이스와 클래스를 활용한 오버라이딩 
 */
interface Ikosmo2
{
	/*
	 * 인터페이스에 정의된 메소드는 public abstract로 선언한다.
	 */
	void studyLambda(String str);
}

public class Ex02AnonymousClass
{

	public static void main(String[] args)
	{
		// Ikosmo2 인터페이스를 구현한 익명클래스 정의
		Ikosmo2 kosmo = new Ikosmo2()
		{
			@Override
			public void studyLambda(String str)
			{
				System.out.println(str);
			}
		};
		kosmo.studyLambda("람다식");
	}

}

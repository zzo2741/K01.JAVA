package ex15usefulclass;

/*
 * Object 클래스
 * - 자바에서의 최상위 클래스이다.
 * - 별도의 선언없이 Object클래스에 정의된 모든 메소드를 사용할 수 있다.
 * - 개발자가 정의한 모든 클래스를 Object인스턴스로 참조할 수 있다.
 * 		예) Object obj = new Object()
 * 			혹은
 * 			void myFunc(Object obj) {
 * 				실행부;
 * 			}
 */
class MyFriends extends Object
{
	String myName;

	public MyFriends(String myName)
	{
		this.myName = myName;
	}

	// 오버라이딩 처리하여 메소드를 재정의함.
	@Override
	public String toString()
	{
		return "이름은 : " + myName;
	}

}

/*
 * toString()메소드
 * - Object클래스에 정의된 메소드로 println()이 문자열을 출력하기 전에 자동으로 호출하는 메소드이다.
 * - 인스턴스 변수를 문자열 형태로 변환하여 반환해준다.
 * - 필요한 경우 클래스를 정의할 때 적절히 오버라이딩하여 재정의 하는 것이 좋다. 단, 필수사항은 아니다.
 */
class YourFriends extends Object
{
	private String myName;

	public YourFriends(String myName)
	{
		this.myName = myName;
	}

	public String getMyName()
	{
		return myName;
	}
	
	
}

public class E04Object1toString
{
	public static void main(String[] args)
	{
		MyFriends fnd1 = new MyFriends("이준승");
		YourFriends fnd2 = new YourFriends("이정연");
		System.out.println(fnd1); //이름이 출력됨
		System.out.println(fnd2); //인스턴스의 주소값이 출력됨
		System.out.println("이름은 : " + fnd2.getMyName());
	}
}

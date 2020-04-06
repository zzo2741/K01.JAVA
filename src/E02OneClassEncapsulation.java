class SinusCap
{
	void sniTake()
	{
		System.out.println("콧물 싹");
	} 

	void sneTake()
	{
		System.out.println("재채기 싹");
	}

	void snuTake()
	{ 
		System.out.println("코가 뻥");
	}

	void take()
	{
		sniTake();
		snuTake();
		sneTake();
	}
}

class ColdPatient
{
	void takeSinus(SinusCap cap)
	{
		cap.take();
	}
}

public class E02OneClassEncapsulation
{

	public static void main(String[] args)
	{
		ColdPatient suf = new ColdPatient(); // ColdPatient 인스턴스화, 참조변수 suf
		suf.takeSinus(new SinusCap());
		System.out.println(new SinusCap());
		System.out.println(new SinusCap());
		System.out.println(new SinusCap());
		System.out.println("----------------");
		SinusCap sc = new SinusCap();
		System.out.println(sc);
		System.out.println(sc);


		/*
		 * -이해한 부분 1. suf는 ColdPatient를 참조하므로 ColdPatient의 takeSinus
		 * 함수를 호출. 2. ColdPatient의 takeSinus의 매개변수로 자료형은 SinusCap클래스
		 * 매개변수명은 cap으로 받음.
		 * 
		 * -이해 못하는 부분 1. 메인메소드에서 takeSinus호출과 동시에 인자값으로 SinusCap의
		 * 인스턴스화를 전달?????? 참조변수명은??????
		 */

	}
}
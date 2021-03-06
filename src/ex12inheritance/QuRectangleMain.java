package ex12inheritance;

// 직사각형을 표현한 클래스
class Rectangle
{
	// 멤버변수
	private int w, h; // 가로 세로 선언

	// 인자생성자
	public Rectangle(int w, int h)
	{
		this.w = w;
		this.h = h;
	}

	public void ShowAreaInfo()
	{
		System.out.println("직사각형 면적 : " + (w * h));
	}

	public int getW()
	{
		return w;
	}

	public int getH()
	{
		return h;
	}
	
	

}

//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle
{
	// 멤버변수 : 확장없음
	/*
	 * 부모클래스에서 이미 가로, 세로 길이가 정의되어 있으므로 추가적인 멤버변수의 정의는 불필요하다.
	 */

	// 생성자
	/*
	 * 정사각형은 가로, 세로 길이가 동일하므로 인자값 1개로 부모의 멤버변수 2개를 동시에 초기화 한다.
	 */
	//*****중요*****
	public Square(int w)
	{
		super(w, w);
	}

	/*
	넓이를 구하는 공식은 동일하나 부모는 직사각형, 자식은 정사각형의 면적을 출력해야 하므로 오버라이딩 해야한다.
	 */
	@Override
	public void ShowAreaInfo()
	{
		System.out.println("정사각형 면적 : " + (getW() * getH()));
	}
}

class QuRectangleMain
{
	public static void main(String[] args)
	{
		Rectangle rec = new Rectangle(4, 3);
		rec.ShowAreaInfo();

		Square sqr = new Square(7);
		sqr.ShowAreaInfo();
	}
}

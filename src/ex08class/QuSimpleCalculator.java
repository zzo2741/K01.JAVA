package ex08class;

class CalculatorEx
{
	// 멤버변수 : 연산의 횟수를 카운트할 용도로 사용
	int add, min, mul, div;

	// 멤버변수 초기화 메소드
	public void init()
	{
		add = min = mul = div = 0;
	}

	public double add(int _num1, int _num2)
	{
		add++; // 덧셈연산 횟수 카운트
		return _num1 + _num2;
	}

	public double min(double _num1, double _num2)
	{
		min++; // 뺄셈연산 횟수 카운트
		return _num1 - _num2;
	}

	public double mul(double _num1, double _num2)
	{
		mul++; // 곱셈연산 횟수 카운트
		return _num1 * _num2;
	}

	public double div(int _num1, int _num2)
	{
		div++; // 나눗셈연산 횟수 카운트
		return _num1 / _num2;
	}
	
	// 연산횟수를 출력하는 멤버메소드
	public void showOpCount()
	{
		System.out.println("덧셈횟수 : " + add);
		System.out.println("뺄셈횟수 : " + min);
		System.out.println("곱셈횟수 : " + mul);
		System.out.println("나눗셈횟수 : " + div);
	}
}

public class QuSimpleCalculator
{
	public static void main(String[] args)
	{
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1, 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5, 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0, 5.0));
		System.out.println("100 / 25 = " + cal.div(100, 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0, 3.0));
		cal.showOpCount();
		System.out.println("결과를 카운트하는 멤버변수를 init()으로 초기화한 결과");
		cal.init();
		cal.showOpCount();

	}
}

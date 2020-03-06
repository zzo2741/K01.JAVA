package ex05method;

public class QuTemperature
{
	// 섭씨 -> 화씨
	static double cToF(int cel)
	{
		return 1.8 * cel + 32;
	}

	// 화씨 -> 섭씨

	static double fToC(int fah)
	{
		return (fah - 32) / 1.8;
	}

	public static void main(String[] args)
	{
		System.out.println("섭씨 20도 -> 화씨 " + cToF(20) + "도");
		System.out.println("화씨 80도 -> 섭씨 " + fToC(80) + "도");
	}
}

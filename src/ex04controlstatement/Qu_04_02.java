package ex04controlstatement;

import java.io.IOException;

public class Qu_04_02
{

	public static void main(String[] args) throws IOException
	{
		System.out.print("하나의 문자를 입력하시오 : ");
		int munJa = System.in.read();
		int flag = ((munJa >= '0' && munJa <= '9') ? 1 : 0);
		String resultStr = (munJa >= '0' && munJa <= '9' ? "숫자임" : "숫자아님");
		System.out.println(resultStr);

		if (flag == 1)
		{
			System.out.println((char) munJa + "는 숫자 O");

		} else if (flag == 0)
		{
			System.out.println((char) munJa + "는 숫자 X");
		}

	}

}


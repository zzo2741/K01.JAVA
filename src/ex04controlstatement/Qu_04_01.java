package ex04controlstatement;

import java.io.IOException;

public class Qu_04_01

{
	public static void main(String[] args) throws IOException {

		System.out.printf("하나의 문자를 입력하시오 : ");
		int munJa = System.in.read();

		if (munJa >= '0' && munJa <= '9')
		{
			if ((munJa - '0') % 2 == 0 && munJa != '0')
			{
				System.out.println((char) munJa + "는 2의 배수입니다.");
			} else
			{
				System.out.println((char) munJa + "는 2의 배수가 아닙니다.");
			}
		} else
		{
			System.out.println((char) munJa + "는 숫자가 아닙니다.");
		}
	}
}

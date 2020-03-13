package ex20io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class E08StringWriter
{

	public static void main(String[] args)
	{

		try
		{
			/*
			 * 문자열을 저장하기 위한 출력스트림을 생성한다. 
			 * 문자열의 입력은 버퍼링에 따라 성능의 차이가 크기때문에 버퍼필터스트림을 추가적으로 연결해서 사용한다.
			 */
			BufferedWriter out = new BufferedWriter(new FileWriter("src/ex20io/string.txt"));

			/*
			 * write()메소드를 통해 문자열을 파일에 저장한다.
			 * 이때, 개행(줄바꿈)은 newLine()메소드를 통해서 삽입하게 되는데, 각 OS별로 개행문자가 다르기 때문이다.
			 */
			out.write("제 이름은 이정연입니다.");
			out.newLine();
			out.write("나는 바보입니다.");
			out.newLine();

			out.close();
			System.out.println("입력 완료");
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}

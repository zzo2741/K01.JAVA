package ex20io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 파일에 정수/실수와 같은 데이터를 저장하는 필터스트림과 버퍼링을 제공하는 필터스트림까지 주기적으로 연결한 후 파일을 생성하는 프로그램.
 * 이처럼 필터스트림을 여러개를 연결하는 것이 가능하다.
 */
public class E05FilterDataBufferStream
{
	public static void main(String[] args)
	{
		String src = "src\\ex20io\\FilterdataStream.bin";

		try
		{
			/*
			 * Out 생성느낌 -> In 출력느낌 순서
			 * 1. FileOutputStream 파일생성을 위한 출력 파일스트림 생성
			 * 2. BufferedOutputStream 버퍼 사용을 위한 버퍼스트림 생성
			 * 3. DataOutputStream 파일에 기본자료형 데이터를 저장하기 위한 필터스트림
			 */
			DataOutputStream datafilterOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(src)));

			datafilterOut.writeInt(555);
			datafilterOut.writeDouble(55.55);
			datafilterOut.writeInt(999);
			datafilterOut.writeDouble(99.99);

			datafilterOut.close();

			DataInputStream dataFilterIn = new DataInputStream(new BufferedInputStream(new FileInputStream(src)));

			// 각각의 데이터를 읽어옴
			int intNum1 = dataFilterIn.readInt();
			double dblNum1 = dataFilterIn.readDouble();
			int intNum2 = dataFilterIn.readInt();
			double dblNum2 = dataFilterIn.readDouble();

			dataFilterIn.close();

			System.out.println(String.format("저장된 정수는 %d, %d\n", +intNum1, intNum2));
			System.out.println(String.format("저장된 실수는 %.2f, %.2f\n", +dblNum1, dblNum2));
		} catch (Exception e)
		{
			System.out.println("IO예외 발생");
			e.printStackTrace();
		}
	}
}

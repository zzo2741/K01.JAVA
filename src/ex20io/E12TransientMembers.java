package ex20io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class PersonalInfo implements Serializable
{
	String name;
	transient String myWeight;
	int age;
	transient int mySecretNumber;

	public PersonalInfo(String name, String myWeight, int age, int mySecretNumber)
	{
		this.name = name;
		this.myWeight = myWeight;
		this.age = age;
		this.mySecretNumber = mySecretNumber;
	}

	public void showInfo()
	{
		System.out.println(String.format("이름 : %s%n", name));
		System.out.println(String.format("몸무게 : %s%n", myWeight));
		System.out.println(String.format("나이 : %s%n", age));
		System.out.println(String.format("금고비번: %s%n", mySecretNumber));
	}

}

public class E12TransientMembers
{

	public static void main(String[] args)
	{
		try
		{
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/ex20io/person.obj"));
			PersonalInfo info = new PersonalInfo("영희", "200kg", 19, 123456789);
			System.out.println("인스턴스 생성직 후 출력");
			info.showInfo();
			System.out.println("==================");
			out.writeObject(info);
			out.close();

			ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/ex20io/person.obj"));

			PersonalInfo reInfo = (PersonalInfo) in.readObject();
			in.close();

			System.out.println("인스턴스 복원 후 출력");
			reInfo.showInfo();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}

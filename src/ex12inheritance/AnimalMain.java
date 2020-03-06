package ex12inheritance;

import java.util.Scanner;

public class AnimalMain
{
	public static void main(String[] args)
	{
		// 강아지 객체생성
		System.out.print("종이 무엇인가요? = ");
		Scanner scanner = new Scanner(System.in);
		String sp = scanner.nextLine();

		AnimalDog dog = new AnimalDog(sp, 2, "수컷", "포매라니안", "뽀미");
		dog.showAnimal();
		System.out.println("====================");
		dog.bark();
		System.out.println("====================");
		dog.showDog();
	}
}

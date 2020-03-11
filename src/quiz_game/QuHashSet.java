package quiz_game;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class Avengers
{
	String name;
	String heroName;
	String weapon;

	public Avengers(String name, String heroName, String weapon)
	{
		super();
		this.name = name;
		this.heroName = heroName;
		this.weapon = weapon;
	}

	@Override
	public String toString()
	{
		return "Avengers [본명=" + name + ", 닉네임=" + heroName + ", " + "능력=" + weapon + "]";
	}

	@Override
	public int hashCode()
	{
		// 객체가 가진 고유한 값(참조값)을 int형으로 반환하는 메소드
		int hc1 = name.hashCode();
		int hc2 = heroName.hashCode();
		int hc3 = weapon.hashCode();
		System.out.println(hc1 + " " + hc2 + " " + hc3);
		int result = hc1 + hc2 + hc3;
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((heroName == null) ? 0 : heroName.hashCode());
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + ((weapon == null) ? 0 : weapon.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		{
			// 형변환
			Avengers compareAvengers = (Avengers) obj;

			// 자동 호출되는지 확인
			System.out.println("중복 제거용 equals()메소드 호출");

			// if (comparePerson.age == this.age && comparePerson.name.equals(this.name))

			if (compareAvengers.name.equals(this.name) && compareAvengers.heroName.equals(this.heroName)
					&& compareAvengers.weapon.equals(this.weapon))
			{
				return true; // 똑같으면 true 반환하는 것이 원칙
			} else
			{
				return false;
			}
		}
	}
}

public class QuHashSet
{
	public static void main(String[] args)
	{

		HashSet<Avengers> set = new HashSet<Avengers>();

		Avengers hero1 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		Avengers hero2 = new Avengers("스티브로져스", "캡틴아메리카", "비브라늄 방패");
		Avengers hero3 = new Avengers("브루스배너", "헐크", "강한피부&점프");
		Avengers hero4 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");

		set.add(hero1);
		set.add(hero2);
		set.add(hero3);
		set.add(hero4);

		System.out.println("[최초 전체 정보출력]");
		for (Avengers av : set)
		{
			System.out.println(av);
		}

		// 이름으로 검색
		System.out.print("검색할 이름을 입력하세욤 : ");
		Scanner scanner = new Scanner(System.in);
		String searchName = scanner.nextLine();
		boolean searchFlag = false; // 검색결과 유무 확인

		for (Iterator iterator = set.iterator(); iterator.hasNext();)
		{
			Avengers avengers = (Avengers) iterator.next();
			if (searchName.equals(avengers.name))
			{
				System.out.println(avengers);
				searchFlag = true;
			}
		}
		
		if(searchFlag != false) {
			System.out.println("이딴 영웅이 어딨냐");
		}
		else {
			System.out.println(searchName + "요기땅");
		}
	}
}

package ex17collection;

import java.util.HashSet;

import commom.Person;

public class Ex04HashSet2
{

	public static void main(String[] args)
	{

		HashSet<Person> hashSet = new HashSet<>();
		
		Person p1 = new Person("이정연", 56);
		Person p2 = new Person("이준승", 26);
		Person p3 = new Person("이정연", 56);
		
		hashSet.add(p1);
		hashSet.add(p2);
		boolean b = hashSet.add(p3);
		System.out.println("p3 객체 저장 여부 : " + b);
		
		System.out.println("HashSet에 저장된 객체 수 : " + hashSet.size());
	}
}

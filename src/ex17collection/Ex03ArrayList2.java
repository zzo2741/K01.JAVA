package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import commom.Student;

public class Ex03ArrayList2
{

	public static void main(String[] args)
	{
		
		// List계열의 컬렉션 생성 시 타입 매개변수를 Student형으로 선언함.
		//LinkedList<Student> list2 = new LinkedList<>();
		ArrayList<Student> list2 = new ArrayList<>();

		// 개발자가 정의한 인스턴스 생성(외부패키지)
		Student st1 = new Student("이준승", 26, "1995");
		Student st2 = new Student("이정연", 24, "1997");
		Student st3 = new Student("이준모", 20, "2001");
		Student st4 = new Student("박주환", 26, "1995"); 

		// 컬렉션에 인스턴스 추가 
		list2.add(st1); // 인덱스 0
		list2.add(st2);
		list2.add(st3);
		list2.add(st4); // 인덱스 3
		list2.add(st2); /* 객체의 중복저장. List컬렉션은 중복 허용됨*/

		System.out.println("[중복 저장 후]");
		for (Student student : list2)
		{
			student.showInfo();
		}

		/*
		 * 인스턴스 삭제 : 인덱스가 아닌 객체의 참조값을 통해 삭제하는 경우
		 * 		중독된 값이 있으면 앞에 있는 객체 하나만 삭제된다.
		 */
		list2.remove(st2);
		System.out.println("\n[중복 저장된 객체 삭제 후]");
		for (Student student : list2)
		{
			student.showInfo();
		}

		System.out.println("\n[반복자 사용]");
		for (Iterator<Student> iterator = list2.iterator(); iterator.hasNext();)
		{
			//Student student = (Student) iterator.next();
			//student.showInfo();
			
			//위의 문장을 한줄로 표현. next()메소드를 통해 객체를 가져온 후
			//showInfo()메소드로 객체의 내용 출력
			iterator.next().showInfo();
		}

		// List계열의 컬렉션은 인덱스로 접근 가능함
		System.out.println("\n[일반 for문 사용]");
		for (int i = 0; i < list2.size(); i++)
		{
			// 리스트 컬렉션에 인덱스로 접근하는 경우 get(인덱스)메소드를 사용한다.
			list2.get(i).showInfo();
		}

		System.out.println("\n[확장 for문 사용]");
		for (Student student : list2)
		{
			student.showInfo();
		}

		// 인덱스를 통한 삭제 : 삭제 성공 시 해당 객체가 반환된아아아아아.
		System.out.println("\n삭제된 객체의 이름 : " + list2.remove(2).name);

		// 인스턴스 참조값을 통한 삭제 : 삭제 성공시 boolean값이 반환된다.
		list2.remove(st1);

		System.out.println("\n[인스턴스 삭제 후]");
		for (Student student : list2)
		{
			student.showInfo();
		}
	}
}

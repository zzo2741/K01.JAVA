package quiz_game;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import commom.Student;

public class QuArrayList
{

	public static void main(String[] args)
	{
		// ArrayList<Student> list = new ArrayList<Student>();
		LinkedList<Student> list = new LinkedList<Student>();

		// 저장할 객체 생성
		Student st1 = new Student("가길동", 10, "2018");
		Student st2 = new Student("나길동", 20, "2017");
		Student st3 = new Student("다길동", 30, "2016");
		Student st4 = new Student("마길동", 40, "2015");

		// 객체 추가(컬렉션에 저장)
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);

		// 1.검색할 이름을 입력받음
		System.out.print("찾는 사람 : ");
		Scanner scanner = new Scanner(System.in);
		String searchName = scanner.nextLine();
		int cheak = 0, index = 0;

		// 2.확장for문으로 컬렉션 전체를 접근
		for (Student student : list)
		{
			if (searchName.equals(student.name))
			{
				index = list.indexOf(student);
				cheak = 1;
				break;
			}
		}
		System.out.println(index);
		// 3.검색결과 유/무에 따라
		// 검색결과 있을때…검색된 데이터 삭제.
		System.out.println("[검색되었습니다.]");
		list.remove(index);
		// 검색결과 없을때...검색결과가 없다고 출력
		if (cheak != 1)
		{
			System.out.println("[검색결과 없습니다.]");
		}

		// 4.전체정보 출력
		for (Student student : list)
		{
			student.showInfo();
		}

	}

}

package commom;

public class Person
{
	public String name;
	public int age;

	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	// 객체의 정보 반환 메소드
	public String getInfo()
	{
		return String.format("이름 : %s, 나이 : %d", name, age);
	}

	// 객체의 정보 출력 메소드
	public void showInfo()
	{
		System.out.println(getInfo());
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		Person comparePerson = (Person) obj;

		// 자동 호출되는지 확인
		System.out.println("오버라이딩 한 equals()메소드 호출");

		if (comparePerson.age == this.age && comparePerson.name.equals(this.name))
		{
			return true; //똑같으면 true 반환하는 것이 원칙
		} else
		{
			return false;
		}
	}
}

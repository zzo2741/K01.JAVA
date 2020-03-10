package commom;

public class Teacher extends Person
{
	String subject;

	public Teacher(String name, int age, String subject)
	{
		super(name, age); // 담당 과목
		this.subject = subject;
	}

	@Override
	public String getInfo()
	{
		return String.format("%s, 과목 : %s", super.getInfo(), subject);
	}

	@Override
	public void showInfo()
	{
		System.out.println(getInfo());
	}

}

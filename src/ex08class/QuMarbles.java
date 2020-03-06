package ex08class;

class ChildProperty
{
	// 멤버변수 : 어린이가 보유한 구슬의 갯수
	int bead_cnt;

	/*
	 * 디폴트 생성자는 개발자가 생성자를 정의하지 않았을 때만 자동으로 생성된다.
	 */
	// public ChildProperty(){}

	// 생성자메소드 : 멤버변수를 초기화 한다.
	public ChildProperty(int _bead_cnt)
	{
		bead_cnt = _bead_cnt;
	}

	public void showProperty()
	{
		System.out.println(bead_cnt);
	}

	public void obtainBead(ChildProperty cp, int _bead_cnt)
	{
		// 게임에 승리한 어린이는 해당 메소드를 호출하는 주체, 즉 해당 객체가 된다.
		this.bead_cnt += _bead_cnt;

		// 매개변수로 전달된 어린이 객체는 게임에 패배하여 구슬이 _bead_cnt만큼 차감해야함.
		cp.bead_cnt -= _bead_cnt;
	}

}

public class QuMarbles
{

	public static void main(String[] args)
	{
		ChildProperty child1 = new ChildProperty(20);
		ChildProperty child2 = new ChildProperty(15);

		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty();
		System.out.print("어린이2 : ");
		child2.showProperty();

		/* 1차게임 : 어린이1은 어린이2의 구슬 5개 획득 */
		child1.obtainBead(child2, 5);

		/* 2차게임 : 어린이2가 어린이1의 구슬 9개 획득 */
		child2.obtainBead(child1, 9);

		System.out.println("\n게임 후 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty();
		System.out.print("어린이2 : ");
		child2.showProperty();
	}

}

package ex12inheritance;

class Burger
{
	// 멤버변수
	/* 버거명, 가격, 패티, 소스, 야체을 표현 */
	private String bugerName;
	private int bugerPrice;
	private String bugerPatty;
	private String bugerSauce;
	private String bugerVegetable;

	// 인자생성자
	public Burger(String bugerName, int bugerPrice, String bugerPatty, String bugerSauce, String bugerVegetable)
	{
		this.bugerName = bugerName;
		this.bugerPrice = bugerPrice;
		this.bugerPatty = bugerPatty;
		this.bugerSauce = bugerSauce;
		this.bugerVegetable = bugerVegetable;
	}

	// getter : price만 필요
	public int getBugerPrice()
	{
		return bugerPrice;
	}

	// 햄버거 정보 출력
	/* 버거명, 가격, 식재료 출력 */
	public void showBurger()
	{
		System.out.println(bugerName);
		System.out.println("가격 : " + bugerPrice);
		System.out.println("식재료 : " + bugerPatty + ", " + bugerSauce + ", " + bugerVegetable);
	}
}

//햄버거의 기본가격 추상화 
class HamburgerPrice
{
	// 멤버변수
	/* 햄버거종류, 음료, 프렌치프라이 */
	Burger burger;
	final int COKE = 1000;
	final int POTATO = 1500;

	// 인자생성자 : 상수는 이미 초기화되어 있으므로 햄버거 객체만 초기화해주면 됌
	public HamburgerPrice(Burger burger)
	{
		this.burger = burger;
	}

	// 기본가격계산 : 햄버거의 price는 private멤버이므로 getter를 통해 가져옴
	public int basicPrice()
	{
		return burger.getBugerPrice() + COKE + POTATO;
	}

	// 햄버거와 결제금액 출력
	public void showPrice()
	{
		burger.showBurger();
		System.out.println("결제금액 : " + basicPrice());
		System.out.println("==============================");
	}
}

//세트가격을 추상화(기본가격을 상속)
class SetPrice extends HamburgerPrice
{
	final int SET_DISCOUNT = 500;

	// 인자생성자
	public SetPrice(Burger burger)
	{
		super(burger);
	}

	// 세트가격계산(오버라이딩)
	@Override
	public int basicPrice()
	{
		// 부모의 계산 결과에서 500차감.
		return super.basicPrice() - SET_DISCOUNT;
	}

	// 햄버거와 세트결제금액 출력(오버라이딩)
	@Override
	public void showPrice()
	{
		burger.showBurger();
		System.out.println("세트결제금액 : " + basicPrice());
		System.out.println("==============================");
	}
}

public class QuBuyHamburger
{

	public static void main(String[] args)
	{

		// 치즈버거 객체 생성
		Burger burger1 = new Burger("치즈버거", 2000, "쇠고기패티", "케챱", "피클");
		// 치킨버거 객체 생성
		Burger burger2 = new Burger("치킨버거", 3000, "닭고기패티", "마요네즈", "양상추");

		// 치즈버거를 기본가격으로 구매
		HamburgerPrice price1 = new HamburgerPrice(burger1);
		price1.showPrice(); // 4500원

		// 치킨버거를 세트가격으로 구매
		HamburgerPrice price2 = new SetPrice(burger2);
		price2.showPrice(); // 5000원
	}
}

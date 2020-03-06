package ex12inheritance;

class Car
{
	int gasoline;

	// 생성자
	public Car(int gasoline)
	{
		this.gasoline = gasoline;
		System.out.println("Car 생성자 호출");
	}
}

class HybridCar extends Car
{
	int electric;
	
	// 생성자
	public HybridCar(int gasoline, int electric)
	{
		super(gasoline);
		this.electric = electric;
		System.out.println("HybridCar 생성자 호출");
	}
}

class HybridWaterCar extends HybridCar
{
	int water;

	// 생성자
	public HybridWaterCar(int gasoline, int electric, int water)
	{
		// 부모클래스로 gasoline, electric를 전달하여 생성자 호출
		super(gasoline, electric);
		this.water = water;
		System.out.println("HybridWaterCar 생성자 호출");
	}

	public void showNowGauge()
	{
		System.out.println("남은가솔린:" + gasoline);
		System.out.println("남은전기량:" + electric);
		System.out.println("남은워터량:" + water);
	}
}

public class QuConstructorAndSuper
{
	public static void main(String[] args)
	{
		HybridWaterCar hcar = new HybridWaterCar(10, 20, 30);
		hcar.showNowGauge();
	}
}

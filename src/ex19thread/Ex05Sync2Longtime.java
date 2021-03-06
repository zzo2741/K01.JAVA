package ex19thread;

class Increment
{
	int num;

	// 1. 동기화 처리가 안된 메소드 : 결과 비정상
//	public void increment()
//	{
//		num++;
//	}

	// 2. 동기화 방법 1 : 동기화 메소드 => 메소드 전체를 동기화한다.
	public synchronized void increment()
	{
		num++;
	}

	// 3. 동기화 방법2 : 동기화 블럭 => 메소드 내에서 필요한 코드만 블럭으로 지정한다.
//	public void increment()
//	{
//		synchronized (this)
//		{
//			num++;
//
//		}
//	}

	
	/*
	 * - synchronized 선언으로 정확한 결과는 나왔지만 코드 실행시간이 엄청나게 증가하게 된다.
	 * - 즉, 동기화는 성능의 감소를 초래하므로 필요한 부분에 대해서만 동기화처리 하는 것이 좋다.
	 * - 동기화 메소드 보다는 동기화 블럭이 기본적으로 좋은 성능을 나타낸다.
	 */
	public int getNum()
	{
		return num;
	}

}

class IncThread extends Thread
{
	Increment inc;

	public IncThread(Increment inc)
	{
		this.inc = inc;
	}

	@Override
	public void run()
	{
		for (int i = 1; i <= 10000; i++)
		{
			for (int j = 1; j <= 10000; j++)
			{
				inc.increment();
			}
		}
	}

}

public class Ex05Sync2Longtime
{
	public static void main(String[] args)
	{
		long start = System.currentTimeMillis();

		Increment inc = new Increment();

		IncThread it1 = new IncThread(inc);
		IncThread it2 = new IncThread(inc);
		IncThread it3 = new IncThread(inc);
		it1.start();
		it2.start();
		it3.start();
		try
		{
			it1.join();
			it2.join();
			it3.join();
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("1~10000까지의 합 : " + inc.getNum());
		long end = System.currentTimeMillis();
		System.out.println("실행 시간 : " + (end - start) / 1000.0 + "초"); // 실행 시간 계산 및 출력
	}

}

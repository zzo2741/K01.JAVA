package ex19thread;

/*
 * Thread(쓰레드)
 * - 쓰레드의 생성은 Thread클래스를 상속받는 것부터 시작한다.
 * - 해당 방법은 쓰레드로 생성할 클래스가 다른 클래스를 상속받지 않아도 될 때 사용하는 방식이다.
 * - 만약 다른 클래스를 상속받아야 한다면 JAVA는 다중상속이 불가능하므로 Runnable 인터페이스를 구현하는 방법을 사용해야 한다.
 */
class ShowThread extends Thread
{
	String threadName;

	public ShowThread(String threadName)
	{
		this.threadName = threadName;
	}

	/*
	 * run()메소드는 쓰레드의 main()메소드에 해당한다. Thread클래스의 run()메소드를 오버라이딩 한것으로, 해당 메소드는 직접
	 * 호출하면 안되고, start()메소드를 통해 간접적으로 호출해야한다. 만약 직접 호출하면 단순한 실행만된뿐 쓰레드가 생성되지 않으므로
	 * 주위해야한다.
	 */
	@Override
	public void run()
	{
		for (int i = 1; i <= 100; i++)
		{
			System.out.println("안녕하세요.[ " + threadName + " ] 입니다.");
			System.out.println("Thread.NORM_PRIORITY = " + Thread.NORM_PRIORITY);
			try
			{
				/*
				 * Thread클래스의 static메소드로 실행의 흐름을 주어진 시간만큼 Block상태로 전환시켜 준다. 1000이 1초이다. 10이면
				 * 0.01초 만큼 block시킨다
				 */
				sleep(1000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

public class Ex01ThreadStart
{
	public static void main(String[] args)
	{
		ShowThread st1 = new ShowThread("쓰레드1st");
		ShowThread st2 = new ShowThread("Thread2nd");

		// 쓰레드 객체를 통한 쓰레드 생성(실행)
		st1.start();
		st2.start();

		// run()을 통한 호출은 가능하나 쓰레드가 생성되지 않는다.
		// st1.run();
		// st2.run();
	}
}

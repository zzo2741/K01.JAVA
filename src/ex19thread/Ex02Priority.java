package ex19thread;

/*
 * 쓰레드의 우선순위
 * 		setPriority(우선순위) : 쓰레드의 우선순위를 지정할 때 사용
 * 		getPriority() : 쓰레드의 우선순위를 반환할 때 사용
 */
class MessageSendingThread extends Thread
{
	String message;

	public MessageSendingThread(String message)
	{
		this.message = message;
	}

	// 생성자2 : 멤버변수와 우선순위까지 초기화
	public MessageSendingThread(String message, int pri)
	{
		this.message = message;
		setPriority(pri);
	}

	@Override
	public void run()
	{
		for (int i = 1; i <= 1000; i++)
		{
			// 쓰레드의 이름과 우선순위를 반환한다.
			System.out.println(message + i + "(" + getPriority() + ")");

			/*
			 * 기본적으로 우선순위가 높은 쓰레드가 먼저 실행되지만, sleep()메소드를 사용하게 되면 실행중 블럭상태로 전환되어 우선순위가 낮은
			 * 쓰레드도 가끔 실행될 수 있는 상황이 생기게 된다.
			 */
			try
			{
				sleep(1);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

public class Ex02Priority
{

	public static void main(String[] args)
	{
		/*
		 * 1단계 : 우선순위를 별도로 지정하지 않은 상태로 쓰레드를 생성하면 동일한 우선순위 5를 부여받게 된다.
		 * 		이 때는 CPU가 알아서 작업을 분배한다.
		 */
//		MessageSendingThread th1 = new MessageSendingThread("1번타자이준승");
//		MessageSendingThread th2 = new MessageSendingThread("2번타자이정연");
//		MessageSendingThread th3 = new MessageSendingThread("3번타자이주연");

		/*
		 * 2단계 : 우선순위 부여를 위해 Thread클래스에 static타입의 상수를 이용한돠아~
		 * ※우선순위가 높다고 무조건 먼저 실행되지 않는다. 전체적인 확률이 높아지게 되어 먼저 실행될 가능성이 높아진다고 생각하면 된다.
		 */
//		MessageSendingThread th1 = new MessageSendingThread("1번타자이준승", Thread.MAX_PRIORITY);
//		MessageSendingThread th2 = new MessageSendingThread("2번타자이정연", Thread.NORM_PRIORITY);
//		MessageSendingThread th3 = new MessageSendingThread("3번타자이주연", Thread.MIN_PRIORITY);		

		/*
		 * 3단계 : static상수 대신에 정수를 사용해도 무방하다.
		 */
		MessageSendingThread th1 = new MessageSendingThread("1번타자이준승", 10);
		MessageSendingThread th2 = new MessageSendingThread("2번타자이정연", 5);
		MessageSendingThread th3 = new MessageSendingThread("3번타자이주연", 1);

		th1.start();
		th2.start();
		th3.start();
	}

}

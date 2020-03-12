package ex19thread;

import ex19thread.Sum;

class MultiAdderThread extends Thread
{
	Sum sum;
	int start, end;

	public MultiAdderThread(Sum sum, int start, int end)
	{
		this.sum = sum;
		this.start = start;
		this.end = end;
	}

	@Override
	public void run()
	{
		for (int i = 1; i <= 50000; i++)
		{
			sum.addNum(i);
		}
	}

//	public MultiAdderThread(Sum sum)
//	{
//		this.sum = sum;
//	}
}

public class Ex05Sync1Error
{
	public static void main(String[] args)
	{
		Sum s = new Sum();
		MultiAdderThread mat1 = new MultiAdderThread(s, 1, 5000);
		MultiAdderThread mat2 = new MultiAdderThread(s, 5001, 10000);
//		MultiAdderThread mat1 = new MultiAdderThread(s);
//		MultiAdderThread mat2 = new MultiAdderThread(s);
		mat1.start();
		mat2.start();
		try
		{
			mat1.join();
			mat2.join();
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("1~10000까지의 합 : " + s.getNum());
	}
}

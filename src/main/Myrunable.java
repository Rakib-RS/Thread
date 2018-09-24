package main;

import java.util.Date;

public class Myrunable implements Runnable{
	private static final int REPETITIONS = 10;
	private static final int DELAY = 1000;
	private String greeting;
	public Myrunable(String aGreeting)
	{
		greeting = aGreeting;
	}

	@Override
	 public void run() {
		try{
			for (int i = 1; i <= REPETITIONS; i++){
				Date now = new Date();
				System.out.println(now + " " + greeting);
				Thread.sleep(DELAY);
			}
		}
		catch (InterruptedException exception)
		{
		}
		
	}
	

}

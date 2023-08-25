package com.ciq.threadcolour;

public class CountDown {
	private int i;

	public void doCountDown() {
//		String color;
//		switch (Thread.currentThread().getName()) {
//		case "Thread 1":
//			color = "hello";
//			break;
//		case "Thread 2":
//			color = ThreadColor.ANSI_PURPLE;
//			break;
//		default:
//			color = ThreadColor.ANSI_GREEN;
//		}
		synchronized (this) {
			for (i = 1; i <= 5; i++)

			{
				System.out.println(Thread.currentThread().getName() + " i=" + i);
			}
		}

	}

}

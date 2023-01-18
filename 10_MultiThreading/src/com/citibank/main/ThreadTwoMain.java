package com.citibank.main;

import com.citibank.main.domain.ThreadTwo;

public class ThreadTwoMain {

	public static void main(String[] args) {
		System.out.println(" ThreadTwoMain Start");
		ThreadTwo threadTwo = new ThreadTwo();
		
		Thread thread = new Thread(threadTwo);

		thread.start();
		
		try {
			thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" ThreadTwoMain End");

	}

}

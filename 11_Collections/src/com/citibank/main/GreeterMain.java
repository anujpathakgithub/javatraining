package com.citibank.main;

import com.citibank.main.domain.GoodMorningGreeter;
import com.citibank.main.domain.Greeter;

public class GreeterMain {

	public static void main(String[] args) {
		Greeter greeter = new GoodMorningGreeter();
		
		greeter.greet();
//      Below code is for anonymous inner class which will implement Greeter Interface 
		System.out.println("------------------------------");
		Greeter GoodEveningGreeter = new Greeter() {
			
			@Override
			public void greet() {
				System.out.println("Good evening Java - Anonmouns class use");
				
			}
		};
		
		GoodEveningGreeter.greet();
		
		System.out.println("------------------------------");
		Greeter greeter2 = () -> {
			System.out.println("This is Lamda code");
		
		};
		greeter2.greet();
		
		System.out.println("------------------------------");
		
		Greeter goodNightGreeter = () -> System.out.println("Good noght Java using Lamda");
		goodNightGreeter.greet();
		
		System.out.println("----------------------------");
		
		Runnable runnable = () -> System.out.println("We are in thread");
		Thread thread = new Thread(runnable);
		thread.start();
		
		System.out.println("-----------------------------");
		
	
		System.out.println("-----------------------------");
		new Thread(() -> System.out.println("we are in thread")).start();
		
		new Thread(()-> {
			for (int i=0;i<10;i++) {
				try {
					Thread.sleep(100);
					System.out.println("Thraed is running");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
	}

}

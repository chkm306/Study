package com.uni.part02_scheduling.run;

import com.uni.part02_scheduling.model.thread.Thread3;

public class Run {

	public static void main(String[] args) {

		Thread3 th3 = new Thread3();
		
		for(int i = 0; i <= 100; i++) {
			Thread thread = new Thread(th3); // 기본 순위 5
			
			if(i%2 == 0) {
				thread.setPriority(Thread.MAX_PRIORITY); // 우선순위 10
				thread.setName("Thread 짝수 : "+i);
			}else {
				thread.setPriority(Thread.MIN_PRIORITY); // 우선순위 1
				thread.setName("Thread 홀수 : "+i);
			}
			thread.start();
		}
	}

}

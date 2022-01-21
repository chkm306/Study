package com.uni.race.model.thread;

import com.uni.race.run.Run;

public class Star implements Runnable {

	@Override
	public void run() {

		int ran = 0;

		try {
			for (int i = 0; i < 10; i++) {
				for(int k = 0; k < 30; k++) {
				System.out.println();
				}
				// 처음 출력시
				if (i == 0) {
					System.out.println(" 준비 ");
					System.out.println("♡");
					System.out.println("★");

				} else {
					ran = (int) (Math.random() * 5) + 1;
					Run.tot2 += ran; // 값 누적시키기

					// 생성되서 누적된 수만큼 - 로 표시
					// 하트 출력
					for (int j = 0; j < Run.tot1; j++) {
						System.out.print("-");
					}
					System.out.println("♡");

					// 별 출력
					for (int j = 0; j < Run.tot2; j++) {
						System.out.print("-");
					}
					System.out.println("★");
				}

				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
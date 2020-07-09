package com.lee.mt.main;
// Thread
// 동시에 여러 작업

import javax.swing.JFrame;
import javax.swing.JTextArea;

// 자바프로그램 실행
// JVM이 Thread를 만들어서 MTMain.main(null); 보냄

// JVM이 만든 Thread : main Thread
// 개발자가 Thread를 만들어서 추가

public class MTMain {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start(); // 새로운 Thread 만들어서 run() 호출
		
		Thread t = new Thread(new MYThread2());
		t.start();
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				super.run();
				JFrame jf = new JFrame("mt");
				JTextArea jta = new JTextArea();
				jf.add(jta);
				jf.setSize(300, 300);
				jf.setVisible(true);
				
				for (int i = 0; i < 10; i++) {
					try {
						jta.append("w\r\n");
						Thread.sleep(800);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		};
		t2.start();
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("ㅋ");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		
			
		
	}
}

package com.lee.mt.main;
// Thread
// ���ÿ� ���� �۾�

import javax.swing.JFrame;
import javax.swing.JTextArea;

// �ڹ����α׷� ����
// JVM�� Thread�� ���� MTMain.main(null); ����

// JVM�� ���� Thread : main Thread
// �����ڰ� Thread�� ���� �߰�

public class MTMain {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start(); // ���ο� Thread ���� run() ȣ��
		
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
			System.out.println("��");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		
			
		
	}
}

package com.lee.mt.ss.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextArea;

//192.168.0.88

// Server
public class SSMain {
	public static void main(String[] args) {

		try {
			ServerSocket ss = new ServerSocket(7777);
			System.out.println("�����");
			Socket s = ss.accept();
			System.out.println("Ŭ���̾�Ʈ�� ������");

			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);

			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
			BufferedWriter bw = new BufferedWriter(osw);

			Scanner k = new Scanner(System.in);
			
			JFrame jf = new JFrame();
			JTextArea jta = new JTextArea();
			jf.add(jta);
			jf.setSize(300, 400);
			jf.setVisible(true);

			// �ޱ�
			new Thread() {
				public void run() {
					while (true) {
						try {
							jta.append(br.readLine()+"\r\n");
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				};
			}.start();

			// ������
			while (true) {
				System.out.println("�� :");
				String cmt = k.next();
				bw.write("�̰��� :" + cmt + "\r\n");
				bw.flush();
			}
			
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}

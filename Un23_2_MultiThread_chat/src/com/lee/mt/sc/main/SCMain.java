package com.lee.mt.sc.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextArea;

// Client
public class SCMain {
	public static void main(String[] args) {

		try {
			Socket s = new Socket("192.168.0.81", 6548);
			System.out.println("연결됨");

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

			// 받기
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

			// 보내기
			while (true) {
				System.out.println("뭐 :");
				String cmt = k.next();
				bw.write("이강산" + cmt + "\r\n");
				bw.flush();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

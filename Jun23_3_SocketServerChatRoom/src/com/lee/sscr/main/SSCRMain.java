package com.lee.sscr.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class SSCRMain {
	public static void main(String[] args) {
		
		try {
			ServerSocket ss= new ServerSocket(8888);
			
			// 소켓들
			ArrayList<Socket> sockets = new ArrayList<Socket>();
			
			while (true) {
				Socket s = ss.accept();
				sockets.add(s); // 누구한명 접속할때마다 arraylist 추가
				
				InputStream is = s.getInputStream();
				InputStreamReader isr = new InputStreamReader(is, "utf-8");
				BufferedReader br = new BufferedReader(isr);
				
				// 지금 접	속한 그 사람용 Thread
				new Thread() {
					public void run() {
						try {
							String msg = br.readLine(); // 누가보낸거 받아서
							
							// 연결된 모두에게 전송
							for (Socket socket : sockets) {
								OutputStream os = socket.getOutputStream();
								OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
								BufferedWriter bw = new BufferedWriter(osw);
								
								bw.write(msg+"\r\n");
								bw.flush();
							}
							
						} catch (IOException e) {
							
							e.printStackTrace();
						}
					};
				}.start();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

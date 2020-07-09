package com.lee.uc.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

// ���ǹ�
// �ݺ���
// �迭 -> �÷��� ���
// Ư¡ : ��ü, ���� �۾��Ѱ� �� Ȱ��
// => HTTP���

public class UCMain {
	public static void main(String[] args) {
		
		try {
			// HTTP����� �ؼ� ������ �޾ƿ��� - ������Ű� �ٸ�
			String addr = "https://www.youtube.com/?gl=KR";
			URL u = new URL(addr);
			HttpsURLConnection huc 
			= (HttpsURLConnection) u.openConnection();
			
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String line= null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}

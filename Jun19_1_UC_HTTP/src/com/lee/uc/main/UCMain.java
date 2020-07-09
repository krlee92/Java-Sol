package com.lee.uc.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

// 조건문
// 반복문
// 배열 -> 컬렉션 사용
// 특징 : 객체, 남이 작업한거 잘 활용
// => HTTP통신

public class UCMain {
	public static void main(String[] args) {
		
		try {
			// HTTP통신을 해서 데이터 받아오기 - 소켓통신과 다름
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

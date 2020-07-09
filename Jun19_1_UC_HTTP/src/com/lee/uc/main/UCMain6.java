package com.lee.uc.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;

import javax.net.ssl.HttpsURLConnection;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

// 쇼핑
//		dev.naver.com

public class UCMain6 {
	public static void main(String[] args) {

		BufferedWriter bw = null;

		try {
			String word = "의자"; // 인터넷 주소에는 한글x
			// 인터넷 주소에 맞는 형태로 바꿔서 넣어야
			word = URLEncoder.encode(word, "utf-8");
			System.out.println(word);

			String s = "https://openapi.naver.com/v1/search/shop.xml";
			s += "?query=%EC%9D%98%EC%9E%90"; // ?변수명=값 네이버에서 하라는대로
			System.out.println(s); // 최종주소
			URL u = new URL(s);
			HttpsURLConnection huc = (HttpsURLConnection) u.openConnection();

			// 요청헤더 - 키값 넣기(네이버에서 하라는대로)
			huc.addRequestProperty("X-Naver-Client-Id", "lA5FivJ5MenI3OvwU03a");
			huc.addRequestProperty("X-Naver-Client-Secret", "Tra6RYPObW");

			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);

			String line = null;
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8"); // XmlPullParser는 Inputstream만 사용가능하다.

			String tagName = null;
			int what = xpp.getEventType();

			FileWriter fw = new FileWriter("D:/JAVA/chair.csv", true);
			bw = new BufferedWriter(fw);

			while (what != XmlPullParser.END_DOCUMENT) {
				if (what == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				} else if (what == XmlPullParser.TEXT) {
					if (tagName.equals("lprice")) {
						bw.write(xpp.getText() + ",");
					} else if (tagName.equals("mallName")) {
						if (tagName.equals(null)) {
							System.out.println("없음");
						}
						bw.write(xpp.getText() + ",");
					} else if (tagName.equals("maker")) {
						if (tagName.equals(null)) {
							System.out.println("없음");
						}
						bw.write(xpp.getText() + "\r\n");
						bw.flush();
					}
				} else if (what == XmlPullParser.END_TAG) {
					tagName = "";
				}
				xpp.next();
				what = xpp.getEventType();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

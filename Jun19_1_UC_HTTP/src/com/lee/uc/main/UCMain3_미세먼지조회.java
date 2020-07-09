package com.lee.uc.main;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

// 로그인 -> 신청 -> 심사 -> 키

// 정부사이트
//		data.go.kr
//		data.seoul.go.kr
//		data.gg.go.kr
//		...
// 포털사이트 -> 개발자 센터
// SNS -> 개발자센터

// 미세먼지 조회
//		
public class UCMain3_미세먼지조회 {
	public static void main(String[] args) {

		try {
			String addr = "http://openapi.seoul.go.kr:8088/4f6a6547456b6368333355736a714f/xml/RealtimeCityAir/1/25/";
			URL u = new URL(addr);
			HttpURLConnection huc = (HttpURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();

			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8");

			String tagName = null;
			int what = xpp.getEventType(); // 현재 보고있는거
			while (what != XmlPullParser.END_DOCUMENT) { // 문서 끝에서 반복문 끝
				if (what == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				} else if (what == XmlPullParser.TEXT) {
					if (tagName.equals("MSRSTE_NM")) {
						System.out.println(xpp.getText() + ":");
					} else if (tagName.equals("PM10")) {
						System.out.println("PM10 :" + xpp.getText());
					} else if (tagName.equals("PM25")) {
						System.out.println("PM2.5 :" + xpp.getText());
						System.out.println("----------");
					}

				} else if (what == XmlPullParser.END_TAG) {
					tagName = "";
				}
				xpp.next();
				what = xpp.getEventType();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

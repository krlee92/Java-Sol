package com.lee.uc.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.net.ssl.HttpsURLConnection;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

// 쇼핑
//		dev.naver.com
public class UCMain6_Teacher {
	public static void main(String[] args) {
		try {
			String word = "의자"; // 인터넷 주소에는 한글-x
			// 인터넷 주소에 맞는 형태로 바꿔서 넣어야
			word = URLEncoder.encode(word, "utf-8");

			String s = "https://openapi.naver.com/v1/search/shop.xml";
			s += "?query=" + word; // ?변수명=값

			URL u = new URL(s);

			HttpsURLConnection huc = (HttpsURLConnection) u.openConnection();

			// 요청헤더
			huc.addRequestProperty("X-Naver-Client-Id", "1pEybNUhlNJmHH2zG_Hs");
			huc.addRequestProperty("X-Naver-Client-Secret", "nnSWMLZ7EY");

			InputStream is = huc.getInputStream();

			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8");

			String tagName = null;
			int what = xpp.getEventType();
			int a = 0;
//			boolean first = true;
			String t = null;
			while (what != XmlPullParser.END_DOCUMENT) {
				if (what == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				} else if (what == XmlPullParser.TEXT) {
					if (tagName.equals("title")) {
						if (a == 0) {
							a = 1;
//							first = false;
						} else if (a == 1){
							t = xpp.getText();
							t = t.replace("<b>", "");
							t = t.replace("</b>", "");
							System.out.println(t);
						}
					} else if (tagName.equals("lprice")) {
						System.out.println(xpp.getText());
					} else if (tagName.equals("hprice")) {
						System.out.println(xpp.getText());
						System.out.println("-----");
					}
				}
				xpp.next();
				what = xpp.getEventType();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

package com.lee.uc.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

// �α��� -> ��û -> �ɻ� -> Ű

// ���λ���Ʈ
//		data.go.kr
//		data.seoul.go.kr
//		data.gg.go.kr
//		...
// ���л���Ʈ -> ������ ����
// SNS -> �����ڼ���

// �̼����� ��ȸ
//		
public class UCMain4_�̼��������������� {
	public static void main(String[] args) {
		BufferedWriter bw = null;
		
		
		try {
			FileWriter fw = new FileWriter("D:/JAVA/air.csv",true);
			bw = new BufferedWriter(fw);
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("MM,dd,hh,a");
			String when = sdf.format(now); // �ð������� ����
			
		
			
			String addr = "http://openapi.seoul.go.kr:8088/4f6a6547456b6368333355736a714f/xml/RealtimeCityAir/1/25/";
			URL u = new URL(addr);
			HttpURLConnection huc = (HttpURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();

			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8");

			String tagName = null;
			
			int what = xpp.getEventType(); // ���� �����ִ°�
			while (what != XmlPullParser.END_DOCUMENT) { // ���� ������ �ݺ��� ��
				if (what == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				} else if (what == XmlPullParser.TEXT) {
					if (tagName.equals("MSRSTE_NM")) {
						bw.write(when);
						bw.write(xpp.getText() + ":" +",");
					} else if (tagName.equals("PM10")) {
						bw.write("PM10 :" + xpp.getText() + ",");
					} else if (tagName.equals("PM25")) {
						bw.write("PM2.5 :" + xpp.getText() + "\r\n");
						bw.flush();
					}

				} else if (what == XmlPullParser.END_TAG) {
					tagName = "";
				}
				xpp.next();
				what = xpp.getEventType();
			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

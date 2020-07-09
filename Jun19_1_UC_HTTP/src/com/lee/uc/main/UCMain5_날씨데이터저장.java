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

// 날씨 프로그램

// 컴퓨터는 전자기계
// 		전기가 흐르는 상태를 1, 안흐르는 상태를 0으로 표현
// 모든 데이터를 2진수로 바꿔서 저장 => 인코딩(encoding)
//		전 세계적으로 주력방식 : utf-8
//		한국 전용 : euc-kr
//		MS : iso-8859-1
// 2진수를 데이터로 원상복귀 => 디코딩(decoding)

public class UCMain5_날씨데이터저장 {
	public static void main(String[] args) {
		BufferedWriter bw = null;

		try {
			FileWriter fw = new FileWriter("D:/JAVA/weather.csv",true);
			bw = new BufferedWriter(fw);
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("MM,dd");
			String when = sdf.format(new Date());
			
			String addr = "http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2818585000";
			URL u = new URL(addr);
			HttpURLConnection huc = (HttpURLConnection) u.openConnection();

			InputStream is = huc.getInputStream();

			// XML(eXtended Markup Language)
			// 데이터를 HTML모양으로 표현해놓은거
			// <hour> : 시작태그
			// 맑음 : 텍스트
			// </temp> : 종료태그

			// 받아온 데이터 가공/정리 => parsing
			// 기상청 데이터 형식 : XML => XML Parsing
			// XML Parsing : 기본 JAVA에 없음
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8");

			String tagName = null;
			int what = xpp.getEventType(); // 현재 보고 있는게 뭐임?
			while (what != XmlPullParser.END_DOCUMENT) {
				if (what == XmlPullParser.START_TAG) {
					// System.out.println(xpp.getName()); //태그명만 띄우기
					tagName = xpp.getName();
				} else if (what == XmlPullParser.TEXT) {
					// System.out.println(xpp.getText()); //태그말고 알맹이 띄우기
					if (tagName.equals("hour")) {
						if (xpp.getText().equals("3")) {
							break; // 그 날자 데이터만 저장하려면 새벽3시 이전 데이터까지만 저장
						}
						bw.write(when +",");
						bw.write(xpp.getText()  +","); // 시간만 뜨는것
					}else if (tagName.equals("temp")) {
						bw.write(xpp.getText() + "" +",");
					}else if (tagName.equals("wfKor")) {
						bw.write(xpp.getText() + "\r\n");
						bw.flush();
					}

				} else if (what == XmlPullParser.END_TAG)      { // </>붙은것들
					// System.out.println(xpp.getName()); // /빼고 글자만 나옴
					// --------XML파싱 기본패턴
					tagName = "";

				}
				xpp.next();
				what = xpp.getEventType();
			}

		} catch (Exception e) {
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
package com.lee.uc.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.lee.string.cutter.StringCutter;

// 2015 ~ 어제까지의 지하철 운행 정보를 .csv로 저장하는 프로그램
// data.seoul.go.kr
// 1. 2015년 11월 1일 파싱해서 콘솔에 출력
//		날짜
//		몇호선
//		무슨역
//		타고
//		내리고
// 2. 2015년 11월 1일 파싱해서 subway.csv에 기록
//		yyyy,MM,dd,노선,역,타,내리
// 3. 2015년 11월분 파싱해서 subway.csv에 기록

// 4. 2015년 1월 1일부터 오늘까지데이터를 subway.csv에 기록

public class UCMain33 {
	public static void main(String[] args) {
		BufferedWriter bw = null;
//		Date date = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd");

		try {
			FileWriter fw = new FileWriter("D:/JAVA/subway.csv");
			bw = new BufferedWriter(fw);
			for (int y = 15; y <= 20; y++) {
				for (int m = 0; m <= 12; m++) {
						for (int d = 1; d <= 31; d++) {
							String s = "http://openapi.seoul.go.kr:8088/4f6a6547456b6368333355736a714f/json/CardSubwayStatsNew/1/600/";
							s += String.format("20%02d%02d%02d", y, m, d);

//			System.out.println(date);
//			
//			System.out.println();
////			Date now = new Date();

							URL u = new URL(s);
							HttpURLConnection huc = (HttpURLConnection) u.openConnection();

							InputStream is = huc.getInputStream();
							InputStreamReader isr = new InputStreamReader(is, "utf-8");
							BufferedReader br = new BufferedReader(isr);

							JSONParser jp = new JSONParser();
							JSONObject jo = (JSONObject) jp.parse(isr);
							JSONObject cbssn = (JSONObject) jo.get("CardSubwayStatsNew");
							
							if (cbssn != null) { // if문으로 예외사항(2월29일 등 없는날) 제어
//													cbssn = null일시, day반복 for문으로 
								System.out.println(y + "/" + m + "/" + d);

								JSONArray row = (JSONArray) cbssn.get("row");

								JSONObject station = null;

								String t = null;

//			+"" 데이터를 String으로 만듬
//			substring String데이터 부분표시

								////////////////////////////////////
//			String cuter 메소드로 데이터 안에 (,.<>같은 불순물 제거)
//			public class StringCutter {
//				public static String cut(String data) {
//					data = data.replace(",", " ");
//					data = data.replace("<b>", " ");
//					data = data.replace("</b>", " ");
//					//...
//					return data;
//				}
//			}
								///////////////////////////////////////

//			bw.write(String데이터만 들어감);

								for (int i = 0; i < row.size(); i++) {
									station = (JSONObject) row.get(i);
									t = station.get("USE_DT") + ""; // t에 날짜데이터를 저장후
									bw.write(t.substring(0, 4) + ","); // substring으로 나눠서 저장
									bw.write(t.substring(4, 6) + ",");
									bw.write(t.substring(6, 8) + ",");
									bw.write(station.get("LINE_NUM") + ",");
									bw.write(StringCutter.cut(station.get("SUB_STA_NM") + "") + ",");
									bw.write(station.get("RIDE_PASGR_NUM") + ",");
									bw.write(station.get("ALIGHT_PASGR_NUM") + "\r\n");
//				System.out.println(station.get("USE_DT"));
//				System.out.println(station.get("LINE_NUM"));
//				System.out.println(station.get("SUB_STA_NM"));
//				System.out.println(station.get("RIDE_PASGR_NUM"));
//				System.out.println(station.get("ALIGHT_PASGR_NUM"));
//				System.out.println("-------");
									bw.flush();
								}
							}

						}
				}
			}
			bw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

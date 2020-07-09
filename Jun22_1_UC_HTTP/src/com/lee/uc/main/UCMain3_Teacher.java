package com.lee.uc.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.kwon.string.cutter.StringCutter;

// 2015 ~ 어제까지의 지하철 운행 정보를 .csv로 저장하는 프로그램
// data.seoul.go.kr
// 1. 2015년 11월 1일 파싱해서 콘솔에 출력
// 2. 2015년 11월 1일 파싱해서 subway.csv에 기록
//		YYYY,MM,DD,노선,역,타,내리
// 3. 2015년 11월분 파싱해서 subway.csv에 기록
//		YYYY,MM,DD,노선,역,타,내리
public class UCMain3_Teacher {
	public static void main(String[] args) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("d:/kwon/subway.csv", true));
			for (int y = 2015; y <= 2020; y++) {
				for (int m = 1; m <= 12; m++) {
					for (int d = 1; d <= 31; d++) {
						String s = "http://openapi.seoul.go.kr:8088/4f6a6547456b6368333355736a714f/json/CardSubwayStatsNew/1/600/";
						s += String.format("%d%02d%02d", y, m, d);
						URL u = new URL(s);
						HttpURLConnection huc = (HttpURLConnection) u.openConnection();
						InputStream is = huc.getInputStream();
						InputStreamReader isr = new InputStreamReader(is, "utf-8");

						JSONObject jo = (JSONObject) new JSONParser().parse(isr);
						JSONObject cbssn = (JSONObject) jo.get("CardSubwayStatsNew");
						if (cbssn != null) {
							System.out.println(y + "/" + m + "/" + d);
							JSONArray row = (JSONArray) cbssn.get("row");
							JSONObject station = null;
							String t = null;
							for (int i = 0; i < row.size(); i++) {
								station = (JSONObject) row.get(i);
								t = station.get("USE_DT") + "";
								bw.write(t.substring(0, 4) + ",");
								bw.write(t.substring(4, 6) + ",");
								bw.write(t.substring(6, 8) + ",");
								bw.write(station.get("LINE_NUM") + ",");
								bw.write(StringCutter.cut(station.get("SUB_STA_NM") + "") + ",");
								bw.write(station.get("RIDE_PASGR_NUM") + ",");
								bw.write(station.get("ALIGHT_PASGR_NUM") + "\r\n");
								bw.flush();
							}
						}
					}
				}
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

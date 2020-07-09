package com.lee.uc.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

// XML : 데이터를 HTML모양으로 표현
// JSON :데이터를 JavaScript모양으로 표현
//					JavaScript Object Notation
//					XML보다 용량 적음
//					파싱하기 편함
// Java

// JavaScript 
public class UCMain_JSON {
	public static void main(String[] args) {
//		api.openweathermap.org/data/2.5/weather?q={seoul}&appid={baff8f3c6cbc28a4024e336599de28c4}&units=metric&lang=kr

		try {
			String s = "http://api.openweathermap.org/data/2.5/weather?q=incheon&appid=baff8f3c6cbc28a4024e336599de28c4&units=metric&lang=kr";
			URL u = new URL(s);
			HttpURLConnection huc = (HttpURLConnection) u.openConnection();

			// 다운받은 내용을 프로그램 쪽으로 가져오는 빨대들..
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			/////////////////////////////////////
			// JS에서는
			// [ : 배열
			// { : 객체
			JSONParser jp = new JSONParser();
//			JSONArray ja = jp.parse(isr); // 배열로 시작 JSONArray
//			jp.parse(br); Reader급이면 InputStreamReader,BufferedReader 아무거나 써도됨
			JSONObject jo = (JSONObject) jp.parse(isr); // 객체로 시작 JSONObject, 강제형변환
			System.out.println(jo.get("name"));
			
			JSONObject m = (JSONObject) jo.get("main"); // main은 중괄호, JS에서 중괄호는 객체
			System.out.println(m.get("temp")); // m = main{}이고 main안에있는 temp
			
			JSONArray w = (JSONArray) jo.get("weather"); //대괄호는 배열이다
			JSONObject w2 = (JSONObject) w.get(0); // 배열은 번호(각 번호는 객체)
			System.out.println(w2.get("description"));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

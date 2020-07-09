package com.lee.uc.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

// XML : �����͸� HTML������� ǥ��
// JSON :�����͸� JavaScript������� ǥ��
//					JavaScript Object Notation
//					XML���� �뷮 ����
//					�Ľ��ϱ� ����
// Java

// JavaScript 
public class UCMain_JSON {
	public static void main(String[] args) {
//		api.openweathermap.org/data/2.5/weather?q={seoul}&appid={baff8f3c6cbc28a4024e336599de28c4}&units=metric&lang=kr

		try {
			String s = "http://api.openweathermap.org/data/2.5/weather?q=incheon&appid=baff8f3c6cbc28a4024e336599de28c4&units=metric&lang=kr";
			URL u = new URL(s);
			HttpURLConnection huc = (HttpURLConnection) u.openConnection();

			// �ٿ���� ������ ���α׷� ������ �������� �����..
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			/////////////////////////////////////
			// JS������
			// [ : �迭
			// { : ��ü
			JSONParser jp = new JSONParser();
//			JSONArray ja = jp.parse(isr); // �迭�� ���� JSONArray
//			jp.parse(br); Reader���̸� InputStreamReader,BufferedReader �ƹ��ų� �ᵵ��
			JSONObject jo = (JSONObject) jp.parse(isr); // ��ü�� ���� JSONObject, ��������ȯ
			System.out.println(jo.get("name"));
			
			JSONObject m = (JSONObject) jo.get("main"); // main�� �߰�ȣ, JS���� �߰�ȣ�� ��ü
			System.out.println(m.get("temp")); // m = main{}�̰� main�ȿ��ִ� temp
			
			JSONArray w = (JSONArray) jo.get("weather"); //���ȣ�� �迭�̴�
			JSONObject w2 = (JSONObject) w.get(0); // �迭�� ��ȣ(�� ��ȣ�� ��ü)
			System.out.println(w2.get("description"));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

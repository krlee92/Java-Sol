package com.lee.uc.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

// dev.kakao.com
//80b818832ce2303ea5f03b9758428f1b

//https://dapi.kakao.com//v2/local/search/keyword.json?query=xxx&x=127&y=023867&radius=5000

// 음식점 입력하면 근처 음식점 정보 뜨게(학원 근처)
public class UCMain2 {
	public static void main(String[] args) {
		
		try {
			Scanner k = new Scanner(System.in);
			System.out.println("뭐 : ");
			String what = k.next();
			
			// 한글을 인터넷 주소에 맞는 형태로
			what = URLEncoder.encode(what, "utf-8");
			
			String s = "https://dapi.kakao.com//v2/local/search/keyword.json";
			s += "?query=" + what;
			s += "&x=127.023867&sort=distance&y=37.503325&radius=5000";
			
			URL u = new URL(s);
			HttpsURLConnection huc = (HttpsURLConnection) u.openConnection();
			huc.addRequestProperty("Authorization", "KakaoAK 80b818832ce2303ea5f03b9758428f1b");
			// 콘솔에 전체 출력
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);

			
			JSONParser jp = new JSONParser();
			JSONObject jo = (JSONObject) jp.parse(isr);
			JSONArray d = (JSONArray) jo.get("documents");
			JSONObject l = null;
//			System.out.println(d.size());
			
			for (int i = 0; i < d.size(); i++) { // jsonarray에 있는 사이즈만큼 돌리기
				l = (JSONObject) d.get(i);
				System.out.println(l.get("place_name"));
				System.out.println(l.get("road_address_name"));
				System.out.println(l.get("phone"));
				System.out.println(l.get("distance"));
				
				System.out.println("----");
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

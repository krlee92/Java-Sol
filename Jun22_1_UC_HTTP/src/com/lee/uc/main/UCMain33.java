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

// 2015 ~ ���������� ����ö ���� ������ .csv�� �����ϴ� ���α׷�
// data.seoul.go.kr
// 1. 2015�� 11�� 1�� �Ľ��ؼ� �ֿܼ� ���
//		��¥
//		��ȣ��
//		������
//		Ÿ��
//		������
// 2. 2015�� 11�� 1�� �Ľ��ؼ� subway.csv�� ���
//		yyyy,MM,dd,�뼱,��,Ÿ,����
// 3. 2015�� 11���� �Ľ��ؼ� subway.csv�� ���

// 4. 2015�� 1�� 1�Ϻ��� ���ñ��������͸� subway.csv�� ���

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
							
							if (cbssn != null) { // if������ ���ܻ���(2��29�� �� ���³�) ����
//													cbssn = null�Ͻ�, day�ݺ� for������ 
								System.out.println(y + "/" + m + "/" + d);

								JSONArray row = (JSONArray) cbssn.get("row");

								JSONObject station = null;

								String t = null;

//			+"" �����͸� String���� ����
//			substring String������ �κ�ǥ��

								////////////////////////////////////
//			String cuter �޼ҵ�� ������ �ȿ� (,.<>���� �Ҽ��� ����)
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

//			bw.write(String�����͸� ��);

								for (int i = 0; i < row.size(); i++) {
									station = (JSONObject) row.get(i);
									t = station.get("USE_DT") + ""; // t�� ��¥�����͸� ������
									bw.write(t.substring(0, 4) + ","); // substring���� ������ ����
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

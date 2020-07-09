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

// ���� ���α׷�

// ��ǻ�ʹ� ���ڱ��
// 		���Ⱑ �帣�� ���¸� 1, ���帣�� ���¸� 0���� ǥ��
// ��� �����͸� 2������ �ٲ㼭 ���� => ���ڵ�(encoding)
//		�� ���������� �ַ¹�� : utf-8
//		�ѱ� ���� : euc-kr
//		MS : iso-8859-1
// 2������ �����ͷ� ���󺹱� => ���ڵ�(decoding)

public class UCMain5_�������������� {
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
			// �����͸� HTML������� ǥ���س�����
			// <hour> : �����±�
			// ���� : �ؽ�Ʈ
			// </temp> : �����±�

			// �޾ƿ� ������ ����/���� => parsing
			// ���û ������ ���� : XML => XML Parsing
			// XML Parsing : �⺻ JAVA�� ����
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8");

			String tagName = null;
			int what = xpp.getEventType(); // ���� ���� �ִ°� ����?
			while (what != XmlPullParser.END_DOCUMENT) {
				if (what == XmlPullParser.START_TAG) {
					// System.out.println(xpp.getName()); //�±׸� ����
					tagName = xpp.getName();
				} else if (what == XmlPullParser.TEXT) {
					// System.out.println(xpp.getText()); //�±׸��� �˸��� ����
					if (tagName.equals("hour")) {
						if (xpp.getText().equals("3")) {
							break; // �� ���� �����͸� �����Ϸ��� ����3�� ���� �����ͱ����� ����
						}
						bw.write(when +",");
						bw.write(xpp.getText()  +","); // �ð��� �ߴ°�
					}else if (tagName.equals("temp")) {
						bw.write(xpp.getText() + "" +",");
					}else if (tagName.equals("wfKor")) {
						bw.write(xpp.getText() + "\r\n");
						bw.flush();
					}

				} else if (what == XmlPullParser.END_TAG)      { // </>�����͵�
					// System.out.println(xpp.getName()); // /���� ���ڸ� ����
					// --------XML�Ľ� �⺻����
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
package com.lee.uc.main;

import java.util.StringTokenizer;

public class UCMain_String庚切伸醗遂 {
	public static void main(String[] args) {
//		String : 呪舛戚 災亜管廃 庚切伸 梓端, 適掘什澗 梓端税 竺域亀
//		String s = "せせせ"; =
		String s = new String("焼 鋼舌 情薦 嗣聖闇汽推");
		
//		s.五社球誤(督虞五斗) -軒渡葵,???葵(巷獣)
		
		// 室腰属 越切幻
		System.out.println(s.charAt(2)); // 句嬢床奄亀 越切
		
		// s 恥 護越切 -> 越切 呪(int,軒渡戚 int)
		System.out.println(s.length());
		
		// 砧腰属 越切 ~ 陥叱腰仙 越切猿走 -> string
		System.out.println(s.substring(1, 5));
		
		// '推'稽 魁蟹蟹
		System.out.println(s.endsWith("推"));
		
		// '鋼舌' 戚 級嬢亜赤蟹
		System.out.println(s.contains("鋼舌"));
		System.out.println("-----------------------");
		
		// s 及拭 噺縦精 情薦 拝虞壱推 細戚奄
//		s += "噺縦精 情薦 馬惟推";
//		s = s + "噺縦精 情薦 馬惟推";
//		s = new String(s + "噺縦精 情薦 馬惟推");
//		System.out.println(s);
		
		//庚切伸 企勲 細戚奄
		StringBuffer sb = new StringBuffer();
		sb.append("せせせ");
		sb.append("ぞぞぞ");
		String ss = sb.toString();
		System.out.println(ss);
		///////////////////////////////////////
		// 庚切伸 歳軒
		String data = "畠掩疑/20/180/80"; // 是帖亜 掻推 -> 室腰属切軒 :徹
		String[] sAr = data.split("/"); //歳軒馬壱
		System.out.println(sAr[0]); //是帖葵生稽 姥歳
		System.out.println(sAr[2]); //slpit 五社球澗 是帖葵戚 掻推拝凶 紫遂
		
		String data2 = "焼 鋼舌 情薦 嗣劃艦猿推";
		StringTokenizer st = new StringTokenizer(data2, " ");
//											 (切研汽戚斗,姥歳切)
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		///////////////////////////////////////////
		// 莫縦 走舛背辞 庚切伸 幻級奄
		for (int i = 1; i < 41; i++) {
			String s4 = String.format("俳持%02d.txt", i);
			System.out.println(s4);
		} //俳持督析1~40腰猿走 伸奄..
		// bus2015.txt
		// bus2016.txt
		// bus2017.txt
		// ...
		// bus2020.txt
		
		
	}

}

package com.lee.uc.main;

import java.util.Scanner;
import java.util.StringTokenizer;

public class UCMain3_연습 {
	public static void main(String[] args) {
		// 숫자(a,b,c,d..) : 10,20,3,.....
		// 합계 출력

		Scanner k = new Scanner(System.in);
		System.out.println("숫자(a,b,c,d,...):");
		String v = k.next();

		StringTokenizer st = new StringTokenizer(v, ",");
		int hab = 0;

		while (st.hasMoreTokens()) {
			try {
				hab += Integer.parseInt(st.nextToken()/* 이자리에 숫자만들어와야함, 문자열은 터짐 */);
			} catch (Exception e) {
				
			}
		}
		System.out.println(hab);
		System.out.println("숫자만");

		// 숫자(a,b,c,d..) : 10,dd20,g3,..... 이상한거섞여도 되게
			// try catch 사용(예외 나와도 넘어가게)
	}

}

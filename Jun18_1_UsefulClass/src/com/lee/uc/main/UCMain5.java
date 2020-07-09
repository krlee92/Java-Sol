package com.lee.uc.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UCMain5 {
	public static void main(String[] args) {
		
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader("D:\\JAVA/0618.txt");
			br = new BufferedReader(fr);
			
			String line = null;
			while (( line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

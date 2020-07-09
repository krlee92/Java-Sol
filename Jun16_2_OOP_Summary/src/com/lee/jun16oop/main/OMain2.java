package com.lee.jun16oop.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.kwon.jun16oop.avengers.Hulk;

public class OMain2 {
	public static void main(String[] args) {
		// 제목이 지구인 JFrame
		JFrame p = new JFrame("지구인");
		
		
		// 텍스트가 홍길동인 JButton
		// 저 JFrame에 이 JButton을 입주
		JButton h = new JButton("홍길동");
		p.add(h);
		
		// attack() 을 반드시 -> Avengers인터페이스
		// 아이언맨(Avengers) 생성
		// 헐크 생성(ActionListener)
		Hulk i = new Hulk();
		
		// 홍길동이 헐크 전담영웅으로 찜(addActionListerner)
		h.addActionListener(i);
		// 홍길동을 위험에 처하게 : 클릭하기
		
		// JFileChjooser를 생성
		// 저 JFrame에 입주
		
		// JtextField 생성
		// 저 JFrame에 입주
//		JTextField t = new JTextField();
//		j.add(t);

		// 그 JFrame 사이즈 500,400
		p.setSize(500, 400);
		// 그 JFrame 보이게
		p.setVisible(true);
		
	}

}

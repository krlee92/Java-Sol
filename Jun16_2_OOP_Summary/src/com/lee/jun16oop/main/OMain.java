package com.lee.jun16oop.main;

import com.lee.jun16oop.human.Human;
import com.lee.jun16oop.planet.Planet;
import com.kwon.jun16oop.avengers.Ironman;

public class OMain {
	public static void main(String[] args) {
		// 이름이 지구인 별
		Planet p = new Planet("지구");
		// 이름이 홍길동인 사람
		Human h = new Human("홍길동");
		// 저 별에 이 사람을 입주 = 지구에 홍길동이 산다 = 별 has a 홍길동
		p.add(h);
		// 아이언맨
		Ironman i = new Ironman();
		// 저 사람의 전담영웅을 아이언맨으로
		h.pick(i);
		// 저 사람이 도움요청
		h.somebodyHelpMe();
		// 그 별 사이즈를 500으로
		p.setSize(500);
		// 그 별 보이게 
		p.setVisible(true);
		
		
	}

}

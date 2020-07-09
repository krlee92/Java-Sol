package com.kwon.jun16oop.avengers;

import com.kwon.jun16oop.main.Avengers;

// attack()을 반드시 구현하게 하고싶어서 -> interface를 활용
//		->abstract class는 상속라인을 막아서 잘 안씀
public class Ironman implements Avengers {
	
	@Override
	public void attack() {
		System.out.println("빔 발사");
	}
	

}

package com.kwon.jun16oop.avengers;

import com.kwon.jun16oop.main.Avengers;

// attack()�� �ݵ�� �����ϰ� �ϰ�; -> interface�� Ȱ��
//		->abstract class�� ��Ӷ����� ���Ƽ� �� �Ⱦ�
public class Ironman implements Avengers {
	
	@Override
	public void attack() {
		System.out.println("�� �߻�");
	}
	

}

package com.lee.jun16oop.main;

import com.lee.jun16oop.human.Human;
import com.lee.jun16oop.planet.Planet;
import com.kwon.jun16oop.avengers.Ironman;

public class OMain {
	public static void main(String[] args) {
		// �̸��� ������ ��
		Planet p = new Planet("����");
		// �̸��� ȫ�浿�� ���
		Human h = new Human("ȫ�浿");
		// �� ���� �� ����� ���� = ������ ȫ�浿�� ��� = �� has a ȫ�浿
		p.add(h);
		// ���̾��
		Ironman i = new Ironman();
		// �� ����� ���㿵���� ���̾������
		h.pick(i);
		// �� ����� �����û
		h.somebodyHelpMe();
		// �� �� ����� 500����
		p.setSize(500);
		// �� �� ���̰� 
		p.setVisible(true);
		
		
	}

}

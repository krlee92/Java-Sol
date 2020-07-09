 package com.lee.jun16oop.main;

import com.lee.jun16oop.avengers.Avengers;
import com.lee.jun16oop.avengers.Hulk;
import com.lee.jun16oop.avengers.Ironman;
import com.lee.jun16oop.human.Human;

public class OMain {
	public static void main(String[] args) {
		// ȫ�浿, 10���� ���
		Human h = new Human("ȫ�浿", 10);
		// �� ��� ���̸� 20��� ����
		h.setAge(20);
		// ���� �ߵƴ��� ���̸� ���
		System.out.println(h.getAge());
		//��ü���� ���
		h.showInfo();
		System.out.println("--------");
		// singleton, static x
		
		// ���̾�� is �����
		// ��ũ is �����
		// ������ ���, 40��, �����̸��� ��, ��ǻ���̸��� �ں��� ���̾��
		// �������
		// �����ϱ� :
		Ironman i = new Ironman("���", 40, "�ں�");
		i.print();
		i.attack();
		i.smoke();
		i.drive();
		
		System.out.println("--------");
		// ������ ���, 30��, ���� �̸��� �ָ�, ��������� 40�� ��ũ
		// ��ü�������
		// �����ϱ� :
		Hulk hk = new Hulk("���", 30, 40);
		hk.print();
		hk.attack();
		System.out.println("--------");
		
		// �ڹٴ� ��ü�� ����鼭 Ŭ���� ����� ����
//				Ŭ������? -> �͸�(annoymous)
//				���ο��� ������� -> inner
//				Avengers�κ��� ��ӹ���
		Avengers a = new Avengers() { //������� ����� �ƴϰ� ĸƾ�Ƹ޸�ī �����
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("���� ������");
			}
		}; 
		a.attack();
		System.out.println("--------");
//		������(polymorphism)
//			������ ����Ŭ����(�����)
//			���� ��ü�� ����Ŭ�����ɷ�
			
//		���������� ����?
//		aa : Avengers ��� �׸�
		Avengers aa = new Ironman(); // o ������ü�� ���̾��
//		t : Thor
//		Thor t = new Ironman(); // x �丣��±׸��� ���̾�� ����
//		ii : Ironman
//		Ironman ii = new Avengers(); // x ���̾�Ǳ׸��� �����(�丣,��ũ..)����
		
//		�迭
		Avengers[] ar = {i,a,hk};
		
		for (Avengers x:ar) {
			x.attack();
		}

		
	}
	

}

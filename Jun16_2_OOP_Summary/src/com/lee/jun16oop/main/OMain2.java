package com.lee.jun16oop.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.kwon.jun16oop.avengers.Hulk;

public class OMain2 {
	public static void main(String[] args) {
		// ������ ������ JFrame
		JFrame p = new JFrame("������");
		
		
		// �ؽ�Ʈ�� ȫ�浿�� JButton
		// �� JFrame�� �� JButton�� ����
		JButton h = new JButton("ȫ�浿");
		p.add(h);
		
		// attack() �� �ݵ�� -> Avengers�������̽�
		// ���̾��(Avengers) ����
		// ��ũ ����(ActionListener)
		Hulk i = new Hulk();
		
		// ȫ�浿�� ��ũ ���㿵������ ��(addActionListerner)
		h.addActionListener(i);
		// ȫ�浿�� ���迡 ó�ϰ� : Ŭ���ϱ�
		
		// JFileChjooser�� ����
		// �� JFrame�� ����
		
		// JtextField ����
		// �� JFrame�� ����
//		JTextField t = new JTextField();
//		j.add(t);

		// �� JFrame ������ 500,400
		p.setSize(500, 400);
		// �� JFrame ���̰�
		p.setVisible(true);
		
	}

}

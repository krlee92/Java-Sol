// Àå³­Áú

package com.lee.jun16oop.main;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JFrame;

public class OMain3 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		JFrame p = new JFrame("¤»");
				p.setSize(500, 400);
				p.setVisible(true);
		
		Robot r = new Robot();
		Random rr = new Random();
		while (true) {
			r.mouseMove(rr.nextInt(1000), rr.nextInt(1000));
			Thread.sleep(200);
		}
//		r.mouseMove(0,5);
//		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		r.mousePress(1024);
		
//		r.keyPress(18);
//		r.keyPress(115);
//		r.keyPress(KeyEvent.VK_ALT);
//		r.keyPress(KeyEvent.VK_F4);
//		r.keyRelease(KeyEvent.VK_ALT);
//		r.keyRelease(KeyEvent.VK_F4);

		
	}

}

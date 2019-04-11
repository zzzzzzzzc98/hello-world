package com.beancore;

import com.beancore.ui.MainFrame;

/**
 * 打飞机主体run
 * 
 * @author yangzhongying
 * @version1.0
 */

public class Main {
	public static void main(String args[]) throws InterruptedException {
		MainFrame mainFrame;
		try {
			mainFrame = new MainFrame();
			mainFrame.loadGame();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

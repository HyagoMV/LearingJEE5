package com.github.hyagomv;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class HelloListener implements ServletRequestListener {

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("Hello World Listener!");
	}

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {

	}

}

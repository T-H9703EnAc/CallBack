package com.app;

import com.app.abstracts.AbstractCallBack;
import com.app.impl.CallBackTest;
import com.app.impl.CallBackTest2;

public class Main {

	public static void main(String[] args) {
		new CallBackTest().execute();
		
		AbstractCallBack ab = new CallBackTest2();
		ab.execute();
	}

}

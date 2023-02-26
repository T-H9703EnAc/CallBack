package com.app.impl;

import com.app.abstracts.AbstractCallBack;

public class CallBackTest2 extends AbstractCallBack {
	@Override
	public void execute() {
		// パターン1のコールバック関数
		CallBack cb1 = this.getCallBackFunc1();
		// ユーザ情報設定
		User use1 = new User(0, "Tarou");
		super.executeCallBack(cb1, use1, true);
		
		// パターン2のコールバック関数
		CallBack cb2 = this.getCallBackFunc2();
		// ユーザ情報設定
		User use2 = new User(1, "Jirou");
		super.executeCallBack(cb2, use2, true);

	}

	private CallBack getCallBackFunc1() {

		CallBack cb = new CallBack() {
			public void execute(User user) {
				System.out.println("パターン1");
				System.out.println(user.getId());
				System.out.println(user.getName());

			}
		};
		return cb;
	}
	
	private CallBack getCallBackFunc2() {

		CallBack cb = new CallBack() {
			public void execute(User user) {
				System.out.println("パターン2");
				System.out.println(user.getId());
				System.out.println(user.getName());

			}
		};
		return cb;
	}


}

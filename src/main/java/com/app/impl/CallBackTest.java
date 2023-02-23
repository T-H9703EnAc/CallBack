package com.app.impl;

public class CallBackTest {
	/**
	 * コールバック用インターフェース
	 *
	 */
	interface CallBack {
		void executeCallBack(User user);
	}
	
	/**
	 * ユーザ情報
	 *
	 */
	class User {
		private int id;
		private String name;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	public void execute() {
		// コールバック関数作成
		CallBack cb = new CallBack() {
			public void executeCallBack(User user) {
				System.out.println(user.getId());
				System.out.println(user.getName());
			}
			
		};
		
		// ユーザ情報設定
		User user = new User();
		user.setId(0);
		user.setName("Tarou");
		
		// コールバック関数呼び出し
		cb.executeCallBack(user);
	}
}

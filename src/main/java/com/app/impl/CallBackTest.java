package com.app.impl;

public class CallBackTest {

	interface CallBack {
		void executeCallBack(User user);
	}

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
		
		CallBack cb = new CallBack() {

			public void executeCallBack(User user) {
				System.out.println(user.getId());
				System.out.println(user.getName());
			}
			
		};
		
		User user = new User();
		user.setId(0);
		user.setName("Tarou");
		cb.executeCallBack(user);
	}
}

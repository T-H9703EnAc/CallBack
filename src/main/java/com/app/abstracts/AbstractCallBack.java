package com.app.abstracts;

public abstract class AbstractCallBack {

	/**
	 * ユーザ情報
	 *
	 */
	protected class User {
		private int id;
		private String name;

		public User(int id, String name) {
			this.id = id;
			this.name = name;
		}

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

	protected interface CallBack {
		void execute(User user);
	}

	protected void executeCallBack(CallBack cb, User user, boolean flg) {
		if (flg) {
			cb.execute(user);
		}
	}

	public abstract void execute();
}

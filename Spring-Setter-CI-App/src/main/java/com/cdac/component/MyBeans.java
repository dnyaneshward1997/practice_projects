package com.cdac.component;

public class MyBeans {

	private int msgId;
	private String msg;

	public MyBeans(int msgId, String msg) {
	System.out.println("Parameterized constructor called");
		this.msgId = msgId;
		this.msg = msg;
	}

	public int getMsgId() {
		return msgId;
	}

	public String getMsg() {
		return msg;
	}

}

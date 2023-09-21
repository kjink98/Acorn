package com.example;

public class MessageBean {
	private String msg;
	
	// setProperty는 반드시 void, 매개변수 있어야함
	
	public String getMessage(){
		return msg;
	}
	
	public void setMessage(String msg){
		this.msg = msg;
	}
}

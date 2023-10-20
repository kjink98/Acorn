package net.netsong7.member.model;

import java.util.Date;

public class Member {
	private Long id;
	private String email;
	private String name;
	private String password;
	private Date registerDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Member(String email, String name, String password, Date registerDate) {
		this.email = email;
		this.name = name;
		this.password = password;
		this.registerDate = registerDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	
	public void changePassword(String oldPass, String newPass) {
		System.out.println(password + ", " + oldPass);
		if(!password.equals(oldPass)) {
			System.out.println("현재 비밀번호와 다릅니다.");
			return;
		}
		password = newPass;
	}
	
}

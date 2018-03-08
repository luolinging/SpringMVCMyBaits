package com.dq.bean;
/**
 * 简单的Java类  称之为POJO
 * @author Luo
 */
public class Login {
	private Long lid;
	private String lusername;
	private String lpassword;
	public Long getLid() {
		return lid;
	}
	public void setLid(Long lid) {
		this.lid = lid;
	}
	public String getLusername() {
		return lusername;
	}
	public void setLusername(String lusername) {
		this.lusername = lusername;
	}
	public String getLpassword() {
		return lpassword;
	}
	public void setLpassword(String lpassword) {
		this.lpassword = lpassword;
	}
}

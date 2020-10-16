package com.jsmall.domain;

import java.util.Date;

public class MemberVO {

	/*
	   YJS_ID         VARCHAR2(15)         PRIMARY KEY,
   YJS_NAME       VARCHAR2(60)         NOT NULL,
   YJS_PASSWORD   VARCHAR2(60)         NOT NULL,
   YJS_ZIPCODE    CHAR(7)              NOT NULL,
   YJS_EMAIL      VARCHAR2(25)         NOT NULL,
   YJS_PNUMBER    VARCHAR2(13)         NOT NULL,
   YJS_ADDR       VARCHAR2(50)         NOT NULL,
   YJS_DEADDR     VARCHAR2(50)         NOT NULL,
   YJS_NICKNAME   VARCHAR2(20)         NOT NULL,
   YJS_RECEIVE    CHAR(1)              NOT NULL,
   YJS_POINT      NUMBER               NOT NULL,
   YJS_DATESUB    DATE DEFAULT SYSDATE NOT NULL,
   YJS_UPDATEDATE DATE DEFAULT SYSDATE NOT NULL,
   YJS_LASTLOGIN  DATE DEFAULT SYSDATE NOT NULL
	*/
	
	private String yjs_id;
	private String yjs_name;
	private String yjs_password;
	private String yjs_zipcode;
	private String yjs_email;
	private String yjs_pnumber;
	private String yjs_addr;
	private String yjs_deaddr;
	private String yjs_nickname;
	private String yjs_receive;
	private String yjs_authcode;
	private int yjs_point;
	private Date yjs_datesub;
	private Date yjs_updatedate;
	private Date yjs_lastlogin;
	
	
	public String getYjs_authcode() {
		return yjs_authcode;
	}
	public void setYjs_authcode(String yjs_authcode) {
		this.yjs_authcode = yjs_authcode;
	}
	public String getYjs_email() {
		return yjs_email;
	}
	public void setYjs_email(String yjs_email) {
		this.yjs_email = yjs_email;
	}
	public String getYjs_pnumber() {
		return yjs_pnumber;
	}
	public void setYjs_pnumber(String yjs_pnumber) {
		this.yjs_pnumber = yjs_pnumber;
	}
	public String getYjs_id() {
		return yjs_id;
	}
	public void setYjs_id(String yjs_id) {
		this.yjs_id = yjs_id;
	}
	public String getYjs_name() {
		return yjs_name;
	}
	public void setYjs_name(String yjs_name) {
		this.yjs_name = yjs_name;
	}
	public String getYjs_password() {
		return yjs_password;
	}
	public void setYjs_password(String yjs_password) {
		this.yjs_password = yjs_password;
	}
	public String getYjs_zipcode() {
		return yjs_zipcode;
	}
	public void setYjs_zipcode(String yjs_zipcode) {
		this.yjs_zipcode = yjs_zipcode;
	}
	public String getYjs_addr() {
		return yjs_addr;
	}
	public void setYjs_addr(String yjs_addr) {
		this.yjs_addr = yjs_addr;
	}
	public String getYjs_deaddr() {
		return yjs_deaddr;
	}
	public void setYjs_deaddr(String yjs_deaddr) {
		this.yjs_deaddr = yjs_deaddr;
	}
	public String getYjs_nickname() {
		return yjs_nickname;
	}
	public void setYjs_nickname(String yjs_nickname) {
		this.yjs_nickname = yjs_nickname;
	}
	public String getYjs_receive() {
		return yjs_receive;
	}
	public void setYjs_receive(String yjs_receive) {
		this.yjs_receive = yjs_receive;
	}
	public int getYjs_point() {
		return yjs_point;
	}
	public void setYjs_point(int yjs_point) {
		this.yjs_point = yjs_point;
	}
	public Date getYjs_datesub() {
		return yjs_datesub;
	}
	public void setYjs_datesub(Date yjs_datesub) {
		this.yjs_datesub = yjs_datesub;
	}
	public Date getYjs_updatedate() {
		return yjs_updatedate;
	}
	public void setYjs_updatedate(Date yjs_updatedate) {
		this.yjs_updatedate = yjs_updatedate;
	}
	public Date getYjs_lsatlogin() {
		return yjs_lastlogin;
	}
	public void setYjs_lsatlogin(Date yjs_lastlogin) {
		this.yjs_lastlogin = yjs_lastlogin;
	}
	
	@Override
	public String toString() {
		return "MemberVO [yjs_id=" + yjs_id + ", yjs_name=" + yjs_name + ", yjs_password=" + yjs_password
				+ ", yjs_zipcode=" + yjs_zipcode + ", yjs_email=" + yjs_email + ", yjs_pnumber=" + yjs_pnumber
				+ ", yjs_addr=" + yjs_addr + ", yjs_deaddr=" + yjs_deaddr + ", yjs_nickname=" + yjs_nickname
				+ ", yjs_receive=" + yjs_receive + ", yjs_authcode=" + yjs_authcode + ", yjs_point=" + yjs_point
				+ ", yjs_datesub=" + yjs_datesub + ", yjs_updatedate=" + yjs_updatedate + ", yjs_lastlogin="
				+ yjs_lastlogin + "]";
	}
	
	
	
	
	
	
}

package com.mycom.d3.vo;

public class MemberVO {
	int MemberNum;
	String MemberEmail;
	String MemberPwd;
	String MemberNick;
	String MemberNaver;
	String MemberTime;
	
	
	public MemberVO(int memberNum) {
		super();
		MemberNum = memberNum;
	}
	public MemberVO(int memberNum, String memberEmail, String memberPwd, String memberNick, String memberNaver,
			String memberTime) {
		super();
		MemberNum = memberNum;
		MemberEmail = memberEmail;
		MemberPwd = memberPwd;
		MemberNick = memberNick;
		MemberNaver = memberNaver;
		MemberTime = memberTime;
	}
	public MemberVO() {
		super();
	}
	public int getMemberNum() {
		return MemberNum;
	}
	public void setMemberNum(int memberNum) {
		MemberNum = memberNum;
	}
	public String getMemberEmail() {
		return MemberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		MemberEmail = memberEmail;
	}
	public String getMemberPwd() {
		return MemberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		MemberPwd = memberPwd;
	}
	public String getMemberNick() {
		return MemberNick;
	}
	public void setMemberNick(String memberNick) {
		MemberNick = memberNick;
	}
	public String getMemberNaver() {
		return MemberNaver;
	}
	public void setMemberNaver(String memberNaver) {
		MemberNaver = memberNaver;
	}
	public String getMemberTime() {
		return MemberTime;
	}
	public void setMemberTime(String memberTime) {
		MemberTime = memberTime;
	}
	
}

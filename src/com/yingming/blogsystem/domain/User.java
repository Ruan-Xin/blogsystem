package com.yingming.blogsystem.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class User implements Serializable {
	private static final long serialVersionUID = 48L;

	private Integer userId;

	private String userAccount;

	private String userName;

	private String userPass;
	
	private String userFaceTitle;
	
	private String mail;
	
	private String blogName;
	
	private String blogDescription;
	
	private Timestamp registerTime;
	
	private Set<Message> messages = new HashSet<Message>();
	
	private Set<Journal> journals = new HashSet<Journal>();
	
	private Set<Comment> comments = new HashSet<Comment>();

	public User() {

	}

	public User(String userAccount, String userName, String userPass) {
		this.userAccount = userAccount;
		this.userPass = userPass;
		this.userName = userName;
	//	this.registerTime = registerTime;
	}

	

	public String getUserFaceTitle() {
		return userFaceTitle;
	}

	public void setUserFaceTitle(String userFaceTitle) {
		this.userFaceTitle = userFaceTitle;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getBlogName() {
		return blogName;
	}

	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}

	public String getBlogDescription() {
		return blogDescription;
	}

	public void setBlogDescription(String blogDescription) {
		this.blogDescription = blogDescription;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Timestamp registerTime) {
		this.registerTime = registerTime;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public Set<Message> getMessages() {
		return messages;
	}

	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}

	public Set<Journal> getJournals() {
		return journals;
	}

	public void setJournals(Set<Journal> journals) {
		this.journals = journals;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	
}

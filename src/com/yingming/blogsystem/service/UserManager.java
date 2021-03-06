package com.yingming.blogsystem.service;

import java.util.List;

import com.yingming.blogsystem.domain.*;

public interface UserManager {

	public static final int OP_SUCC = 1;
	public static final int OP_FAIL = -1;

	/*-------------User------------------*/
	int validLogin(String userAccount, String userPass);

	int deleteUser(int userId);

	int getUserType(int userId);
	
	int updateUser(User user);
	
	int addUser(User user);
	
	User getUserByUserId(int userId);

	User getUserByAccountAndPass(String userAccount, String userPass);

	List<User> getUserList(int offset,int pageSize);
	
}

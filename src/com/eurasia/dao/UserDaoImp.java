package com.eurasia.dao;

import com.eurasia.bean.UserBean;

public class UserDaoImp implements UserDao{

	@Override
	public boolean isadd(UserBean ubean) {
		// TODO Auto-generated method stub
		System.out.println("判断是否添加用户");
		return false;
	}

	@Override
	public boolean addUser(UserBean ubean) {
		// TODO Auto-generated method stub
		System.out.println("添加成功");
		return true;
	}

}

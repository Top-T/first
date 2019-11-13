package com.eurasia.service;

import com.eurasia.bean.UserBean;
import com.eurasia.dao.UserDao;
import com.eurasia.dao.UserDaoImp;

public class UserServiceImpl implements UserService{
      UserDao udao=new UserDaoImp();
	@Override
	public boolean addUser(UserBean ubean) {
		// TODO Auto-generated method stub
		boolean flog=false;
	boolean b=	udao.isadd(ubean);
	if(!b){
		flog=udao.addUser(ubean);
	}
		return flog;
	}

}

package com.eurasia.dao;

import com.eurasia.bean.UserBean;

public class UserDaoImp implements UserDao{

	@Override
	public boolean isadd(UserBean ubean) {
		// TODO Auto-generated method stub
		System.out.println("�ж��Ƿ�����û�");
		return false;
	}

	@Override
	public boolean addUser(UserBean ubean) {
		// TODO Auto-generated method stub
		System.out.println("��ӳɹ�");
		return true;
	}

}

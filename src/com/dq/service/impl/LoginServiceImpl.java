package com.dq.service.impl;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dq.bean.Login;
import com.dq.dao.LoginDao;
import com.dq.service.LoginService;


@Service("loginService")//loginService是Controller 类中自动写入  LoginService接口 的对象名
public class LoginServiceImpl implements LoginService {
	/**
	 * DAO层
	 * @Autowired  自动写入了DAO层   LoginDao也是一个接口
	 */
	@Autowired
	private LoginDao loginDao;
	
	/**
	 * 重写了  LoginService  接口中的   getLogin() 方法，返回一个Dao层的方法
	 */
	@Override
	public ArrayList<Login> getLogin() throws Exception {
		// TODO Auto-generated method stub
		return loginDao.getLogin();
	}

}

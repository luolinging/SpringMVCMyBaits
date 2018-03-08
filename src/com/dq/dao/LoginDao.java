package com.dq.dao;

import java.util.ArrayList;

import com.dq.bean.Login;
/**
 * LoginDao 也是一个接口   需要一个   getLogin()  方法  查询所有值   供LoginServiceImpl.java使用
 * @author Luo
 *
 */
public interface LoginDao {

	public ArrayList<Login> getLogin();
}

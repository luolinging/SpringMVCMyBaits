package com.dq.service;

import java.util.ArrayList;
import com.dq.bean.Login;
/**
 * Service是MVC中的M层，处理业务逻辑，这个接口中有一个查询方法：getLogin(),查询Login.java中的对象，
 * @author Luo
 *
 */
public interface LoginService {
	/**
	 *由于这个Service是一个接口，所以需要有一个实现它的类：LoginServiceImpl.java  来完成sql语句
	 * 查询Login.java中的对象,获取一组信息（list）
	 * @author DQ
	 * @return 用户列表
	 */
	public ArrayList<Login> getLogin() throws Exception;
}

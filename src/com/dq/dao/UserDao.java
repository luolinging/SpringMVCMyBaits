package com.dq.dao;

import java.util.List;
import com.dq.bean.User;
/**
 * 接口
 * @author Luo
 *
 */
public interface UserDao {
	 /**
	  *  取得所有用户
	  *  @author DQ
	  *  @return 用户列表
	  */
	 public List<User> getUser(); 
	 /**
	  *  根据用户账号信息取得用户
	  *  @author DQ
	  *  @return
	  */
	 public User getUser(User user);
	 
	 /**
	  *  添加用户
	  *  @author DQ
	  *  @param user
	  *  @return
	  */
	 public void insertUser(User user);
	 /**
	  *  更新用户信息
	  *  @author DQ
	  *  @param user
	  *  @return
	  */
	 public int updateUser(User user);
	 /**
	  *  删除用户
	  *  @author DQ
	  *  @param id
	  *  @return
	  */
	 public int deleteUser(Long id);
}

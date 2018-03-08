package com.dq.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dq.bean.User;
import com.dq.service.UserService;


@Controller
public class UserController {

	//直接通过spring调用其他的类，不用new()
	@Autowired
	private UserService userService;

	/**
	 * 注解式SpringMVC
	 * @param request
	 * @param user
	 * @return
	 * @RequestMapping  起一个 ".do" 前面的名字
	 */
	
	@RequestMapping(value = "regist", method = RequestMethod.POST)
	public ModelAndView regist(HttpServletRequest request, User user) {
		try {
			userService.saveUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("username", user.getUsername());
		request.setAttribute("password", user.getPassword());
		System.out.println(user.toString());
		return new ModelAndView("succ");//返回一个页面显示给用户
	}

	/***
	 * 用户登陆
	 * <p>
	 * 注解配置，只允许POST提交到该方法
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView login(String username, String password) {
		// 验证传递过来的参数是否正确，否则返回到登陆页面。
		if (this.checkParams(new String[] { username, password })) {
			// 指定要返回的页面为succ.jsp
			ModelAndView mav = new ModelAndView("succ");
			// 将参数返回给页面
			mav.addObject("username", username);
			mav.addObject("password", password);
			System.out
					.println("username=" + username + " password=" + password);
			return mav;
		}
		return new ModelAndView("home");
	}

	
	/***
	 * 查询所有用户
	 * <p>
	 * 注解配置
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping("list")
	public ModelAndView queryUser() {
		try
		{
			// 通过试图控制器  进行页面跳转
			ModelAndView mav = new ModelAndView("listUser");
			List<User> lu= userService.getUsers();
			// 将参数返回给页面
			mav.addObject("lu", lu);
			return mav;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	/***
	 * 验证参数是否为空
	 * 
	 * @param params
	 * @return
	 */
	private boolean checkParams(String[] params) {
		for (String param : params) {
			if (param == "" || param == null || param.isEmpty()) {
				return false;
			}
		}
		return true;
	}
}
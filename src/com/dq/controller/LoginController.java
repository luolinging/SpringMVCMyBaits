package com.dq.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.dq.bean.Login;
import com.dq.service.LoginService;

/**
 * @Controller  表示注解的方式，由spring来提供
 * @Autowired  表示自动写入，相当原先的为了用到一个类而引入的new()一个实例，也省略了get()、set()方法
 * @author Luo
 *
 */
@Controller
public class LoginController {

	
	@Autowired
	private LoginService loginService;
	/***
	 * 查询所有用户
	 * <p>
	 * 注解配置
	 * 由于其他的controller中已经有login这个名字，所以为了区别其他controller中的login，这里多加了一个包：login
	 * login()这个方法名可以随便起，只要不与当前类中的其他方法名不冲突即可
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping(value="login/login",method = RequestMethod.GET)//设置的 “.do” 前面的名称
	public ModelAndView login() {
		try
		{
			// ModelAndView  是一个模型视图器      通过试图控制器  进行页面跳转    
			ModelAndView mav = new ModelAndView("login/listlogin");
			//调用LoginService中的getLogin()来获取一组信息,此处用ArrayList<>来存值，用List<>也可以
			ArrayList<Login> listlogin= loginService.getLogin();
			// 将参数返回给页面
			mav.addObject("llogin", listlogin);//一组键值对：(name,value)
			return mav;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
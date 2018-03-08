package com.dq.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.Binder;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

/***********************
 * Author ：杜泉
 * Day ：2017年4月13日
 * Time ：下午18:48:04
 * Functions:    
 **********************/
public class DateConverter implements WebBindingInitializer {
	@Override
	public void initBinder(WebDataBinder binder, WebRequest arg1) {
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, false));
	}

}

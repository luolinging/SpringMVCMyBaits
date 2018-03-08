<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询全部login用户</title>
</head>
<body>
	<table>
		<!--  "items" 的值  和ModelAndView 的addObject()方法中的   键值对的   name一样  ，通过name来获取value-->
		<c:forEach   items="${llogin}"  var="login">
			<tr>
				<td>
					${login.lid}
				</td>
				<td>
					${login.lusername}
				</td>
				<td>
					${login.lpassword}
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
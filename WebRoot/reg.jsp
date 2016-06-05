<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html lang=zh-cn>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/font-awesome.css">

	<link href="<%=basePath %>css/main.css" rel="stylesheet" type="text/css" />
	<link rel="shortcut icon" href="<%=basePath%> images/login.png">
<link rel="stylesheet" href="<%=basePath%>css/bootstrap.css">
  
  </head>
  <body>
    <header>
       <div class="logo"><i class="fa fa-ul fa-cutlery"></i> Resource</div>	    
    </header>  
    <main class="bg">
    
	    <s:form action="user/user_reg" method="post" cssClass="login">
	      <h3>请您注册</h3>
	      <div class="form-group">
              <div class="input-group">
                <span class="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="text" name="user.username" class="form-control" placeholder="请输入用户名">
              </div>
              <s:fielderror fieldName="user.username" cssClass="fielderror"/>
               <div class="input-group">
                <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                <input type="password" name="user.password" class="form-control" placeholder="请输入密码">
              </div>
              <s:fielderror fieldName="user.password" cssClass="fielderror"/>
             
          </div>
	      <button type="submit" class="btn btn-success btn-login">注册 </button>
	    </s:form>
    </main>
  </body>
</html>

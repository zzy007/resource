<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>资源网</title>

<style type="text/css">
.上传须知 {
	color: #F00;
}

body {
	background-color: #F0F0F0;
}
</style>
</head>

<body>
<img src="img/biaoti.jpg" width="1537" height="304" />
<marquee>
<p class="滚动">欢迎您来到资源管理网站</p>
</marquee>
    
                        <span class="滚动">
                        <div class="header">
<div class="wrapper">
<div class="toploginleft" id="toplogin">
            <span>登录名：</span><input id="txtusername" type="text" value="" />
            <span>密码：</span><input id="txtuserpwd" type="password" value="" /><input type="button" class="login" onclick="indexuserlogin();" value="登录" />
        <a href="/reg.html" target="_blank">注册</a><span>|</span> <a href="/reg.html" target="_blank">忘记密码</a></div>
</div>
  <div align="center">
  <p>
    <label for="资源名称"></label>
    <label for="浏览"></label>
       <h4> 
       <a href="shan.jsp">删除资源</a>&nbsp; &nbsp; 
       <a href="xiu.jsp">修改资源</a>&nbsp; &nbsp; 
  <div align="center">

  <body>
    <header>
       <div class="account">
         <c:choose>
	       <c:when test="${user.name ==null}">
	         <a href="reg.jsp">注册</a>
	         <a href="login.jsp">登录</a>
	       </c:when>
	       <c:otherwise>
	         <c:out value="${user.name}"></c:out>, 欢迎您!
	       </c:otherwise>
	     </c:choose>
		    
       </div>
       <div class="logo"></div>
		    
    </header>
    
    <main>
	    <s:form action="log/log_queryLogs" method="post">
	      
	      <div>
	         <s:submit value="查 询" cssClass="search-go"></s:submit>
	         <input class="search" type="text" name="keyWords" placeholder="请输入关键词">
	      </div>
	
	      <table>
	        <tr>  
	          <th>序号</th>  
	          <th>文件名称</th>
	          <th>用户名称</th> 
	          <th>日期</th>  
	          <th>删除</th>
	        </tr> 
	        <c:forEach var="log" items="${logList}" varStatus="status">
	          <tr>
	            <td><c:out value="${status.index+1}"></c:out></td>
	            <td><c:out value="${log.logName}"></c:out></td>
	            <td><c:out value="${log.userName}"></c:out></td>
	            <td><c:out value="${log.logDate}"></c:out></td>
	            <td><a href="log/log_deleteLog?log.logName=${log.logName}">删除</a></td>
	            <td><a href="log/log_deleteLog?log.logName=${log.logName}">删除</a></td>
	          </tr>
	        </c:forEach>
	      </table>
	    </s:form>
	</main>
  </body>
</html>
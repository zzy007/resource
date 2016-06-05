<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>显示所有Resource</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/font-awesome.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/main.css">
	<link rel="shortcut icon" href="<%=basePath%>images/logo.png">
	<link rel=“stylesheet” href=“<%=basePath%>css/bootstrap.css”>
	
  </head>
  
   <body>
     <header>
     <div class="logo"></i>  Resource</div>
       <div class="account">
         <c:choose>
		       <c:when test="${user.username ==null}">
		         <a href="reg.jsp">注册</a>
		         <a href="login.jsp">登录</a>
		       </c:when>
		       <c:otherwise>
		         <c:out value="${user.username}"></c:out>, 欢迎您!
		       </c:otherwise>
		    </c:choose>
       </div>
       
    </header>
    <main>
	    <s:form action="res/res_queryRess" method="post">
	     
			<div>
	         <input class="search" type="text" name="keyWords" placeholder="请输入关键词">
	         <button class="btn btn-info btn-sm" type="submit">搜  索</button>
	         
	      </div>
 
	      
	    </s:form>
   <ul>
   <s:if test="#session.user.username =='admin'">
	        <li>		        
		            <div class="add"><a href="add.jsp"><i class="fa fa-plus"></i> 添加资源</a></div>
		              <p>点击上面的链接可以添加一种资源</p>		        
	        </li>
   <s:iterator value="resList" status="status">
	          <li>
	             <img src="<%=basePath%>upload/<s:property value='filepath'/>">
	             <p>
	                <a href="res/res_showDetail?res.resName=<s:property value='resName'/>">
	                  <s:property value="resname"/>
	                </a>
	                <span class="keyword"> &yen;<s:property value="keyword"/></span>
	                <a href="res/res_showEdit?res.resName=<s:property value='resName'/>">
	                  <i class="fa fa-pencil"></i> 
	                </a>
   &nbsp;&nbsp;<a href="res/res_deleteRes?res.resName=<s:property 
	                  value='resName'/>">
	                  <i class="fa fa-trash"></i> 
	                </a>
	             </p>
	          </li>
	        </s:iterator>
	        </s:if>
	        <s:else>
	          <s:iterator value="resList" status="status">
	          <li>
	             <img src="<%=basePath%>upload/<s:property value='filepath'/>">
	             <p>
	                <a href="res/res_showDetail?res.resid=<s:property value='resid'/>">
	                  <s:property value="resname"/>
	                </a>
	               
	             </p>
	          </li>
	        </s:iterator>
	        </s:else>
	      </ul></main>
  </body>
</html>
   


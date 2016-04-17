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
    
    <title>显示所有Like</title>
    
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
		       <c:when test="${customer.name ==null}">
		         <a href="reg.jsp">注册</a>
		         <a href="login.jsp">登录</a>
		       </c:when>
		       <c:otherwise>
		         <c:out value="${customer.name}"></c:out>, 欢迎您!
		       </c:otherwise>
		    </c:choose>
       </div>
       
    </header>
    <main>
	    <s:form action="resource/resource_queryResources" method="post">
	      
			<div>
	         <input class="search" type="text" name="keyWords" placeholder="请输入关键词">
	         <button class="btn btn-info btn-sm" type="submit">搜  索</button>
	         
	      </div>
 
	      
	    </s:form>
   <ul>
   <s:if test="#session.customer.name =='admin'">
	        <li>		        
		            <div class="add"><a href="add.jsp"><i class="fa fa-plus"></i> 添加资源</a></div>
		              <p>点击上面的链接可以添加一种资源</p>		        
	        </li>
   <s:iterator value="resourceList" status="status">
	          <li>
	             <img src="<%=basePath%>upload/<s:property value='filepath'/>">
	             <p>
	                <a href="resource/resource_showDetail?resource.resourceid=<s:property value='resourceid'/>">
	                  <s:property value="resourcename"/>
	                </a>
	                <span class="keyword"> &yen;<s:property value="keyword"/></span>
	                <a href="resource/resource_showEdit?resource.resourceid=<s:property value='resourceid'/>">
	                  <i class="fa fa-pencil"></i> 
	                </a>
   &nbsp;&nbsp;<a href="resource/resource_deleteResource?resource.resourceid=<s:property 
	                  value='resourceid'/>">
	                  <i class="fa fa-trash"></i> 
	                </a>
	             </p>
	          </li>
	        </s:iterator>
	        </s:if>
	        <s:else>
	          <s:iterator value="resourceList" status="status">
	          <li>
	             <img src="<%=basePath%>upload/<s:property value='filepath'/>">
	             <p>
	                <a href="resource/resource_showDetail?resource.resourceid=<s:property value='resourceid'/>">
	                  <s:property value="resourcename"/>
	                </a>
	               
	             </p>
	          </li>
	        </s:iterator>
	        </s:else>
	      </ul></main>
  </body>
</html>
   


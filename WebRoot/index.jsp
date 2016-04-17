<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="Refresh" content="1;url=resource/resource_showResource">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/font-awesome.css">
	
<link href="<%=basePath %>css/main.css" rel="stylesheet" type="text/css" />
<link rel=“stylesheet” href=“<%=basePath%>css/bootstrap.css”>

  </head>
  
  <main>
  <table>
  <s:form action ="resource/resource_addResource" method ="post">
  	<s:textfield name = "resource.resourcename" label = "资源名称">资源名称</s:textfield>
  	<s:textfield name = "resource.keyword" label = "关键字">关键字</s:textfield>
  	<s:textfield name = "resource.description" label = "描述">描述</s:textfield>
  	<s:textfield name = "resource.username" label = "用户">用户</s:textfield>
  	<s:submit value = "提交资源"></s:submit>
  </s:form>
  </table>
 </main>
</html>

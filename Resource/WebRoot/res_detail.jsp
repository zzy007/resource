<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>显示Resource详情</title>
    <meta charset="utf-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/font-awesome.css">

<link href="<%=basePath %>css/main.css" rel="stylesheet" type="text/css" />

  </head>
  
  <body>
     <p>资源名称：<s:property value="res.resname"></s:property></p>
     <p>关键字：<s:property value="res.keyword"></s:property></p>
     <p>描述：<s:property value="res.description"></s:property></p>
     <p>用户：<s:property value="res.user.username"></s:property></p>
    
  </body>
</html>

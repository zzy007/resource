<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
    
    <title>显示resource详情</title>
    <meta charset="utf-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/font-awesome.css">

	<link/>
  </head>
  
  <body>
     <s:form action="resource/resource_editResource">
       <h1>编辑资源</h1>
       <s:hidden name="resource.resourceid"></s:hidden>
       <s:textfield name="resource.resourcename" label="资源名称"></s:textfield>
       <s:textfield name="resource.resourcename" label="资源关键词"></s:textfield>
       <s:textfield name="resource.description" label="资源描述"></s:textfield>
       
       <s:submit value="提交"></s:submit>
     </s:form>
  </body>
</html>

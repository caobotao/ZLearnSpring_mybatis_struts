<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
  </head>
  
  <body>
    <table border="1">
    	<tr>
    		<th>ID</th>
    		<th>姓名</th>
    		<th>密码</th>
    	</tr>
    	<s:iterator value="list" id="user">
    		<tr>
    			<td><s:property value="#user.id"/></td>
    			<td><s:property value="#user.name"/></td>
    			<td><s:property value="#user.pwd"/></td>
    		</tr>
    	</s:iterator>
    </table>
  </body>
</html>

<%@ page language="java" import="java.util.*,wqh.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>查询结果</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <body>
   <table width="300" border="1" align="left" height="60">
  <tr>
    <td colspan="2"  align="left" style="width: 704px; "><strong>图书列表</strong></td>
  </tr>

  <tr>
    <td width="100" height="34">Item</td>
    <td width="200"><%=request.getAttribute("authorid")%></td>
  </tr>
</table>
 <p><a href="index.jsp">返回首页</a></p>
  </body>
</html>
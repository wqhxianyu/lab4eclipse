<%@ page language="java" import="java.util.*,wqh.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>图书详情</title>
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
<table width="706" border="1" align="center">
  <tr>
     <td align="left" >图书详细信息页面</td>
   </tr>
   <tr>
     <td width="180" colspan="1" align="center" >ISBN(PK)</td>
     <td><%=request.getAttribute("isbn") %></td>
     <td width="180" colspan="1" align="center" >Title</td>
     <td><%=request.getAttribute("title")%></td>
   </tr>
   <tr>
     <td width="131" colspan="1" align="center" >AuthorID(FK)</td>
     <td><%=request.getAttribute("authorid") %></td>
     <td width="122" colspan="1" align="center" >Publisher</td>
     <td><%=request.getAttribute("publisher") %></td>
   </tr>
   <tr>
     <td width="85" colspan="1" align="center" >PublishDate</td>
     <td><%=request.getAttribute("publishdate")%></td>
     <td width="65" colspan="1" align="center" >Price</td>
     <td><%=request.getAttribute("price") %></td>
  </tr>
   </table>
 <p><a href="index.jsp">返回首页</a></p>
  </body>
</html>
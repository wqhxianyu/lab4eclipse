<%@ page language="java" import="java.util.*,wqh.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>查询显示</title>
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
  <table width="706" border="1" align="left">
  <tr>
     <td colspan="6" align="left" >图书列表</td>
   </tr>
  </table>
    <table width="706" border="1" align="left">
   <tr>
     <td width="180" colspan="1" align="left" >书名</td>
      <td width="180" colspan="12" align="left" >操作</td>
   </tr>
    <%
    	List list=(List)request.getAttribute("list");
    	Iterator iter=list.iterator();
    	while(iter.hasNext()){
    		Book book=(Book)iter.next();
    	%>
    	<tr>
		<td align="left"> <form  name="form" method='post' action='Showbook'> 
		<input type="hidden" name="title" value=<%=book.getTitle()%>>
		<input type="submit" name="action" value=<%=book.getTitle()%> ></form></td>
		<td align="right" style="width: 477px; "> <form  name="form" method='post' action='Deletebook'> 
		<input type="hidden" name="title" value=<%=book.getTitle()%>>
		<input type="submit" name="action" value="删除" ></form></td>
		</tr>
    	<% 
    	} 
    	%>
    </table>
 	<p><a href="index.jsp">返回首页</a></p>
  </body>
</html>
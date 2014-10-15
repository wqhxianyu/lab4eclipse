<%@ page language="java" import="java.util.*,wqh.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
  <table width="300" border="0" align="left" height="75" style="height: 138px; width: 300px; ">
  <tr>
    <td align="center" >图书查询界面</td>
    </tr>
    <tr>
      <td align="left" width="500" style="width: 1207px; "> 
      <form  name="form" method="post" action="Querybook" style="height: 60px; width: 818px; "> 
                              请输入作者姓名：
      	<input type="text" name="name" style="width: 589px; ">
      	<input type="submit"  value="确定" style="width: 65px; ">
      	</form>
      	</td>
    </tr>
    </table>
    </body>
</html>
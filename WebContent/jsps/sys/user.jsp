<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <% String path=request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">

li{ list-style:none}

</style>
</head>
<body>
<center>
<form action="<%=path %>/UserCon" method="post">
<ul>
<li>用户名:<input type="text" name="username"/></li>
<li>密码:<input type="password" name="userpwd"/> </li>
<li><input type="submit" value="提交"/> <input type="reset" value="重置"/></li>

</ul>
</form>

</center>
</body>
</html>
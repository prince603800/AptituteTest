<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "demo.Database"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <jsp:useBean id="u" class = "demo.Bean" ></jsp:useBean>
<jsp:getProperty property="*" name="u"/> --%>

<%
String email = request.getParameter("email");
String password = request.getParameter("password");
int i = Database.login(email,password);
if(i>0){
	response.sendRedirect("login-success.html");
}
else{
	//response.sendRedirect("login.html");
}
%>
</body>
</html>
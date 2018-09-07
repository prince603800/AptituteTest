<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import= "demo.Database"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id = "u" class = "demo.Bean"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
int i = Database.save(u);
if(i>0){
	response.sendRedirect("registration-success.jsp");
}
else{
	response.sendRedirect("registration1.html");
}
%>
</body>
</html>
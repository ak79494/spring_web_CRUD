<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Edit Successful</h1>  
<form action="/SpringWebMavenCrud-Operation/sav">
<input typ="hidden" placeholder="Enter your id" name="id" value="${edit1.getId() }">
<input type="text" placeholder="Enter Your name" name="name", value="${edit1.getName() }">
<input type="text" placeholder="Enter Your age" name="age", value="${edit1.getAge() }">
<input type="text" placeholder="Enter Your salary" name="salary", value="${edit1.getSalary() }">

<input type="text" placeholder="Enter your Address " name="Address", value="${edit1.getAddress() }">
<button id="button"type="submit">Sign Up</button>


</form>
</body>
</html>
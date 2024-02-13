<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>
#colours{
color: blue;
}
#button{
width: 150px;
            padding: 10px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 3px;
            cursor: pointer;
}

</style>
<h1 id="colours">Add New Employee</h1>
<form action="registration">
<tr><td>Name: </td><td><input type="text"name="name" placeholder="name"></td></tr><br>
<tr><td>Age: </td><td><input type="text"name="age" placeholder="age"></td></tr><br>
<tr><td>Salary: </td><td><input type="text"name="salary" placeholder="salary"></td></tr><br>
<tr><td>Address: </td><td><input type="Address"name="Address" placeholder="Address"></td></tr><br>
<button id="button"type="submit">Login</button>


</form>
</body>
</html>
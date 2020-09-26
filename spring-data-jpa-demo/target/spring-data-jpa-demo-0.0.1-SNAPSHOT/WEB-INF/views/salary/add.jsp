<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <head>
        <title>Add Player</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css">
    </head>
    <title>Add New Salary</title>
</head>
<body>
<h1>Add Basic Salary</h1>

<form:form action="${pageContext.request.contextPath }/salary/add"
           modelAttribute="salary">
    </div>  <div class="row">
    <div class="col-sm-4 form-group">
        <label for="basicSalary"> Add Basic Amount: </label>
        <form:input id="basicSalary" class="form-control" path="basicSalary"/>
    </div>

</div>


    <input type="submit" name="submit" value="Add Basic Salary">
</form:form>

</body>
</html>
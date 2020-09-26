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
    <title>Add New Course</title>
</head>
<body>
<h1>Add New Bank Balance</h1>

<form:form action="${pageContext.request.contextPath }/bank/add"
           modelAttribute="bankAccount">
    </div>  <div class="row">
    <div class="col-sm-4 form-group">
        <label for="currentBalance"> Add Balance Amount: </label>
        <form:input id="currentBalance" class="form-control" path="currentBalance"/>
    </div>

</div>
    <div class="row">
        <div class="col-sm-4 form-group">
            <label for="accName"> accName: </label>


            <form:select path="accName">
            <form:option value="Saving" label="Saving"/>
            <form:option value="current" label="current"/>
        </form:select>
            <br><br>
        </div>

    </div>

    <input type="submit" name="submit" value="Add Course">
</form:form>

</body>
</html>
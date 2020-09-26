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
    <title>Add New Employee</title>
</head>
<body>

<h1>Add New Employee</h1>
<form:form action="${pageContext.request.contextPath }/emp/add"
           modelAttribute="employeInfo">



    <div class="row">
        <div class="col-sm-4 form-group">
            <label for="name">Name: </label>
            <form:input id="name" class="form-control" path="name"/>
        </div>
    </div>
    <div class="row">
            <div class="col-sm-4 form-group">
                <label for="address">address: </label>
                <form:input id="address" class="form-control" path="address"/>
            </div>

    </div>

    <div class="row">
        <div class="col-sm-4 form-group">
            <label for="mobile">mobile: </label>
            <form:input id="mobile" class="form-control" path="mobile"/>
        </div>

    </div>
    <div class="row">
        <div class="col-sm-4 form-group">
            <label for="bankAccountNo">bankAccountNo: </label>
            <form:input id="bankAccountNo" class="form-control" path="bankAccountNo"/>
        </div>

<%--    </div>  <div class="row">--%>
<%--        <div class="col-sm-4 form-group">--%>
<%--            <label for="rank">Rank: </label>--%>
<%--            <form:input id="rank" class="form-control" path="rank"/>--%>
<%--        </div>--%>

<%--    </div>--%>

</div>  <div class="row">
    <div class="col-sm-4 form-group">
        <label for="rank"> Rank: </label>
        <form:select path="rank">
            <form:option value="1" label="Grade one"/>
            <form:option value="2" label="Grade Two"/>
            <form:option value="3" label="Grade Three"/>
            <form:option value="4" label="Grade Four"/>
            <form:option value="5" label="Grade Five"/>
            <form:option value="6" label="Grade Six"/>

        </form:select>

    </div>
</div>

    <div class="col-sm-4 form-group">
        <label for="basicSalary"> Add Basic Amount: </label>
        <form:input id="basicSalary" class="form-control" path="basicSalary"/>
    </div>

    <input type="submit" name="submit" value="Add employee">
</form:form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Employee  List</title>
</head>
<body>

<h1> Employee Info</h1>
<table>
    <tr>

        <th> Name</th>
        <th> Address</th>
        <th> Moblie</th>
        <th> Bank Account No</th>
        <th> Rank</th>
        <th> Total Salary</th>
        <th>Basic  Salary</th>
        <th>All Empoly  Salary</th>
<%--        <th> Name</th>--%>
    </tr>
    <c:forEach items="${employewList }" var="employee">
        <tr>
<%--            <th>${ employee.empId }</th>--%>
            <th>${ employee.name }</th>
            <th>${ employee.address }</th>
            <th>${ employee.mobile }</th>
            <th>${ employee.bankAccountNo }</th>
            <th>${ employee.rank }</th>
            <th>${ employee.totalSalary }</th>
            <th>${ employee.basicSalary }</th>
            <th>${ employee.allEmployeeTotalSalary }</th>
        </tr>
    </c:forEach>
</table>
<h1> Company bank Status</h1>
<table>
    <tr>
        <th> Total paid salary</th>
        <th> Remaining Balance</th>

    </tr>
    <c:forEach items="${employewList }" var="company">
        <tr>
            <th>${ company.allEmployeeTotalSalary }</th>
            <th>${ company.companyCurrentBankStatus }</th>
        </tr>
    </c:forEach>
</table>
</body>
</html>
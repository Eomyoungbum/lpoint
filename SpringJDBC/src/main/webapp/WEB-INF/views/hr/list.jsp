<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>CoderByList</title>
</head>
<body>
<h1>사원 목록</h1>
<a href="/myapp/hr/insert">신규 사원 정보 입력</a>
<table border="1">
<tr>
	<th>EmployeeId</th>
	<th>FirstName</th>
	<th>LastName</th>
	<th>Email</th>
	<th>PhoneNumber</th>
	<th>HireDate</th>
	<th>JobId</th>
	<th>Salary</th>
	<th>CommissionPct</th>
	<th>ManagerId</th>
	<th>DepartmentId</th>
</tr>
<c:forEach var="emp" items="${empList}">
<tr>
	<td><a href="/myapp/hr/${emp.employeeId}">${emp.employeeId}</a></td>
	<td>${emp.firstName}</td>
	<td>${emp.lastName}</td>
	<td>${emp.email}</td>
	<td>${emp.phoneNumber}</td>
	<td>${emp.hireDate}</td>
	<td>${emp.jobId}</td>
	<td>${emp.salary}</td>
	<td>${emp.commissionPct}</td>
	<td>${emp.managerId}</td>
	<td>${emp.departmentId}</td>
</tr>
</c:forEach>
</table>
</body>
</html>
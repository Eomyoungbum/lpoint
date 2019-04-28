<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>CoderByView</title>
</head>
<body>
<h1>��� ���� �� ��ȸ</h1>
<table border="1">
<tr>
	<th>EmployeeId</th>
	<td>${emp.employeeId}</td>
</tr>
<tr>
	<th>FirstName</th>
	<td>${emp.firstName}</td>
</tr>
<tr>
	<th>LastName</th>
	<td>${emp.lastName}</td>
</tr>
<tr>
	<th>Email</th>
	<td>${emp.email}</td>
</tr>
<tr>
	<th>PhoneNumber</th>
	<td>${emp.phoneNumber}</td>
</tr>
<tr>
	<th>HireDate</th>
	<td>${emp.hireDate}</td>
</tr>
<tr>
	<th>JobId</th>
	<td>${emp.jobId}</td>
</tr>
<tr>
	<th>Salary</th>
	<td>${emp.salary}</td>
</tr>
<tr>
	<th>CommissionPct</th>
	<td>${emp.commissionPct}</td>
</tr>
<tr>
	<th>ManagerId</th>
	<td>${emp.managerId}</td>
</tr>
<tr>
	<th>DepartmentId</th>
	<td>${emp.departmentId}</td>
</tr>
</table>
<a href="update?empid=${emp.employeeId}">�����ϱ�</a>
<a href="delete?empid=${emp.employeeId}">�����ϱ�</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>CoderByInsert</title>
</head>
<body>
<h1>사원 정보 입력</h1>
<form action="./insert" method="post">
<table border="1">
<tr>
	<th>EmployeeId</th>
	<td><input type="number" name="employeeId" required></td>
</tr>
<tr>
	<th>FirstName</th>
	<td><input type="text" name="firstName"></td>
</tr>
<tr>
	<th>LastName</th>
	<td><input type="text" name="lastName" required></td>
</tr>
<tr>
	<th>Email</th>
	<td><input type="text" name="email" required></td>
</tr>
<tr>
	<th>PhoneNumber</th>
	<td><input type="text" name="phoneNumber"></td>
</tr>
<tr>
	<th>HireDate</th>
	<td><input type="date" name="hireDate" required></td>
</tr>
<tr>
	<th>JobId</th>
	<td>
		<select name="jobId">
		<c:forEach var="job" items="${jobList}">
			<option value="${job.jobId}">${job.title}</option>
		</c:forEach>
		</select>
	</td>
</tr>
<tr>
	<th>Salary</th>
	<td><input type="number" name="salary"></td>
</tr>
<tr>
	<th>CommissionPct</th>
	<td><input type="number" name="commissionPct" step="0.1" min="0" max="0.99"></td>
</tr>
<tr>
	<th>ManagerId</th>
	<td>
		<select name="managerId">
		<c:forEach var="manager" items="${managerList}">
			<option value="${manager.managerId}">${manager.firstName}</option>
		</c:forEach>
		</select>
	</td>
</tr>
<tr>
	<th>DepartmentId</th>
	<td>
		<select name="departmentId">
		<c:forEach var="dept" items="${deptList}">
			<option value="${dept.departmentId}">${dept.departmentName}</option>
		</c:forEach>
		</select>
	</td>
</tr>
<tr>
	<th>&nbsp;</th>
	<td>
		<input type="submit" value="저 장">
		<input type="reset" value="취 소">
	</td>
</tr>
</table>
</form>
</body>
</html>
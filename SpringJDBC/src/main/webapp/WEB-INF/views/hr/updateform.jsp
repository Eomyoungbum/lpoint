<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>CoderByUpdate</title>
</head>
<body>
<h1>사원 정보 수정</h1>
<form action="./update" method="post">
<table border="1">
<tr>
	<th>EmployeeId</th>
	<td><input type="number" name="employeeId" value="${emp.employeeId}" readonly></td>
</tr>
<tr>
	<th>FirstName</th>
	<td><input type="text" name="firstName" value="${emp.firstName}"></td>
</tr>
<tr>
	<th>LastName</th>
	<td><input type="text" name="lastName" value="${emp.lastName}" required></td>
</tr>
<tr>
	<th>Email</th>
	<td><input type="text" name="email" value="${emp.email}" required></td>
</tr>
<tr>
	<th>PhoneNumber</th>
	<td><input type="text" name="phoneNumber" value="${emp.phoneNumber}" ></td>
</tr>
<tr>
	<th>HireDate</th>
	<td><input type="date" name="hireDate" value="${emp.hireDate}" required></td>
</tr>
<tr>
	<th>JobId</th>
	<td>
		<select name="jobId">
		<c:forEach var="job" items="${jobList}">
			<c:if test="${emp.jobId == job.jobId}">
			<option value="${job.jobId}" selected>${job.title}</option>
			</c:if>
			<c:if test="${emp.jobId != job.jobId}">
			<option value="${job.jobId}">${job.title}</option>
			</c:if>
		</c:forEach>
		</select>
	</td>
</tr>
<tr>
	<th>Salary</th>
	<td><input type="number" name="salary" value="${emp.salary}"></td>
</tr>
<tr>
	<th>CommissionPct</th>
	<td><input type="number" name="commissionPct" step="0.1" min="0" max="0.99" value="${emp.commissionPct}"></td>
</tr>
<tr>
	<th>ManagerId</th>
	<td>
		<select name="managerId">
		<c:forEach var="man" items="${managerList}">
			<option value="${man.managerId}" <c:if test="${emp.managerId == man.managerId}">selected</c:if>>${man.firstName}</option>
		</c:forEach>
		</select>
	</td>
</tr>
<tr>
	<th>DepartmentId</th>
	<td>
		<select name="departmentId">
		<c:forEach var="dept" items="${deptList}">
			<c:if test="${emp.departmentId == dept.departmentId}">
			<option value="${dept.departmentId}" selected>${dept.departmentName}</option>
			</c:if>
			<c:if test="${emp.departmentId != dept.departmentId}">
			<option value="${dept.departmentId}">${dept.departmentName}</option>
			</c:if>
		</c:forEach>
		</select>
	</td>
</tr>
<tr>
	<th>&nbsp;</th>
	<td>
		<input type="submit" value="수 정">
		<input type="reset" value="취 소">
	</td>
</tr>
</table>
</form>
</body>
</html>
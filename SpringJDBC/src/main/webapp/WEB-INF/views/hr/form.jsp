<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>CoderByInsert</title>
<style type="text/css">
.error{color : red}
</style>
</head>
<body>
<h1>사원 정보 입력</h1>
<form:form action="/myapp/hr/insert" modelAttribute="emp">
<table border="1">
<tr>
	<th>EmployeeId</th>
	<td><form:input path="employeeId" />
	<form:errors path="employeeId" class="error"></form:errors></td>
</tr>
<tr>
	<th>FirstName</th>
	<td><form:input path="firstName" />
	<form:errors path="firstName" class="error"></form:errors></td>
</tr>
<tr>
	<th>LastName</th>
	<td><form:input path="lastName" />
	<form:errors path="lastName" class="error"></form:errors></td>
</tr>
<tr>
	<th>Email</th>
	<td><form:input path="email" />
	<form:errors path="email" class="error"></form:errors></td>
</tr>
<tr>
	<th>PhoneNumber</th>
	<td><form:input path="phoneNumber" />
	<form:errors path="phoneNumber" class="error"></form:errors></td>
</tr>
<tr>
	<th>HireDate</th>
	<td><form:input path="hireDate" type="date" required="required" />
	<form:errors path="hireDate" class="error"></form:errors></td>
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
	<td><form:input path="salary" type="number" />
	<form:errors path="salary" class="error"></form:errors></td>
</tr>
<tr>
	<th>CommissionPct</th>
	<td><form:input path="commissionPct" type="number" />
	<form:errors path="commissionPct" class="error"></form:errors></td>
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
		<input type="submit" value="입 력">
		<input type="reset" value="취 소">
	</td>
</tr>
</table>
</form:form>
</body>
</html>
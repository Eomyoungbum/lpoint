<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>CoderByDelete</title>
</head>
<body>
<h1>��� ���� ����</h1>
${emp.firstName} ${emp.lastName} ����� ������ �����մϴ�.<p>
���� �� �����ʹ� ������ �� �����ϴ�.</p>
${emp.firstName} ${emp.lastName} ����� �̸����� �Է����ּ���.
<br><br>
<form action="./delete" method="post">
�̸��� : <input type=text name=email>
<input type="hidden" name="empid" value="${emp.employeeId}">
<input type="submit" value="�� ��">
</form>
</body>
</html>
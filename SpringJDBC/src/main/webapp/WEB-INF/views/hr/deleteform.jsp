<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>CoderByDelete</title>
</head>
<body>
<h1>사원 정보 삭제</h1>
${emp.firstName} ${emp.lastName} 사원의 정보를 삭제합니다.<p>
삭제 후 데이터는 복구할 수 없습니다.</p>
${emp.firstName} ${emp.lastName} 사원의 이메일을 입력해주세요.
<br><br>
<form action="./delete" method="post">
이메일 : <input type=text name=email>
<input type="hidden" name="empid" value="${emp.employeeId}">
<input type="submit" value="삭 제">
</form>
</body>
</html>
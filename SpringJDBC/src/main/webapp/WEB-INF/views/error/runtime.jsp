<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>CoderByError</title>
</head>
<body>
<script type="text/javascript">
alert("${exception.message}");
history.back();
</script>

<!-- 
	Failed URL : ${url}
	Exception : ${exception.message}
	<c:forEach items="${exception.stackTrace}" var="ste"> ${ste}
	</c:forEach>
 -->
</body>
</html>
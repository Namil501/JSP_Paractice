<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type"
		content="text/html; charset=UTF-8">
		<title>input page</title>
	</head>
	<body>
		<div style="position:absolute; text-align:center;left:25%;">
			<img src="/Servlet_Training/img/BMI.jpeg" alt="BMI Image" style="weigh:300px;"/>
			<form action="BMI_result" method="get">
				<label for="height">身長:</label>
				<input type="text" name="height"/>
				<br />
				<label for="weight">体重:</label>
				<input type="text" name="weight"/>
				<br />
				<input type="submit" value="送信"/>
			</form>
		</div>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>BMI infomation</title>
	</head>
	<body>
		<%
			Double bmi = (Double)request.getAttribute("bmi_result");
			Double std_weight = (Double)request.getAttribute("std_weight");
			String bmi_String =  String.format("%.2f", bmi);
			String std_weight_String =  String.format("%.2f", std_weight);
			String bmi_img;
			if(bmi<18.5){
				bmi_img="/Servlet_Training/img/under_weight.png";
			}else if(bmi<25.0){
				bmi_img="/Servlet_Training/img/normal_weight.png";
			}else if(bmi<30.0){
				bmi_img="/Servlet_Training/img/over_weight.png";
			}else if(bmi<35.0){
				bmi_img="/Servlet_Training/img/obese_class1.png";
			}else if(bmi<40.0){
				bmi_img="/Servlet_Training/img/obese_class2.png";
			}else{
				bmi_img="/Servlet_Training/img/obese_class3.png";
			}
		%>
		<div style="text-align:center;top:50%;">
			<img src=<%=bmi_img %> alt="BMI_image" />
			<p>BMI結果：<%= bmi_String %></p>
			<p>標準体重：<%= std_weight_String %>kg</p>
			<a href="/Servlet_Training/bmi/BMI_input.jsp">前に戻る</a>
		</div>
	</body>
</html>
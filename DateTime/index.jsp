<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>Enter your information below :</p>

	<form action="data" method="GET">

		<p>
			Enter your name: <br /> <input type="text" name="name">
		</p>

		<p>
			I am a: <br /> 
					<input type="radio" name="gender" value="male"> Male <br />
					<input type="radio" name="gender" value="female"> Female <br />
					<input type="radio" name="gender" value="none"> None of the above <br />
		</p>
		
		<p>
			I enjoy: <br /> 
					<input type="checkbox" name="enjoy" value="cake">Cake<br />
					<input type="checkbox" name="enjoy" value="bananas">Bananas<br />
					<input type="checkbox" name="enjoy" value="pizza">Pizza<br />
					<input type="checkbox" name="enjoy" value="ice cream">Ice cream<br />
		</p>
		
		<input type="submit" value="Send mah data!">
	</form>

</body>
</html>
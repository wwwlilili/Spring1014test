<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>

<title>Insert title here</title>

</head>
<body>
	<input id="testBtn" type="button" value="test button" />
	<form id="loginForm">
		username:<input id="username" type="text" value="asd" /><br>
		password:<input id="password" type="password" value="asd" /><br>
		age:<input id="age" type="text" value="77" /><br>
		<input type="submit" value="login"/>
	</form>
	<script>
		function testJson(evt) {
			evt.preventDefault();
			//获取输入的值pname为id
			//alert($("#username").val());
			var username = $("#username").val();
			var password = $("#password").val();
			var age = $("#age").val();
			var user = {
				"username" : username,
				"password" : password,
				"age" : age,
				"aihao" : [ 1, 2, 3 ]
			};
			console.log("username:"+username);
			$.ajax({
				url : "member/testJson",
				type : "post",
				data : JSON.stringify(user),
				contentType : 'application/json;charset=UTF-8',
				success : function(data) {
					console.log(data);
				}
			});
		}

		function start() {
			
			$("#loginForm").submit(testJson);
		}
		$(document).ready(start);
	</script>
</body>

</html>
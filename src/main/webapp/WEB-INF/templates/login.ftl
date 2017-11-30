<!DOCTYPE html>
<html lang="zh-CN">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>ConvergenceUI</title>
	
		<!-- Bootstrap -->
		<link href="resources/dependencies/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet">
		<script src="resources/dependencies/bootstrap-3.3.7/js/bootstrap.min.js"></script>
		<script src="resources/js/jquery3.2.1.js"></script>
		
		<!-- Custom -->
		<script src="resources/js/custom/jquery.data.js"></script>
	</head>
	<body>
		<div class="container">
			<div class="jumbotron login" style="height:60%;width:80%;position:absolute;top:0;left:0;bottom:0;right:0;margin:auto;">
				<h1>Hello, Welcome to Convergence!</h1>
				<p>This is private website!</p>
				<form id="base">
					<div class="form-group">
					    <label for="username">Username</label>
					    <input type="text" class="form-control" id="username" name="username" placeholder="Username">
					</div>
					<div class="form-group">
					    <label for="password">Password</label>
					    <input type="password" class="form-control" id="password" name="password" placeholder="Password">
					</div>
					<div class="form-group navbar-right" style="text-align:right">
						<button class="btn btn-primary btn" onClick="login()">Login In</button>
						<a id="register">register</a>
						&emsp;
					</div>
				</form>
			</div>
  		</div>
	</body>
	<script type="text/javascript">
		function login(){
			var data = $.datas.CreateDataRow($("#base"));
			
		}
	</script>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/common/header.jspf"%>
<%@ include file="/common/navigation.jspf"%>
<div class="container main">

	<div class="sub1">
		<%@ include file="/common/carousel.jspf"%>
	</div>
	<div class="sub2">

		<form class="form-horizontal" name="myForm" class="frm" action = "/LoginServlet.do" method="post">
			<div class="form-group">
				<h3>
					<strong>Resident Login</strong>
				</h3>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-4" for="mobileNum">Mobile Number
				</label>
				<div class="col-sm-4">
					<input type="text" class="form-control field" id="mobileNum"
						name="mobileNum" placeholder="Enter mobile number" required>
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-4" for="password">Password:</label>
				<div class="col-sm-4">
					<input type="password" class="form-control field" id="password"
						name="password" placeholder="Enter password" required>
				</div>
			</div>

			<div class="form-group login">
				<div class="col-sm-offset-4 col-sm-4">
					<input type="submit" value="Login" class="btn btn-default" />
				</div>
			</div>
			<div align = "center">
				<font color="red">${errorMessage}</font>
			</div>
		</form>
	</div>
</div>

<%@ include file="/common/footer.jspf"%>
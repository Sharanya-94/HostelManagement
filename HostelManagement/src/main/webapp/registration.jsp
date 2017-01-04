<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/common/header.jspf"%>
<%@ include file="/common/navigation.jspf"%>
<div class="container main">

	<div class="sub1">
		<%@ include file="/common/carousel.jspf"%>
	</div>
	<div class="sub2">

		<form class="form-horizontal" name="regForm" method="post"
			onsubmit = "return regValidation()" action="RegisterServlet.do" >
			<div class="form-group">
				<h3>
					<strong>New Resident Registration</strong>
				</h3>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-4" for="firstName">First
					name:</label>
				<div class="col-sm-4">
					<input type="text" class="form-control field" id="firstName"
						name="firstName" placeholder="Enter your FirstName"  maxlength="15" required>
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-4" for="lastName">Last
					name:</label>
				<div class="col-sm-4">
					<input type="text" class="form-control field" id="lastName"
						name="lastName" placeholder="Enter your LastName"  maxlength="15" required>
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-4" for="email">Email/
					UserName:</label>
				<div class="col-sm-4">
					<input type="email" class="form-control field" id="email"
						name="email" placeholder="Enter your emailId" required>
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-4" for="pwd">Password:</label>
				<div class="col-sm-4">
					<input type="password" class="form-control field" id="pwd"
						name="pwd" placeholder="Enter your password" required>
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-4" for="re_pwd">Confirm
					Password:</label>
				<div class="col-sm-4">
					<input type="password" class="form-control field" id="re_pwd"
						name="re_pwd" placeholder="Re-enter your password" required>
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-4" for="city">city:</label>
				<div class="col-sm-4">
					<input type="text" class="form-control field" id="city" name="city"
						placeholder="Enter City" required>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-4" for="mobileNum">Mobile:
				</label>
				<div class="col-sm-4">
					<input type="text" class="form-control field" id="mobileNum"
						name="mobileNum" placeholder="Enter your Mobile"   maxlength="10" required>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-4" for="JD">Joining Date:</label>
				<div class="col-sm-4">
					<input type="date" class="form-control field" id="JD" name="JD"
						placeholder="Enter Joining Date" required>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-4" for="roomNum">Room
					Number:</label>
				<div class="col-sm-4">
					<input type="text" class="form-control field" id="roomNum"
						name="roomNum" placeholder="Enter Room Number" required>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-4" for="advancePaid">Advance
					Paid:</label>
				<div class="col-sm-4">
					<input type="text" class="form-control field" id="advancePaid"
						name="advancePaid" placeholder="Enter Advance" required>
				</div>
			</div>
			<!-- <div class="form-group">
				<label class="control-label col-sm-4" for="phone">Upload your Id Proof:
					</label>
				<div class="col-sm-5">
					<input type="file" id="idproof" name="id proof" accept = "image/*, .pdf " required>
				</div>
			</div> -->

			<div class="form-group">
				<div class="col-sm-offset-4 col-sm-4">
					<input type="submit" value="register" class="btn btn-default" />
				</div>
			</div>
			<div align="center">
				<font color="green">${successMessage}</font>
			</div>

		</form>
		<div id="afterRegistering"></div>

	</div>
</div>

<%@ include file="/common/footer.jspf"%>
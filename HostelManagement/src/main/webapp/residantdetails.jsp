<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/common/header.jspf"%>
<%@ include file="/common/navafteruserlogin.jspf"%>

<div class="container main">
	
	<div id = "details">
	<h2>Details</h2>
	<div class="row">
		<div class="col-sm-6" id = "prndetails">Name</div>
		<div class="col-sm-6" id = "prndetails">Sharanya</div>
	</div>
	<div class="row">
		<div class="col-sm-6" id = "prndetails">Address</div>
		<div class="col-sm-6" id = "prndetails">H.NO: 2-163, NGO'S COLONY, WARANGAL</div>
	</div>
	<div class="row">
		<div class="col-sm-6" id = "prndetails">Id proof</div>
		<div class="col-sm-6" id = "prndetails">Image</div>
	</div>
	<div class="row">
		<div class="col-sm-6" id = "prndetails">Joining Date</div>
		<div class="col-sm-6" id = "prndetails">12/12/2016</div>
	</div>
	<div class="row">
		<div class="col-sm-6" id = "prndetails">Room number</div>
		<div class="col-sm-6" id = "prndetails">102</div>
	</div>
	<div class="row">
		<div class="col-sm-6" id = "prndetails">Advance Paid</div>
		<div class="col-sm-6" id = "prndetails">2000</div>
	</div>
	<div class="row">
		<div class="col-sm-6" id = "prndetails">Mobile number</div>
		<div class="col-sm-6" id = "prndetails">
			987654321
		</div>
	<!-- 	<div class="col-sm-2" id = "prndetails">
			<input type=button class="btn btn-default" value="edit mobile number" />
		</div>  -->
	</div>

	<h2>Fee Details</h2>
	<table class="table" id="datatable">
		<thead>
			<tr>
				<th id = "prndetails">Month/Year</th>
				<th id = "prndetails">Paid Status</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td id = "prndetails">12/12/2016</td>
				<td id = "prndetails">paid</td>
				
			</tr>
			<tr>
				<td id = "prndetails">12/1/2017</td>
				<td id = "prndetails">not paid</td>
				
			</tr>
			<tr>
				<td id = "prndetails">12/2/2017</td>
				<td id = "prndetails">not paid</td>
				
			</tr>

		</tbody>
	</table>
</div>
</div>

<%@ include file="/common/footer.jspf"%>
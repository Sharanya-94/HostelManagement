<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/common/header.jspf"%>
<%@ include file="/common/navafteruserlogin.jspf"%>
<%@ page import="java.util.*" %>
<%@ page import="com.hostelmanagement.model.Register" %>
<div class="container main">
	<div id = "scrl">
	<div id = "details">
	<h2>Details</h2>
	<%-- <% 
	List<Register>  list =(List)request.getAttribute("list"); %>
	 <%  for(int i=0;i<list.size();i++){  %>
          
        
        <td><%= allTickets.get(i).getTicket_id() %></td>
        <td><%= allTickets.get(i).getCustomer_name() %></td>
        <td><%= allTickets.get(i).getCustomer_contact() %></td>
        <td><%= allTickets.get(i).getTicket_category() %></td>
        <td><%= allTickets.get(i).getTicket_desc() %></td>
        <td><%= allTickets.get(i).getAgent_assigned() %></td>
        <td><%= allTickets.get(i).getTicket_status() %></td>               --%>  
                       
 
	<div class="row">
		<div class="col-sm-6" id = "prndetails">Name</div>
		<div class="col-sm-6" id = "prndetails">${firstName}  ${lastName}</div>
	</div>
	 <div class="row">
		<div class="col-sm-6" id = "prndetails">City</div>
		<div class="col-sm-6" id = "prndetails"><%-- <%= list.get(0).getCity() %> --%>${city}</div>
	</div>
	<div class="row">
		<div class="col-sm-6" id = "prndetails">Email</div>
		<div class="col-sm-6" id = "prndetails">${email}</div>
	</div>
	<!--<div class="row">
		<div class="col-sm-6" id = "prndetails">Id proof</div>
		<div class="col-sm-6" id = "prndetails">Image</div>
	</div> -->
	<div class="row">
		<div class="col-sm-6" id = "prndetails">Joining Date</div>
		<div class="col-sm-6" id = "prndetails">${date}</div>
	</div>
	<div class="row">
		<div class="col-sm-6" id = "prndetails">Room number</div>
		<div class="col-sm-6" id = "prndetails">${roomNum}</div>
	</div>
	<div class="row">
		<div class="col-sm-6" id = "prndetails">Advance Paid</div>
		<div class="col-sm-6" id = "prndetails">${advancePaid}</div>
	</div>
	<div class="row">
		<div class="col-sm-6" id = "prndetails">Mobile number</div>
		<div class="col-sm-6" id = "prndetails">${mobileNum}</div>
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
	<%-- <% }  %>  --%>
</div>
</div>
</div>
<%@ include file="/common/footer.jspf"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/common/header.jspf"%>
<%@ include file="/common/adminnavigation.jspf"%>
<!-- <div class = "main">
	<div id="ajaxResponse"></div>

	
</div> -->
<div class="container main">
  <h2>Room Availability and Rates</h2>
  <table class="table table-striped">
    <thead>
      <tr>
        <th class="col-sm-4">Room</th>
        <th class="col-sm-4">Rate</th>
        <th class="col-sm-4">Availability</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>1 Sharing</td>
        <td>Rs.9000/-</td>
        <td><input type = button value = "Check Availability" class="btn btn-default" id="update1" /></td>
      </tr>
      <tr>
        <td>2 Sharing</td>
        <td>Rs.8000/-</td>
        <td><input type = button value = "Check Availability" class="btn btn-default" id="update2"/></td>
      </tr>
      <tr>
        <td>3 Sharing</td>
        <td>Rs.7000/-</td>
        <td><input type = button value = "Check Availability" class="btn btn-default"id="update3"/></td>
      </tr>
      <tr>
        <td>4 Sharing</td>
        <td>Rs.6000/-</td>
        <td><input type = button value = "Check Availability" class="btn btn-default"/></td>
      </tr>
    </tbody>

  </table>
 
  <h2>Rooms Availability </h2>
  <div id="ajaxResponse" class="form-group">
  
  
  </div>
</div>

<%@ include file="/common/footer.jspf"%>
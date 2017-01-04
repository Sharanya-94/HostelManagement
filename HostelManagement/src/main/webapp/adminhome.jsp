<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/common/header.jspf"%>
<%@ include file="/common/adminnavigation.jspf"%>
<%@page import="java.util.ArrayList" %>
<div class="container main">
<%ArrayList al=(ArrayList)request.getAttribute("details");%>


 <div class="inner-addon left-addon">
    <i class="glyphicon glyphicon-search"></i>
    <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for names.." class="form-control" />
</div>
<h2>Resident Details</h2>
<table width="50%"  id="myTable">
<tr  >
<th style="width:20%;">firstname</th>
<th style="width:20%;">lastname</th>
<th style="width:20%;" >mobilenum</th>
<th style="width:20%;">joiningdate</th>
<th style="width:20%;">roomnum</th></tr>
<% 
for(int i=0;i<al.size();i++){
Object[] a=(Object[])al.get(i);%>
<tr>
<td><%=a[0] %></td>
<td><%=a[1] %></td>
<td><%=a[2] %></td>
<td><%=a[3] %></td>
<td><%=a[4] %></td></tr>
	
<%} %>

</table>

</div>

<%@ include file="/common/footer.jspf"%>
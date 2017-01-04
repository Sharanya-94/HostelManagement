$(document).ready(function() {
	var val;
	$('#update1').click(function (event) {
		alert("update1");
	     val="RoomAvailabilityServlet?value=1";
	     roomavailabilitey()
	    });
	$('#update2').click(function(event) {
		alert("update2");
		val="RoomAvailabilityServlet?value=2";
		roomavailabilitey()
	    });
	$('#update3').click(function(event) {
		alert("update3");
		val="RoomAvailabilityServlet?value=3";
		roomavailabilitey()
	    });
	
	
	function roomavailabilitey(){
		alert("entered");
    	  $.get(val, {
   		   
              datatype:"json"
    	    
            },function(data) {
            	var json = $.parseJSON(data);
            	/*$(json).each(function(i,val){
            	    $.each(val,function(k,v){
            	          alert(v);   
            	});
            	});*/
            	 $("#ajaxResponse").html('');
            	 $("#ajaxResponse").append("<form><table class='table table-striped'><thead><tr><th class='col-sm-2'>sharing</th><th class='col-sm-2'>First Floor</th><th class='col-sm-2'>Second Floor</th><th class='col-sm-2'>third Floor</th><th class='col-sm-2'></th><th class='col-sm-2'></th></tr></thead><tbody>");
            	 
            	  $("#ajaxResponse").append("<td class='col-sm-2'><input type='text' class='form-control'  class='col-lg-3' name='sharing' id='sharing' value='" + json.sharing+"'  size='3' readonly/>");
            	 $("#ajaxResponse").append("<td class='col-sm-2'><input type='text' class='form-control'  class='col-lg-3'  name='floor1' id='floor1' value='" + json.firstfloor+"' size='3'  readonly />");
            	 $("#ajaxResponse").append("<td class='col-sm-2'><input type='text' class='form-control' class='col-xs-3'  name='floor2' id='floor2' value='" + json.secondfloor+"' size='3'   readonly/>");
            	 $("#ajaxResponse").append("<td class='col-sm-2'><input type='text' class='form-control' class='col-xs-3'  name='floor3' id='floor3' value='" + json.thirdfloor+"' size='3'  readonly/>");
            	
                 $("#ajaxResponse").append("<td class='col-sm-1'> <input type='button' onclick='abc()'  class='btn btn-default' value='edit1' id='edit'/></td> <td class='btn btn-info btn-sm'><input type='button' value='update'  class='btn btn-info btn-sm' onclick='update()'/></tbody></table></form>" );
             });
    	  }
    	
     
 });
function abc() {
    alert("Calling function");
    $("#sharing,#floor1,#floor2,#floor3").prop("readonly", false);
   }
function update() {
	  alert( "Handler for .submit() called." );
	  var sharing=document.getElementById('sharing').value;
	  var floor1=document.getElementById('floor1').value;
	  var floor2=document.getElementById('floor2').value;
	  var floor3=document.getElementById('floor3').value;
	  alert(sharing +"" +floor1 +"" +floor2 +"" +floor3)
	  $.post("RoomAvailabilityUpadate",
			    {
			        sharing: sharing,
			        floor1: floor1,
			        floor2: floor2,
			        floor3: floor3,
			        
			    },
			    function(data, status){
			        alert("Data: " + data + "\nStatus: " + status);
			    });
	  
	}
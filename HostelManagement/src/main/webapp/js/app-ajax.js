$(document).ready(function() {
	var val;
	$('#button1').click(function(event) {
		alert("hi");
		val="RoomAvailabilityServlet?value=1";
		hello();
	    });
	$('#button2').click(function(event) {
		val="RoomAvailabilityServlet?value=2";
		hello();
	    });
	$('#button3').click(function(event) {
		val="RoomAvailabilityServlet?value=3";
		hello();
	    });

    	function hello(){
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
            	 $("#ajaxResponse").append("<table class='table table-striped'><thead><tr><th class='col-sm-3'>sharing</th><th class='col-sm-3'>First Floor</th><th class='col-sm-3'>Second Floor</th><th class='col-sm-3'>third Floor</th></tr></thead><tbody>");
            	 $("#ajaxResponse").append("<td class='col-sm-3'>" + json.sharing);
                 $("#ajaxResponse").append("</td><td class='col-sm-3'>"+json.firstfloor +"</td>" );

                 $("#ajaxResponse").append("<td class='col-sm-3'> " + json.secondfloor+"</td>"  );

                 $("#ajaxResponse").append("<td class='col-sm-3'> " + json.thirdfloor+"</td></tbody></table>" );
             });}
     
 });
            
            	
               
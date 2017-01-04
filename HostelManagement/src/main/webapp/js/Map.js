/**
 * 
 */



	function loadMap() {

		var mapOptions = {
			center : new google.maps.LatLng(17.4494, 78.3725),
			zoom : 15,
			mapTypeId : google.maps.MapTypeId.ROADMAP
		};

		var map = new google.maps.Map(document.getElementById("mapLoad"),
				mapOptions);
		var marker = new google.maps.Marker({
			position : new google.maps.LatLng(17.4494, 78.3725),
			map : map,
		});
	}
	

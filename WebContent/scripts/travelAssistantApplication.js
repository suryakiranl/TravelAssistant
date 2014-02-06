	$(document).ready(function (){
		$("#topTabs").click(function(){
			$(this).tab('show');
		});

		$("#getWeatherInfo").on('click', function(e){
			e.preventDefault();
			var cityNameorZipCode = $("#loc").val();
			$.ajax({
				type: 'GET',
				url: 'WeatherInfoServlet',
  				data: { "cityNameOrZip" : cityNameorZipCode },
  				success: function( data ) {
    				$( "#weatherDetails" ).html( data ); 
    			},
    			error: function(request, errorType, errorMessage){
    				alert('Error: ' + errorType + " with message " + errorMessage); },
    			});
    	});
		
		$("#getTravelInfo").on('click', function(e){
			e.preventDefault();
			var fromLoc = $("#startLoc").val();
			var toLoc	= $("#destLoc").val();
			$.ajax({
				type: 'GET',
				url: 'TravelInfoServlet',
  				data: { "startLocation" : fromLoc, "destination": toLoc },
  				success: function( data ) {
    				$( "#travelDetails" ).html( data ); 
    			},
    			error: function(request, errorType, errorMessage){
    				alert('Error: ' + errorType + " with message " + errorMessage); },
    			});
    	});
    });
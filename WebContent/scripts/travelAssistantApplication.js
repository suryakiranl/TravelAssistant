		// Trigger Tabs	
$(document).ready(function (){
		$("#topTabs").click(function(){
			$(this).tab('show');
		});

		// Ajax query for weather
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
    			beforeSend: function(){
    				$("#ajaxLoader").show();
    			},
    			complete: function() {
    				$("#ajaxLoader").hide();
    				$("#weatherDisplay").css('display', 'block');
    			},
    			});
    	});

		
		// Ajax query for travel		
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
        			beforeSend: function(){
        				$("#ajaxLoaderTravel").show();
        			},
        			complete: function() {
        				$("#ajaxLoaderTravel").hide();
        				$("#travelDisplay").css('display', 'block');
        			},
    			});
    	});
		
		$("#resetTravelInfo").click(function() {
			$("#startLoc, #destLoc").val("");
			$("#travelDisplay").css('display', 'none');
		});
		
		$("#resetWeatherInfo").click(function() {
			$("#weatherDisplay").css('display', 'none');
		});
		
    });
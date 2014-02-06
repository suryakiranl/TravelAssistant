	$(document).ready(function (){
		$("#topTabs").click(function(){
			$(this).tab('show');
		});

		$("#getWeatherInfo").on('click', function(e){
			e.preventDefault();
			var zipCode = $("#loc").val();
			$.ajax({
				type: 'GET',
				url: 'WeatherInfoServlet',
  				data: { "cityNameOrZip" : zipCode },
  				success: function( data ) {
  					alert("Result from server = " + data);
    				$( "#weatherDetails" ).html( data ); },

    			error: function(request, errorType, errorMessage){
    				alert('Error: ' + errorType + " with message " + errorMessage); },
    			});
    	});
    });
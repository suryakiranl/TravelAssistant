	$(document).ready(function (){
		$("#topTabs").click(function(){
			$(this).tab('show');
		});

		$("#getWeatherInfo").on('click', function(e){

			e.preventDefault();
			$.ajax('http://api.worldweatheronline.com/free/v1/weather.ashx', {

				type: 'POST',
  				data: {
  					   "key": 'm7b32qfztwua6js7cjg2px6h', 
  					   "format": 'json', 
  					   "q": '$("#loc").val()'},

  				success: function( data ) {
    				$( "#weather-details" ).html( "<strong>" + "Hit the URL" + "</strong> degrees: " + data ); },

    			error: function(request, errorType, errorMessage){
    				alert('Error: ' + errorType + " with message " + errorMessage); },
    			});
    	});
    });
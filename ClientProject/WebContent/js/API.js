$(document).ready(function(){
 $.ajax({
 method: "GET",
 url: "http://api.ipstack.com/check?access_key=72751c236c0d09692d2dd62fc4b3cb8e",
 error: ajaxReturn_Error,
 success: ajaxReturn_Success
 })
 function ajaxReturn_Success(result, status, xhr) {
 ParseJsonFile(result);
 }
 function ajaxReturn_Error(result, status, xhr) {
 console.log("Weather error: "+status);
 }

function ParseJsonFile(result) {
 var lat = result.latitude;
var long = result.longitude;
 var city = result.city;
 $("#city").text(city);
$.ajax({
 method: "GET",
 url:
"http://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+long+"&units=metric"+ "&APPID=b2e011829e0b01fca6c7b294d83ce878",
 error: ajaxWeatherReturn_Error,
 success: ajaxWeatherReturn_Success
 })
 function ajaxWeatherReturn_Success(result, status, xhr) {
 var sunrise = result.sys.sunrise;
 var sunset = result.sys.sunset;
 var sunriseDate = new Date(sunrise*1000);
 var timeStrSunrise = sunriseDate.toLocaleTimeString();
 var sunsetDate = new Date(sunset*1000);
 var timeStrSunset = sunsetDate.toLocaleTimeString();
 var weather = result.weather[0].main;

	var today = returnToday();
 $("#date").text(today);
 $("#sunrise").text(timeStrSunrise);
 $("#sunset").text(timeStrSunset);
 $("#weather").text(weather);
 $("#degree").text(Math.round(result.main.temp)+"\u00B0");
	setWeatherImg(weather);
 }//ajaxWeatherReturn_Success

 function ajaxWeatherReturn_Error(result, status, xhr) {
 alert("Error i OpenWeaterMap Ajax");
 }
 }
function returnToday(){
	var today = new Date();
	var dd = today.getDate();
	var mm = today.getMonth();
	var y = today.getFullYear();
	
	var weekdays = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
	var months = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"];
	var day = weekdays[today.getDay()];
	today = day +", "+dd + " " + months[mm] + " "+y;
	return today;
}
function setWeatherImg(weather){
		if(weather == "Drizzle" || weather == "Rain"){
		 document.getElementById("weatherImg").src = "https://cdn3.iconfinder.com/data/icons/weather-ios-11-1/50/Heavy_Rain_Night_Rain_Raindrops_Apple_iOS_Flat_Weather-512.png";
	}
	else if(weather == "Clear"){
		 document.getElementById("weatherImg").src =  "https://cdn1.iconfinder.com/data/icons/weather-forecast-meteorology-color-1/128/weather-sunny-512.png";
	}
	else if(weather == "Snow"){
		 document.getElementById("weatherImg").src =  "https://cdn1.iconfinder.com/data/icons/weather-forecast-meteorology-color-1/128/weather-snow-light-512.png";
	}
	else if(weather === "Clouds"){
		document.getElementById("weatherImg").src = "https://cdn1.iconfinder.com/data/icons/weather-forecast-meteorology-color-1/128/weather-partly-cloudy-512.png";
	}
	else{
		 document.getElementById("weatherImg").src ="https://icon-library.com/images/cloudy-icon/cloudy-icon-15.jpg";
	}
}
 })
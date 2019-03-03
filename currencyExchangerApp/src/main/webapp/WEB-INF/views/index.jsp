<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="ISO-8859-1">

<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript">
function validate(){
	var exchangeRate=document.getElementById("exchangeRate");
	var base=document.getElementById("base");
	var target=document.getElementById("target");
	var amount=document.getElementById("amount");
	var valid=true;
	
	if(exchangeRate.value.length<=0 || base.value.length<=0 || target.value.length<=0 || amount.value.length<=0){
		alert("One or more fields are empty! Enter a value");
		valid=false;
	}	
		else{
			switch (exchangeRate.value) {
	        case "sell":
	                 break;
	        case "buy":
	        		break;
	        default:alert("Invalid value in exchange rate field!");valid=false;
	        break;
			}

			switch (base.value) {
	        case "huf":
	                 break;
	        case "eur":
	        		break;
	        case "usd":
    				break;
	        case "gbp":
    				break;
	        case "chf":
    				break;
	        default:alert("Invalid value in base field!");valid=false;
	        break;
			}

			switch (target.value) {
	        case "huf":
	                 break;
	        case "eur":
	        		break;
	        case "usd":
    				break;
	        case "gbp":
    				break;
	        case "chf":
    				break;
	        default:alert("Invalid value in target field!");valid=false;
	        break;
			}

			if(isNaN(amount.value)){
				alert("Enter a number!");
				valid=false;
			}
			}
	
	return valid;
	
}
</script>

<title>Currency exchanger</title>

</head>

<body>

<h1>Currency exchanger</h1>
<h3>For required exchange rate type, write: "sell" or "buy"</h3>
<h3>For required base or target currency, write: "huf","eur","usd","gbp","chf"</h3>
<h3>Only the listed values are accepted!</h3>
<hr> 

<div class="form">

<form action="result" method="post" onsubmit="return validate();">
	<table>
	<tr>
		<td>Enter required exchange rate:</td>
		<td><input id="exchangeRate" name ="exchangeRate"></td>
		<td>Enter the base currency code:</td>
		<td><input id="base" name ="base"></td>
		<td>Enter the target currency code:</td>
		<td><input id="target" name ="target"></td>
		<td>Enter the amount of money:</td>
		<td><input id="amount" name ="amount"></td>
		<td><input type="submit" value="Submit"/></td>						
	</tr>
	</table>
</form>

</div>

</body>

</html>
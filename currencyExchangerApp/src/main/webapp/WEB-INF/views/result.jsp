<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.currexch.service.Exchanger"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/resources/css/style.css">
<title>Exchanger</title>

</head>

<body>

<h1>Exchange result</h1>
<table>
<tr>
<td>Required exchange rate:${exchangeRate}, ${amount} ${base} = ${result} ${target} </td>
</tr>
</table>
</body>

</html>
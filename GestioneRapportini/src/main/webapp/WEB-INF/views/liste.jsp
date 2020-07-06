<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="">
<head>

<!-- Style icon -->
<link href="<c:url value="/resources/css/icon.css" />" rel="stylesheet">
<!-- end CSS -->

<!--Metadata-->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- end metadata -->


<!-- CSS -->
<!--Css jquery.mobile-->
<link rel="stylesheet"
	href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">
<!-- Google Fonts -->
<link
	href='https://fonts.googleapis.com/css?family=Poppins:400,300,500,600,700'
	rel='stylesheet' type='text/css'>
<!-- Font Awesome -->
<link
	href='https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css'
	rel='stylesheet' type='text/css'>
<!-- end CSS -->

<!-- Style -->
<link href="<c:url value="/resources/css/form.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<!-- end CSS -->

<!--Js-->
<!-- jQuery -->
<script src="//code.jquery.com/jquery.js"></script>
<!-- Bootstrap JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
	integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
	crossorigin="anonymous"></script>
<!-- end JS -->


<title>CoDevs</title>


<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
  			<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.2/html5shiv.min.js"></script>
  			<script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
  		<![endif]-->
</head>

<body>
	<c:set var="log" value="utenteNonLoggato" />
	<c:if test="${utente.stato eq log}">
		<c:redirect url="http://localhost:8080/GestioneRapportini2/login" />
	</c:if>
	<nav class="navbar navbar-default" role="navigation">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-ex1-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="home">CoDevs</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse navbar-ex1-collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="list">Liste</a></li>
					<li><a href="logout">Logout</a></li>

				</ul>
			</div>
		</div>
	</nav>
	<!-- /.navbar-collapse -->

	<table width=100% height="250px"  style="margin-bottom: 40px;">
		<tr>
			<th></th>
			<th><center>
					<h4>Seleziona la lista che vuoi visualizzare</h4>
				</center></th>
			<th></th>
		</tr>

		<c:set var="admin" value="admin" />
		<c:if test="${utente.profilo eq admin}">
			<tr>
				<td width=20%></td>
				<td><a href="dipendenti" id="button-2"
					class="ui-btn ui-corner-all ui-btn-a">Dipendenti</a></td>
				<td width=20%></td>
			</tr>
		</c:if>


		<c:if test="${utente.profilo eq admin}">
			<tr>
				<td width=20%></td>
				<td><a href="clienti" id="button-2"
					class="ui-btn ui-corner-all ui-btn-a">Clienti</a></td>
				<td width=20%></td>
			</tr>
		</c:if>

		<tr>
			<td width=20%></td>
			<td><a href="rapportini" id="button-2"
				class="ui-btn ui-corner-all ui-btn-a">Rapportini</a></td>
			<td width=20%></td>
		</tr>

		<tr>
			<td width=20%></td>
			<td><a href="commesse" id="button-2"
				class="ui-btn ui-corner-all ui-btn-a">Commesse</a></td>
			<td width=20%></td>
		</tr>

	</table>




	<!-- START SECTION -->
	<div class="section background-dark dark-bg">
		<div class="container">
			<div class="row">
				<table width=100%>
					<tr>
						<td width=33.3% align="center">
							<h3
								class="text-uppercase font-size-md letter-spacing-md font-weight-lg ">Informazioni</h3>
							<p>
								Azienda leader del<br> settore nella gestione<br>
								aziendale e della<br> consulenza.
							</p>
						</td>
						<td width=33.3% align="center">
							<h3
								class="text-uppercase font-size-md letter-spacing-md font-weight-lg ">Sede
								Italiana</h3>
							<address>
								Via Principe di Piemonte, 19<br> Casoria, NA, 80026<br>
								<abbr title="Phone">T: </abbr> (123) 456-7890 <br> <a
									href="mailto:#">codevs@newsoft.com</a>
							</address>
						</td>
						<td width=33.3% align="center">
							<!-- Add font awesome icons --> <a href="#"
							class="fa fa-facebook"></a> <a href="#" class="fa fa-twitter"></a>
							<br> <a href="#" class="fa fa-instagram"></a> <a href="#"
							class="fa fa-linkedin"></a>
						</td>
				</table>
			</div>
		</div>
	</div>
	<!--/.section -->

</body>
</html>
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
<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">
<!-- Google Fonts -->
<link href='https://fonts.googleapis.com/css?family=Poppins:400,300,500,600,700' rel='stylesheet' type='text/css'>
<!-- Font Awesome -->
<link
	href='https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css'
	rel='stylesheet' type='text/css'>
<!-- end CSS -->

<!-- Style -->
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<!-- end CSS -->

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
  			<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.2/html5shiv.min.js"></script>
  			<script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
  		<![endif]-->
</head>

<body>
		
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


	<!-- START SECTION -->
	<div class="section hero text-center background-dark dark-bg">
		<div class="background-image"
			style="background: url(<c:url value="/resources/images/hero.jpg" />) no-repeat center center; background-size: cover; opacity: .2;"></div>
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h2>CoDevs</h2>
					<p class="lead">CoDevs è un'azienda di consulenza specializzata
						nel mondo dell'IT. Offriamo servizi alle più grandi aziende
						residenti oggi nel mercato.</p>
					<ul class="list-inline">
					</ul>
				</div>
			</div>
		</div>
	</div>
	<!--/.section -->

	<!-- START SECTION -->
	<div class="section background-light">
		<div class="container">
			<div class="row">
				<div class="col-md-12 text-center">
					<h2 class="section-title">Nostri Servizi</h2>
					<p class="section-description">I nostri maggiori servizi a
						portata di un click!</p>
				</div>
				<div class="col-md-4">
					<div class="service-block text-center">
						<h3>Gestione personale</h3>
					</div>
					<!--/.service-block-->
				</div>
				<div class="col-md-4">
					<div class="service-block text-center">
						<h3>Gestione commesse</h3>
					</div>
					<!--/.service-block-->
				</div>
				<div class="col-md-4">
					<div class="service-block text-center">
						<h3>Gestione rapportini</h3>
					</div>
					<!--/.service-block-->
				</div>
			</div>
		</div>
	</div>
	<!--/.section -->





	<!-- START SECTION -->
	<div class="section hero text-center background-dark dark-bg">
		<div class="background-image"
			style="background: url(<c:url value="/resources/images/hero.jpg" />) no-repeat fixed center center; background-size: cover; opacity: .2;"></div>
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h3
						class="text-uppercase letter-spacing-md font-weight-lg margin-zero">Gestisci
						al meglio tramite CoDevs</h3>
				</div>
			</div>
		</div>
	</div>
	<!--/.section -->

	<!-- START SECTION -->
	<div class="section">
		<div class="container">
			<div class="row">
				<div class="col-md-12 text-center">
					<h2 class="section-title">Supporto</h2>
					<p class="section-description">Per errori o suggerimenti non
						esitare a contattarci.</p>
				</div>
				<div class="col-md-8 col-md-offset-2">
					<form id="contact" method="post" class="form" role="form">
						<div class="row">
							<div class="col-md-6 form-group">
								<input class="form-control" id="name" name="name"
									placeholder="Nome" type="text" required />
							</div>
							<div class="col-md-6 form-group">
								<input class="form-control" id="email" name="email"
									placeholder="Email" type="email" required />
							</div>
						</div>
						<textarea class="form-control" id="message" name="message"
							placeholder="Messaggio" rows="5"></textarea>
						<br />
						<div class="row">
							<div class="col-md-12 form-group">
								<button class="btn btn-primary" type="submit">Invia</button>
							</div>
						</div>
					</form>
				</div>
			</div>
			<!--/.row-->
		</div>
		<!--/.container-->
	</div>
	<!--/.section -->



	<!-- START SECTION -->
	<div class="section background-dark dark-bg">
		<div class="container">
			<div class="row">
				<table width=100% >
					<tr>
						<td width=33.3% align="center">
						<h3 class="text-uppercase font-size-md letter-spacing-md font-weight-lg ">Informazioni</h3>
								<p>Azienda leader del<br> settore nella gestione<br> aziendale e
									della<br> consulenza.</p>
						</td>
						<td width=33.3% align="center">
								<h3 class="text-uppercase font-size-md letter-spacing-md font-weight-lg ">Sede
									Italiana</h3>
								<address>
									Via Principe di Piemonte, 19<br> Casoria, NA, 80026<br>
									<abbr title="Phone">T: </abbr> (123) 456-7890 <br> <a
										href="mailto:#">codevs@newsoft.com</a>
								</address>
						</td>
						<td width=33.3% align="center">
							<!-- Add font awesome icons --> 
							<a href="#" class="fa fa-facebook"></a> 
							<a href="#" class="fa fa-twitter"></a>
							<br>
							
							 <a href="#" class="fa fa-instagram"></a>
							<a href="#" class="fa fa-linkedin"></a>
						</td>
				</table>
			</div>
		</div>
	</div>
	<!--/.section -->


	<!-- jQuery -->
	<script src="//code.jquery.com/jquery.js"></script>
	<!-- Bootstrap JavaScript -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
		integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
		crossorigin="anonymous"></script>
</body>
</html>
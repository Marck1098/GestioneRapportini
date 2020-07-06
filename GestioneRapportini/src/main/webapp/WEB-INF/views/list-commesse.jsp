<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
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
<!-- Style -->
<link href="<c:url value="/resources/css/form.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
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

				<a class="navbar-brand" href="list">CoDevs</a>
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
	<div class="container">
		<div class="col-md-offset-1 col-md-10">
			<h2>Lista</h2>
			<hr />

			<br />
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Clienti</div>
				</div>
				<div class="panel-body">
					<table class="table table-striped table-bordered">
						<tr>
							<th>ID</th>
							<th>Codice</th>
							<th>Nome</th>
							<th>Descrizione</th>
							<th>Partita Iva</th>
							<th></th>
						</tr>

						<!-- loop over and print our customers -->
						<c:forEach var="tempcliente" items="${clienti}">

							<!-- construct an "update" link with customer id -->
							<c:url var="updateLink" value="/cliente/updateForm">
								<c:param name="clienteId" value="${tempcliente.id}" />
							</c:url>

							<!-- construct an "delete" link with customer id -->
							<c:url var="deleteLink" value="/cliente/delete">
								<c:param name="clienteId" value="${tempcliente.id}" />
							</c:url>

							<tr>
								<td>${tempcliente.id}</td>
								<td>${tempcliente.codice}</td>
								<td>${tempcliente.nome}</td>
								<td>${tempcliente.descrizione}</td>
								<td>${tempcliente.piva}</td>
								<td>
									<!-- display the update link --> <a href="${updateLink}">Aggiorna</a>
									| <a href="${deleteLink}"
									onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Elimina</a>
								</td>

							</tr>

						</c:forEach>

					</table>
					<input type="button" value="Aggiungi Cliente"
						onclick="window.location.href='/GestioneRapportini2/cliente/showForm'; return false;"
						class="btn btn-primary" />
				</div>
			</div>
		</div>

	</div>

	<!-- START SECTION -->
	<footer>
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
	</footer>
	<!--/.section -->
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<%@ page isELIgnored="false"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>CoDevs</title>

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
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">

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
					<li><a href="home">Home</a></li>
					<li><a href="login">Login</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Servizi <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="list">List</a></li>
							<li><a href="rapportini">Rapportini</a></li>
							<li><a href="commesse">Commesse</a></li>
						</ul></li>
					<li><a href="#">Contatti</a></li>
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
							<th>id</th>
							<th>codice</th>
							<th>nome</th>
							<th>descrizione</th>
							<th>piva</th>
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
									<!-- display the update link --> <a href="${updateLink}">Update</a>
									| <a href="${deleteLink}"
									onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
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
	<div class="section background-dark dark-bg">
		<div class="container">
			<div class="row">
				<div class="col-md-3">
					<h3
						class="text-uppercase font-size-md letter-spacing-md font-weight-lg ">About
						Us</h3>
					<p>Sed egestas, ante et vulputate volutpat, eros pede semper
						est, vitae luctus metus libero eu augue. Morbi purus libero,
						faucibus adipiscing, commodo quis, gravida id, est.</p>
					<p>Sed tempus feugiat adipiscing nisl cursus aliquam dolore.</p>
				</div>
				<div class="col-md-4 col-md-offset-1">
					<h3
						class="text-uppercase font-size-md letter-spacing-md font-weight-lg ">USA
						Office</h3>
					<address>
						<strong>Twitter, Inc.</strong><br> 1355 Market Street, Suite
						900<br> San Francisco, CA 94103<br> <abbr title="Phone">P:</abbr>
						(123) 456-7890
					</address>
					<address>
						<strong>Full Name</strong><br> <a href="mailto:#">first.last@example.com</a>
					</address>
				</div>
				<div class="col-md-4">
					<h3
						class="text-uppercase font-size-md letter-spacing-md font-weight-lg ">UK
						Office</h3>
					<address>
						<strong>Twitter, Inc.</strong><br> 1355 Market Street, Suite
						900<br> San Francisco, CA 94103<br> <abbr title="Phone">P:</abbr>
						(123) 456-7890
					</address>
					<address>
						<strong>Full Name</strong><br> <a href="mailto:#">first.last@example.com</a>
					</address>
				</div>
				<div class="col-md-12 margin-top-md margin-bottom-md"
					style="opacity: .2;">
					<hr />
				</div>
				<div
					class="col-md-12 margin-top-md text-center font-size-sm text-upercase">
					<p>
						© <a href="http://nomadtheme.com" title="nomadtheme"><strong>Nomad
								Theme</strong></a>. Images: <a href="http://picjumbo.com" title="PicJumbo"><strong>Pic
								Jumbo</strong></a>. By: <a href="http://freebootstraptemplate.com"
							title="Free Bootstrap Template"><strong>Free
								Bootstrap Template</strong></a>.
					</p>
				</div>
			</div>
		</div>
	</div>
	<!--/.section -->

</body>
</html>
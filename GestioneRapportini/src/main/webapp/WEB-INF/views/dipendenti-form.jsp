<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CoDevs</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>

<body>
		<c:set var="log" value="utenteNonLoggato" />
		<c:if test="${utente.stato eq log}">
		<c:redirect url = "http://localhost:8080/GestioneRapportini2/login"/>
		</c:if>
	<br>
	<br>

	<br>
	<br>

	<div class="container">
		<div class="col-md-offset-2 col-md-7">
			<div class="panel panel-info">
				<div class="panel-heading">

					<div class="panel-title">Dipendente</div>
				</div>
				<div class="panel-body">
					<form:form name="dipendentiForm" action="saveDipendente"
						cssClass="form-horizontal" method="post" modelAttribute="dipendente">

						<!-- need to associate this data with client id -->
						<label for="msg"> <%
 						Object msg = request.getAttribute("msg");
 						if (msg != null && msg != "") {
 						out.println("<label><font color=\"#E42217\"><b>" + msg + "</b></font></label> "); }
 						%>
						</label>
						<form:hidden path="id" />

						<div class="form-group">
							<label for="matricola" class="col-md-3 control-label">Matricola</label>
							<div class="col-md-9">
								<form:input path="matricola" cssClass="form-control"
									class="required" />
							</div>
						</div>
						<div class="form-group">
							<label for="nome" class="col-md-3 control-label">Nome</label>
							<div class="col-md-9">
								<form:input path="nome" cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="cognome" class="col-md-3 control-label">Cognome</label>
							<div class="col-md-9">
								<form:input path="cognome" cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="codfiscale" class="col-md-3 control-label">Codfiscale</label>
							<div class="col-md-9">
								<form:input path="codfiscale" cssClass="form-control" />
							</div>
						</div>
						
						<div class="form-group">
							<label for="password" class="col-md-3 control-label">Password</label>
							<div class="col-md-9">
								<form:input path="password" cssClass="form-control" />
							</div>
						</div>
						
						<div class="form-group">
							<label for="residenza" class="col-md-3 control-label">Residenza</label>
							<div class="col-md-9">
								<form:input path="residenza" cssClass="form-control" />
							</div>
						</div>
						
						<div class="form-group">
							<label for="numerotelefono" class="col-md-3 control-label">Numero Telefono</label>
							<div class="col-md-9">
								<form:input path="numerotelefono" cssClass="form-control" />
							</div>
						</div>
						
						<div class="form-group">
							<label for="stipendioannuo" class="col-md-3 control-label">Stipendio Annuo</label>
							<div class="col-md-9">
								<form:input path="stipendioannuo" cssClass="form-control" />
							</div>
						</div>
						
						<div class="form-group">
							<!-- Button -->
							<div class="col-md-offset-3 col-md-9">
								<form:button cssClass="btn btn-primary" onclick="validateForm()">Invia</form:button>
							</div>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>


</body>
</html>

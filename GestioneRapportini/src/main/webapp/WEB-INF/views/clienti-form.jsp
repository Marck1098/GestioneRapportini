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

					<div class="panel-title">Cliente</div>
				</div>
				<div class="panel-body">
					<form:form name="clienteForm" action="saveClienti"
						cssClass="form-horizontal" method="post" modelAttribute="cliente">

						<!-- need to associate this data with client id -->
						<label for="msg"> <%
 						Object msg = request.getAttribute("msg");
 						if (msg != null && msg != "") {
 						out.println("<label><font color=\"#E42217\"><b>" + msg + "</b></font></label> "); }
 						%>
						</label>
						<form:hidden path="id" />

						<div class="form-group">
							<label for="codice" class="col-md-3 control-label">Codice</label>
							<div class="col-md-9">
								<form:input path="codice" cssClass="form-control"
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
							<label for="descrizione" class="col-md-3 control-label">Descrizione</label>
							<div class="col-md-9">
								<form:input path="descrizione" cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="piva" class="col-md-3 control-label">Partita Iva</label>
							<div class="col-md-9">
								<form:input path="piva" cssClass="form-control" />
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

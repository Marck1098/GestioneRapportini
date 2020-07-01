<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC 5 - form handling | Java Guides</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"  rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
 <div class="container">
  <div class="col-md-offset-2 col-md-7">
   <h2 class="text-center">Spring MVC 5 + Hibernate 5 + JSP + MySQL
    Example</h2>
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Add Clienti</div>
    </div>
    <div class="panel-body">
     <form:form action="saveClienti" cssClass="form-horizontal"
      method="post" modelAttribute="customer">

      <!-- need to associate this data with client id -->
      
      <form:hidden path="id" />

      <div class="form-group">
       <label for="codice" class="col-md-3 control-label">codice</label>
       <div class="col-md-9">
        <form:input path="codice" cssClass="form-control" />
       </div>
      </div>

      <div class="form-group">
       <label for="nome" class="col-md-3 control-label">nome</label>
       <div class="col-md-9">
        <form:input path="nome" cssClass="form-control" />
       </div>
      </div>
<div class="form-group">
       <label for="descrizione" class="col-md-3 control-label">descrizione</label>
       <div class="col-md-9">
        <form:input path="descrizione" cssClass="form-control" />
       </div>
      </div>
      <div class="form-group">
       <label for="piva" class="col-md-3 control-label">piva</label>
       <div class="col-md-9">
        <form:input path="piva" cssClass="form-control" />
       </div>
      </div>
      <div class="form-group">
       <!-- Button -->
       <div class="col-md-offset-3 col-md-9">
        <form:button cssClass="btn btn-primary">Submit</form:button>
       </div>
      </div>

     </form:form>
    </div>
   </div>
  </div>
 </div>
</body>
</html>
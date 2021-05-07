<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org"
 xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">

<link rel="stylesheet" type="text/css"
href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
 <script src="webjars/jquery/3.5.1/jquery.min.js"></script>
 <script type="text/javascript"
src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<head>
<meta charset="utf-8">
<title>Gestion des Membres</title>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
 <!-- Brand -->
 <a class="navbar-brand" href="#">Gestion Membres</a>
 <!-- Links -->
 <ul class="navbar-nav">
 <li class="nav-item">
 <a class="nav-link" th:href="@{ListeMembres}" >Listes</a>
 </li>
 <!-- Dropdown -->
 <li class="nav-item dropdown">
 <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
 Membres
 </a>
 <div class="dropdown-menu">
 <a class="dropdown-item" th:href="@{showCreate}">Ajouter</a>
 <a class="dropdown-item" th:href="@{ListeMembres}">Lister</a>
 </div>
 </li>
 </ul>

 <ul class="navbar-nav ml-auto" >
 <li class="nav-item dropdown">
 <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
 Manar Ben Nourreddine
 </a>
 <div class="dropdown-menu">
 <a class="dropdown-item" href="#">login</a>
 <a class="dropdown-item" href="#">logout</a>
 <a class="dropdown-item" href="#">Profile</a>
 </div>
 </li>
 </ul>
</nav>
<section layout:fragment="Mycontent" >
</section>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<script type="text/javascript"
src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Modifier un Membre</title>
</head>
<body>
<div class="container mt-5">
<div class="card-body">
<form action="updateMembre" method="post">
 <div class="form-group">
 <label class="control-label">ID Membre :</label>
 <input type="text" name="idMembre" value="${membre.idMembre}" readonly class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Nom Membre :</label>
 <input type="text" name="nomMembre" value="${membre.nomMembre}"
class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Numero Membre :</label>
 <input type="text" name="numMembre" value="${membre.numMembre}"
class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label"> Date Inscription :</label>
 <fmt:formatDate pattern="yyyy-MM-dd" value="${membre.dateInscription}" var="formatDate" />
 <input type="date" name="date" value="${formatDate}" class="formcontrol"/>
 </div>
 <div>
 <button type="submit" class="btn btn-primary">Modifier</button>
</div>
</form>
</div>
<br/>
<br/>
<a href="ListeMembres">Liste Membres</a>
</div>
</body>
</html>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Shop Homepage - Start Bootstrap Template</title>
<script type="text/javascript">
	window.menu = "${page}";
</script>
<!-- Bootstrap core CSS -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/r-theme.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="resources/css/shop-homepage.css" rel="stylesheet">
</head>
<body>
	<div class="wrapper">
		<%@include file="public/menu.jsp"%>
		<!-- Page Content -->
		<div class="container">
			
			<!-- page content add -->
			<c:if test="${userClickAbout}">
				<%@include file="pages/about.jsp"%>
			</c:if>
			<c:if test="${userClickContact}">
				<%@include file="pages/contact.jsp"%>
			</c:if>
			<c:if test="${userClickHome}">
				<%@include file="pages/home.jsp"%>
			</c:if>
		</div>
		<!-- /.container -->

		<%@include file="public/footer.jsp"%>

		<!-- Bootstrap core JavaScript -->
		<script src="resources/js/jquery.min.js"></script>
		<script src="resources/js/bootstrap.bundle.min.js"></script>
		<!-- self coded JavaScript -->
		<script src="resources/js/myapp.js"></script>
	</div>
</body>
</html>
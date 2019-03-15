<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" class="no-js">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description"
	content="Multi-Level Push Menu: Off-screen navigation with multiple levels" />
<meta name="keywords"
	content="multi-level, menu, navigation, off-canvas, off-screen, mobile, levels, nested, transform" />
<meta name="author" content="Codrops" />
<link rel="shortcut icon" href="../favicon.ico">
<link rel="stylesheet" type="text/css" href="resources/css/normalize.css" />
<link rel="stylesheet" type="text/css" href="resources/css/demo.css" />
<link rel="stylesheet" type="text/css" href="resources/css/icons.css" />
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" type="text/css" href="resources/css/component.css" />

<script src="resources/js/modernizr.custom.js"></script>
<title>${contextRoot}sys -${page}</title>
</head>
<body>
	<div class="container">
		<%@include file="public/menu.jsp" %>
		<div class="scroller"><!-- this is for emulating position fixed of the nav -->
					<%@include file="public/header.jsp" %>
				</div><!-- /scroller -->
			<%@include file="public/footer.jsp" %>
			</div><!-- /pusher -->
			
		</div><!-- /container -->
		<script src="resources/js/classie.js"></script>
		<script src="resources/js/mlpushmenu.js"></script>
		<script>
			new mlPushMenu( document.getElementById( 'mp-menu' ), document.getElementById( 'trigger' ) );
		</script>
</body>
</html>
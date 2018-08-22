<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@page import="modelo.usuario" %>
 <% 
 int cabina=0;
 String url="";
 HttpSession sesionOk=request.getSession();
 if(sesionOk.getAttribute("datos")==null){
 %>
 <<jsp:forward page="index.jsp">
 	<jsp:param value="error" name="Es obligatorio identificarse"/>
 </jsp:forward>
 <%
 }else{
	 usuario user=(usuario)session.getAttribute("datos");
	 cabina=user.getCabina();
	 if(cabina==6){
		 url="href='generar-santander.jsp'";
		 
	 }else{ 
		 url="href='generar.jsp'";
		 
	 }
 }
 %>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inicio</title>
</head>
<body>
<h1>Bienvenido Operador</h1>
<div>
	<ul>
		<li><a <%=url%>>Generar reporte</a></li>
		<li><a>Buscar reporte</a></li>
		<li><a>Administrar reporte</a></li>
	</ul>
</div>
</body>
</html>
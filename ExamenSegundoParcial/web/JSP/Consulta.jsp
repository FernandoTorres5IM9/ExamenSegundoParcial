<%-- 
    Document   : Consulta
    Created on : 18/10/2018, 07:27:36 AM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="mx.edu.ipn.cecyt9.edusite.model.Info" %>

<!DOCTYPE html>
<c:if test="request.getAttribute('Registros')!=null">
    <c:set var="Registros"></c:set>  <c:out value="Sí hay registros"></c:out>
</c:if>
    <%
       String nombre, apePAT, apeMAT, Esc, Mat, Dep;
       nombre = request.getAttribute("Nombre");
       apePAT = request.getAttribute("apePAT");
    %>
<jsp:useBean id="Info" scope="page" class="mx.edu.ipn.cecyt9.edusite.model.Info" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        Nombre:
        Apellido Materno:
        Apellido Paterno:
        Escuela:
        Materia Favorita:
        Deporte Favorito:
    </body>
</html>

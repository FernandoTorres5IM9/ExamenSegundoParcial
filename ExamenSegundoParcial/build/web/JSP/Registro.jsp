<%-- 
    Document   : Registro
    Created on : 18/10/2018, 07:27:24 AM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro</h1>
        <form method="POST" action="../RegistroServlet">
            Nombre: <input type="text" name="NOMBRE" id="NOMBRE"><br><br>
            Apellido Paterno:<input type="text" name="APELLIDOPAT" id="APELLIDOPAT"><br><br>
            Apellido Materno:<input type="text" name="APELLIDOMAT" id="APELLIDOMAT"><br>
            Escuela:<input type="text" name="ESCUELA" id="ESCUELA"><br>
            Materia Favorita:<input type="text" name="MATERIA" id="MATERIA"><br>
            Deporte Favorita:<input type="text" name="DEPORTE" id="DEPORTE"><br>
            <input type="submit" value="aceptar">
        </form>
    </body>
</html>

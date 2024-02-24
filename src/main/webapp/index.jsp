<!DOCTYPE html>
<html lang="es">
<head>
<%@ page contentType="text/html; charset=UTF-8" %>
<title>Fomulario</title>
</head>
<body>
     <div>
         <h2>Formulario Servlet</h2>
         <form action="myServlet2" method="get">
             <label for="nombre">Nombre:</label>
             <input type="text" id="nombre" name="nombre"><br><br>
             <label for="apellidos">Apellido:</label>
             <input type="text" id="apellidos" name="apellidos"><br><br>
             <label for="genero">Género:</label>
             <input type="radio" id="genero" name="genero" value="Bienvenido"/>Hombre
             <input type="radio" id="genero" name="genero" value="Bienvenida"/>Mujer<br><br>
             <input type="submit" value="Enviar"/>
         </form>
     </div>
</body>
</html>
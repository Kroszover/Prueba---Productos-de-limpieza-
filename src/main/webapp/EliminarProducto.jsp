<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eliminar Producto</title>
</head>
<body>
<h1>Eliminar Bicicleta</h1>
<p>¿Estas seguro de eliminar el producto?</p>
<form action="/EliminarProducto" method = "POST">
	<input type= "hidden" value="${id}" name="id">
	<button type="submit"> si</button>
	<a href="/">No</a>
</form>
	<a href="/Prueba_-_Productos_de_Limpieza">Volver al inicio</a>

</body>
</html>
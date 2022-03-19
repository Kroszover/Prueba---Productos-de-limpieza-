<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Eliminar Producto</title>
</head>
<body>
<h1>Eliminar Producto</h1>
<p>¿Estas seguro de eliminar el producto?</p>
<form action="EliminarProducto" method = "POST">
	<input type= "hidden" value="${id}" name="id">
	<button type="submit"> si</button>
	<a href="/Prueba_-_Productos_de_Limpieza">No</a>
</form>
	<a href="/Prueba_-_Productos_de_Limpieza">Volver al inicio</a>

</body>
</html>
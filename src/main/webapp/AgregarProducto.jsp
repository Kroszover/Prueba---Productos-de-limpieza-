<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agregar Producto</title>
</head>
<body>
<h1>Agregar Producto</h1>
<form action="/AgregarProducto" method="POST">
	<Label for = "nombre">Nombre</Label>
	<input type = "text" name= "nombre" id="nombre"/>
	<Label for = "precio">Precio</Label>
	<input type = "number" name= "precio" id="precio"/>
	<Label for = "descripcion">Descripcion</Label>
	<input type = "text" name= "descripcion" id="descripcion"/>
	<Label>Categoria</Label>
	<select name="categoria" id="categoria">
	<c:forEach items="${categorias}" var= "categoria">
	<option value="${categoria.getIdCategoria()}">${categoria.getNombreCategoria()}</option>
	</c:forEach>
	</select>
	<button type= "submit">Enviar</button>
</form>
<a href="/Prueba_-_Productos_de_Limpieza">Volver al inicio</a>
</body>
</html>

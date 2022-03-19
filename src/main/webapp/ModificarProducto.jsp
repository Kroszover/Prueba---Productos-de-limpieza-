<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modificar Producto</title>
</head>
<body>
<h1>Modificar Producto</h1>
<form action="/ModificarProducto" method="POST">
	<input type = "hidden" value="${producto.getId()" name="id_producto"/>
	<Label for = "nombre">Nombre</Label>
	<input type = "text" name= "nombre" id="nombre" value="${producto.getNombre()}"/>
	<Label for = "precio">Precio</Label>
	<input type = "number" name= "precio" id="precio" value= "${producto.getPrecio}"/>
	<Label for = "descripcion">Descripcion</Label>
	<input type = "text" name= "descripcion" id="descripcion" value="${producto.getDescripcion}"/>
	<Label>Categoria</Label>
	<select name="categoria" id="categoria">
	<c:forEach items="${categorias}" var= "categoria">
	<option value="${categoria.getId()}"
	
	${categoria.getId() == producto.getIdCategoria() ? 'selected' : ''}>${categoria.getNombre()}</option>
	</c:forEach>
	</select>
	<button type= "submit">Enviar</button>
</form>
<a href="/">Volver al inicio</a>

</body>
</html>